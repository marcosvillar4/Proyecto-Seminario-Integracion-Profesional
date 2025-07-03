import * as functions from "firebase-functions/v1";
import * as admin from "firebase-admin";

import fetch from "node-fetch";


import {Mision} from "./types";
import {MisionProvider} from "./missionProvider";

admin.initializeApp();
const db = admin.firestore();


// --- Parámetros de moderación ---
const PERSPECTIVE_URL = "https://commentanalyzer.googleapis.com/v1alpha1/comments:analyze";
const TOXICITY_THRESHOLD = 0.7;
const PROFANITY_THRESHOLD = 0.7;

// Recupera la clave de config
const API_KEY = functions.config().perspective?.key;
if (!API_KEY) {
  console.error("⚠️ La perspective.key NO está configurada. Ejecuta:");
  console.error("   firebase functions:config:set perspective.key=\"TU_API_KEY\"");
}

export const getGroupRanking = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError(
        "unauthenticated",
        "Debes iniciar sesión."
      );
    }

    // 2) Validar parámetro
    const groupId = (data.groupId as string || "").trim();
    if (!groupId) {
      throw new functions.https.HttpsError("invalid-argument", "Falta groupId.");
    }

    // 3) Leer grupo
    const groupSnap = await db.collection("groups").doc(groupId).get();
    if (!groupSnap.exists) {
      throw new functions.https.HttpsError("not-found", "Grupo no encontrado.");
    }
    const memberIds = (groupSnap.get("memberIds") as string[]) || [];
    if (memberIds.length === 0) {
      return { ranking: [] };
    }

    // 4) Leer perfiles para puntos
    const profileSnaps = await Promise.all(
      memberIds.map((m) => db.collection("userProfiles").doc(m).get())
    );
    const pointsMap = new Map<string, number>();
    profileSnaps.forEach((snap) => {
      const pts = (snap.get("accumulatedPoints") as number) ?? 0;
      pointsMap.set(snap.id, pts);
    });

    // 5) Leer usuarios para nombres/emails
    const userSnaps = await Promise.all(
      memberIds.map((m) => db.collection("users").doc(m).get())
    );

    // 6) Construir array, ordenar y numerar
    const items = userSnaps
      .map((snap) => {
        const name =
          (snap.get("displayName") as string) ||
          (snap.get("email") as string) ||
          "";
        return {
          name,
          points: pointsMap.get(snap.id) || 0,
        };
      })
      .sort((a, b) => b.points - a.points)
      .map((it, idx) => ({ name: it.name, points: it.points, rank: idx + 1 }));

    return { ranking: items };
  }
);

export const joinByCode = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError(
        "unauthenticated",
        "Debes iniciar sesión para unirte."
      );
    }
    const uid = context.auth.uid;
    const email = (context.auth.token.email as string) || "";
    const code = (data.code as string || "").trim().toUpperCase();
    if (!code) {
      throw new functions.https.HttpsError(
        "invalid-argument",
        "El código no puede estar vacío."
      );
    }

    const now = admin.firestore.FieldValue.serverTimestamp();

    // 2) Intentar organización primero
    const orgSnap = await db
      .collection("organizations")
      .where("code", "==", code)
      .limit(1)
      .get();

    if (!orgSnap.empty) {
      const orgDoc = orgSnap.docs[0];
      const orgData = orgDoc.data()!;
      if ((orgData.emails as string[]).includes(email)) {
        throw new functions.https.HttpsError(
          "already-exists",
          "Ya eres miembro de esta organización."
        );
      }
      // 3) Transacción de org
      await db.runTransaction(async (tx) => {
        tx.update(orgDoc.ref, {
          memberIds: admin.firestore.FieldValue.arrayUnion(uid),
          emails: admin.firestore.FieldValue.arrayUnion(email),
          memberCount: admin.firestore.FieldValue.increment(1),
          updatedAt: now,
        });
        tx.set(
          db.collection("userProfiles").doc(uid),
          {
            organizationIds: admin.firestore.FieldValue.arrayUnion(orgDoc.id),
            updatedAt: now,
          },
          { merge: true }
        );
      });
      return { type: "organization", id: orgDoc.id };
    }

    // 4) Si no es org, buscar grupo personal
    const grpSnap = await db
      .collection("groups")
      .where("code", "==", code)
      .where("type", "==", "personal")
      .limit(1)
      .get();

    if (grpSnap.empty) {
      throw new functions.https.HttpsError(
        "not-found",
        "Código inválido."
      );
    }
    const grpDoc = grpSnap.docs[0];
    const grpData = grpDoc.data()!;
    if ((grpData.emails as string[]).includes(email)) {
      throw new functions.https.HttpsError(
        "already-exists",
        "Ya eres miembro de este grupo."
      );
    }

    // 5) Transacción de grupo
    await db.runTransaction(async (tx) => {
      tx.update(grpDoc.ref, {
        memberIds: admin.firestore.FieldValue.arrayUnion(uid),
        emails: admin.firestore.FieldValue.arrayUnion(email),
        memberCount: admin.firestore.FieldValue.increment(1),
        updatedAt: now,
      });
      tx.set(
        db.collection("userProfiles").doc(uid),
        {
          groupIds: admin.firestore.FieldValue.arrayUnion(grpDoc.id),
          updatedAt: now,
        },
        { merge: true }
      );
    });
    return { type: "group", id: grpDoc.id };
  }
);

export const validateEmailsExist = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación opcional (si quieres permitirlo solo a usuarios logueados)
    if (!context.auth) {
      throw new functions.https.HttpsError("unauthenticated",
        "Debes iniciar sesión para validar correos.");
    }

    // 2) Parámetro
    const raw = data.emails;
    if (!Array.isArray(raw)) {
      throw new functions.https.HttpsError("invalid-argument",
        "Se necesita un arreglo de correos.");
    }
    const emails = raw
      .map((e) => (typeof e === "string" ? e.trim().toLowerCase() : ""))
      .filter((e) => e);

    // 3) Particionar en chunks ≤10
    const chunks: string[][] = [];
    for (let i = 0; i < emails.length; i += 10) {
      chunks.push(emails.slice(i, i + 10));
    }

    const existents = new Set<string>();
    const notExistents = new Set(emails);

    // 4) Para cada chunk, buscamos en /users
    await Promise.all(
      chunks.map(async (batch) => {
        const snap = await db
          .collection("users")
          .where("email", "in", batch)
          .get();
        snap.docs.forEach((d) => {
          const e = (d.get("email") as string).toLowerCase();
          existents.add(e);
          notExistents.delete(e);
        });
      })
    );

    return {
      existents: Array.from(existents),
      notExistents: Array.from(notExistents),
    };
  }
);




export const removeGroupMember = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError("unauthenticated", "Debes iniciar sesión.");
    }
    const requesterUid = context.auth.uid;
    const targetUid     = (data.memberUid as string || "").trim();
    const emailToRemove = (data.memberEmail as string || "").trim().toLowerCase();
    const groupId       = (data.groupId as string || "").trim();

    if (!targetUid || !groupId || !emailToRemove) {
      throw new functions.https.HttpsError("invalid-argument","Faltan parámetros.");
    }

    const grpRef = db.collection("groups").doc(groupId);
    await db.runTransaction(async tx => {
      const snap = await tx.get(grpRef);
      if (!snap.exists) {
        throw new functions.https.HttpsError("not-found","Grupo no encontrado.");
      }
      const grp = snap.data()!;
      // Sólo owner o el propio usuario puede quitarse a sí mismo
      const isOwner = grp.ownerUid === requesterUid;
      if (!(isOwner || requesterUid === targetUid)) {
        throw new functions.https.HttpsError("permission-denied","No tienes permiso.");
      }

      const memberIds = (grp.memberIds as string[]) || [];
      if (!memberIds.includes(targetUid)) {
        throw new functions.https.HttpsError("failed-precondition","Ese usuario no está en el grupo.");
      }

      // Construir nuevos arrays
      const newMemberIds = memberIds.filter(uid => uid !== targetUid);
      const emails       = (grp.emails  as string[]) || [];
      const newEmails    = emails.filter(e => e.toLowerCase() !== emailToRemove);

      // Si queda vacío y no derivado, borramos el doc
      const isDerivado = grp.derivado === true;
      if (newMemberIds.length === 0 && !isDerivado) {
        tx.delete(grpRef);
      } else {
        const updates: any = {
          memberIds:   newMemberIds,
          emails:      newEmails,
          memberCount: newMemberIds.length,
          updatedAt:   admin.firestore.FieldValue.serverTimestamp()
        };
        // Si el que sale era owner, reasignar
        if (grp.ownerUid === targetUid && newMemberIds.length) {
          updates.ownerUid = newMemberIds[0];
        }
        tx.update(grpRef, updates);
      }

      // Siempre removemos del perfil
      const profRef = db.collection("userProfiles").doc(targetUid);
      tx.set(profRef, {
        groupIds: admin.firestore.FieldValue.arrayRemove(groupId),
        updatedAt: admin.firestore.FieldValue.serverTimestamp()
      }, { merge: true });
    });

    return { success: true };
  }
);


export const addGroupMember = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError("unauthenticated", "Debes iniciar sesión.");
    }
    const requesterUid = context.auth.uid;
    const emailToAdd = (data.email as string || "").trim().toLowerCase();
    const groupId   = (data.groupId as string || "").trim();
    if (!emailToAdd || !groupId) {
      throw new functions.https.HttpsError("invalid-argument", "Falta groupId o email.");
    }

    // 2) Buscar usuario destino
    const userSnap = await db.collection("users")
      .where("email", "==", emailToAdd)
      .limit(1)
      .get();
    if (userSnap.empty) {
      throw new functions.https.HttpsError("not-found", `El email ${emailToAdd} no está registrado.`);
    }
    const targetUid = userSnap.docs[0].id;

    // 3) Leer grupo y validar permisos
    const grpRef = db.collection("groups").doc(groupId);
    const grpSnap = await grpRef.get();
    if (!grpSnap.exists) {
      throw new functions.https.HttpsError("not-found", "Grupo no encontrado.");
    }
    const grp = grpSnap.data()!;
    // Sólo el owner puede invitar:
    if ((grp.ownerUid as string) !== requesterUid) {
      throw new functions.https.HttpsError("permission-denied", "Solo el propietario puede agregar miembros.");
    }
    const existingEmails = Array.isArray(grp.emails) ? grp.emails as string[] : [];
    if (existingEmails.includes(emailToAdd)) {
      throw new functions.https.HttpsError("already-exists", "Ese usuario ya es miembro.");
    }

    // 4) Transacción: actualizar grupo y perfil
    const now = admin.firestore.FieldValue.serverTimestamp();
    await db.runTransaction(async tx => {
      tx.update(grpRef, {
        memberIds: admin.firestore.FieldValue.arrayUnion(targetUid),
        emails:    admin.firestore.FieldValue.arrayUnion(emailToAdd),
        memberCount: admin.firestore.FieldValue.increment(1),
        updatedAt: now
      });
      const profileRef = db.collection("userProfiles").doc(targetUid);
      tx.set(profileRef, {
        groupIds: admin.firestore.FieldValue.arrayUnion(groupId),
        updatedAt: now
      }, { merge: true });
    });

    return { success: true };
  }
);



export const joinPersonalGroup = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError("unauthenticated", "Debes iniciar sesión.");
    }
    const uid = context.auth.uid;
    const email = (context.auth.token.email as string) || "";
    const code = (data.code as string || "").trim().toUpperCase();
    if (!code) {
      throw new functions.https.HttpsError("invalid-argument", "El código no puede estar vacío.");
    }

    // 2) Buscar grupo personal por código
    const grpSnap = await db
      .collection("groups")
      .where("code", "==", code)
      .where("type", "==", "personal")
      .limit(1)
      .get();

    if (grpSnap.empty) {
      throw new functions.https.HttpsError("not-found", "Código de grupo inválido.");
    }

    const doc = grpSnap.docs[0];
    const groupId = doc.id;
    const dataGrp = doc.data();
    const existingEmails = Array.isArray(dataGrp.emails) ? dataGrp.emails as string[] : [];
    if (existingEmails.includes(email)) {
      throw new functions.https.HttpsError("already-exists", "Ya eres miembro de este grupo.");
    }

    // 3) En transacción, unir al usuario
    const now = admin.firestore.FieldValue.serverTimestamp();
    await db.runTransaction(async tx => {
      const gRef = db.collection("groups").doc(groupId);
      tx.update(gRef, {
        memberIds: admin.firestore.FieldValue.arrayUnion(uid),
        emails:    admin.firestore.FieldValue.arrayUnion(email),
        memberCount: admin.firestore.FieldValue.increment(1),
        updatedAt: now
      });
      const pRef = db.collection("userProfiles").doc(uid);
      tx.set(pRef, {
        groupIds: admin.firestore.FieldValue.arrayUnion(groupId),
        updatedAt: now
      }, { merge: true });
    });

    return { groupId };
  }
);

export const createPersonalGroup = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError(
        "unauthenticated",
        "Debes iniciar sesión para crear un grupo."
      );
    }
    const ownerUid = context.auth.uid;
    const ownerEmail = (context.auth.token.email as string) || "";

    // 2) Validar parámetros
    const name = (data.name as string || "").trim();
    const emailsRaw = Array.isArray(data.emails) ? data.emails as string[] : [];
    const hobby = typeof data.hobby === "string" ? data.hobby.trim() : null;
    if (!name) {
      throw new functions.https.HttpsError("invalid-argument", "El nombre no puede estar vacío.");
    }

    // 3) Normalizar y deduplicar correos (sin eliminar al owner si acaso)
    const invites = Array.from(new Set(
      emailsRaw.map(e => e.trim().toLowerCase())
           .filter(e => e && e !== ownerEmail)
    ));

    // 4) Obtener documentos de usuarios por email
    const usersSnap = await db
      .collection("users")
      .where("email", "in", [ownerEmail, ...invites])
      .get();

    // 5) Verificar que todos los emails existan
    const foundEmails = usersSnap.docs.map(d => d.get("email") as string);
    const missing = [ownerEmail, ...invites].filter(e => !foundEmails.includes(e));
    if (missing.length) {
      throw new functions.https.HttpsError(
        "not-found",
        `Los siguientes correos no están registrados: ${missing.join(", ")}`
      );
    }

    // 6) Mapear email→uid
    const emailToUid = new Map<string, string>();
    usersSnap.docs.forEach(d => emailToUid.set(d.get("email") as string, d.id));

    // 7) Construir listas de miembros
    const memberIds = Array.from(new Set([
      ownerUid,
      ...invites.map(e => emailToUid.get(e)!)
    ]));
    const emailsList = Array.from(new Set([ownerEmail, ...invites]));

    // 8) Generar código único
    let code: string;
    do {
      code = generateRandomCode();
      const dup = await db
        .collection("groups")
        .where("code", "==", code)
        .limit(1)
        .get();
      if (dup.empty) break;
    } while (true);

    // 9) Crear el documento del grupo
    const groupId = db.collection("groups").doc().id;
    const now = admin.firestore.FieldValue.serverTimestamp();
    await db.collection("groups").doc(groupId).set({
      name,
      code,
      type: "personal",
      hobby,
      derivado: false,
      organizationId: null,
      ownerUid,
      memberIds,
      memberCount: memberIds.length,
      emails: emailsList,
      createdAt: now,
      updatedAt: now
    });

    // 10) Actualizar todos los perfiles de usuario
    const batch = db.batch();
    for (const uid of memberIds) {
      const pref = db.collection("userProfiles").doc(uid);
      batch.set(pref, {
        groupIds: admin.firestore.FieldValue.arrayUnion(groupId),
        updatedAt: now
      }, { merge: true });
    }
    await batch.commit();

    // 11) Devolver código para compartir
    return { groupId, code };
  }
);

export const onUserHobbiesChange = functions
  .firestore
  .document("userProfiles/{uid}")
  .onUpdate(async (change, context) => {
    const before = change.before.data()!;
    const after  = change.after.data()!;
    const uid    = context.params.uid as string;

    const oldHobbies = Array.isArray(before.hobbies) ? before.hobbies as string[] : [];
    const newHobbies = Array.isArray(after.hobbies) ? after.hobbies as string[] : [];
    const added   = newHobbies.filter(h => !oldHobbies.includes(h));
    const removed = oldHobbies.filter(h => !newHobbies.includes(h));

    // Si no hubo cambio neto, salimos
    if (added.length === 0 && removed.length === 0) return;

    // 1) Buscar organizaciones donde es miembro
    const orgsSnap = await db
      .collection("organizations")
      .where("memberIds", "array-contains", uid)
      .get();

    for (const orgDoc of orgsSnap.docs) {
      const orgId = orgDoc.id;
      const orgData = orgDoc.data();
      const orgName = orgData.name as string;
      const derivedRaw = Array.isArray(orgData.gruposDerivados)
        ? orgData.gruposDerivados as Array<{ hobby: string; groupId: string }>
        : [];
      const uniqueRaw = Array.isArray(orgData.hobbiesUnicos)
        ? orgData.hobbiesUnicos as Array<{ hobby: string; userId: string }>
        : [];

      const derived = [...derivedRaw];
      let unique = [...uniqueRaw];

      // 2) Eliminar hobbiesUnicos correspondentes a `removed`
      unique = unique.filter(u => !(u.userId === uid && removed.includes(u.hobby)));

      // 3) Para cada hobby añadido:
      for (const hobby of added) {
        // 3.a) ¿ya existe grupo derivado?
        const existing = derived.find(d => d.hobby === hobby);
        if (existing) {
          // añadir usuario al grupo
          await db.collection("groups").doc(existing.groupId).update({
            memberIds:   admin.firestore.FieldValue.arrayUnion(uid),
            emails:      admin.firestore.FieldValue.arrayUnion(after.email || ""),
            memberCount: admin.firestore.FieldValue.increment(1),
            updatedAt:   admin.firestore.FieldValue.serverTimestamp(),
          });
          continue;
        }
        // 3.b) ¿estaba único?
        const idx = unique.findIndex(u => u.hobby === hobby);
        if (idx >= 0) {
          const otherUid = unique[idx].userId;
          unique.splice(idx, 1);

          // crear nuevo grupo derivado entre otherUid y uid
          const code = generateRandomCode();
          const newGroupId = db.collection("groups").doc().id;
          // construimos payload
          const groupData: any = {
            name:            `${orgName} – ${hobby}`,
            code,
            type:            "personal",
            derivado:        true,
            hobby,
            organizationId:  orgId,
            ownerUid:        otherUid,
            memberIds:       [otherUid, uid],
            emails:          [],
            memberCount:     2,
            createdAt:       admin.firestore.FieldValue.serverTimestamp(),
            updatedAt:       admin.firestore.FieldValue.serverTimestamp(),
          };
          // obtener emails
          const [snap1, snap2] = await Promise.all([
            db.collection("users").doc(otherUid).get(),
            db.collection("users").doc(uid).get(),
          ]);
          groupData.emails = [
            (snap1.get("email")  as string) || "",
            (snap2.get("email")  as string) || "",
          ];
          // guardar grupo
          await db.collection("groups").doc(newGroupId).set(groupData);
          // actualizar perfiles
          const batch = db.batch();
          for (const m of [otherUid, uid]) {
            batch.set(
              db.collection("userProfiles").doc(m),
              { groupIds: admin.firestore.FieldValue.arrayUnion(newGroupId),
                updatedAt: admin.firestore.FieldValue.serverTimestamp() },
              { merge: true }
            );
          }
          await batch.commit();
          derived.push({ hobby, groupId: newGroupId });
          continue;
        }
        // 3.c) hobby totalmente nuevo → añadir a únicos
        unique.push({ hobby, userId: uid });
      }

      // 4) Actualizar la organización con nuevos arrays
      await orgDoc.ref.update({
        gruposDerivados: derived,
        hobbiesUnicos:   unique,
        updatedAt:       admin.firestore.FieldValue.serverTimestamp(),
      });
    }
  });

export const removeOrganizationMember = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError(
        "unauthenticated",
        "Debes iniciar sesión."
      );
    }
    const currentUid = context.auth.uid;
    const memberUidToRemove = (data.memberUid as string) || "";
    const orgId = (data.orgId as string) || "";

    if (!orgId || !memberUidToRemove) {
      throw new functions.https.HttpsError(
        "invalid-argument",
        "Faltan orgId o memberUid."
      );
    }

    const orgRef = db.collection("organizations").doc(orgId);
    const profileRef = db.collection("userProfiles").doc(memberUidToRemove);

    // 2) Transacción para remover al miembro
    await db.runTransaction(async (tx) => {
      const snap = await tx.get(orgRef);
      if (!snap.exists) {
        throw new functions.https.HttpsError("not-found", "Organización no encontrada.");
      }

      const ownerUid = snap.get("ownerUid") as string;
      if (ownerUid !== currentUid) {
        throw new functions.https.HttpsError(
          "permission-denied",
          "Solo el administrador puede remover miembros."
        );
      }

      const memberIds = (snap.get("memberIds") as string[]) || [];
      if (!memberIds.includes(memberUidToRemove)) {
        throw new functions.https.HttpsError(
          "failed-precondition",
          "El usuario no es miembro de la organización."
        );
      }

      // Filtrar memberIds y emails
      const newMemberIds = memberIds.filter((x) => x !== memberUidToRemove);
      const emails = (snap.get("emails") as string[]) || [];
      // Para eliminar el email correspondiente:
      // observamos en userProfiles cuál era su email
      const userSnap = await db.collection("users").doc(memberUidToRemove).get();
      const memberEmail = (userSnap.get("email") as string) || "";
      const newEmails = emails.filter((e) => e.toLowerCase() !== memberEmail.toLowerCase());

      // Limpiar hobbiesUnicos de ese miembro
      const uniqueRaw = (snap.get("hobbiesUnicos") as Array<{ hobby: string; userId: string }>) || [];
      const newUnique = uniqueRaw.filter((entry) => entry.userId !== memberUidToRemove);

      if (newMemberIds.length === 0) {
        tx.delete(orgRef);
      } else {
        tx.update(orgRef, {
          memberIds:     newMemberIds,
          emails:        newEmails,
          memberCount:   newMemberIds.length,
          hobbiesUnicos: newUnique,
          updatedAt:     admin.firestore.FieldValue.serverTimestamp(),
        });
      }

      // 3) Actualizar perfil del miembro removido
      tx.set(
        profileRef,
        {
          organizationIds: admin.firestore.FieldValue.arrayRemove(orgId),
          updatedAt:       admin.firestore.FieldValue.serverTimestamp(),
        },
        { merge: true }
      );
    });

    return { success: true };
  }
);


export const leaveOrganization = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError(
        "unauthenticated",
        "Debes iniciar sesión."
      );
    }
    const uid = context.auth.uid;
    const email = (context.auth.token.email as string) || "";

    // 2) Parámetro orgId
    const orgId = (data.orgId as string) || "";
    if (!orgId) {
      throw new functions.https.HttpsError(
        "invalid-argument",
        "Falta orgId."
      );
    }

    const orgRef = db.collection("organizations").doc(orgId);
    const profileRef = db.collection("userProfiles").doc(uid);

    // 3) Transacción principal
    await db.runTransaction(async (tx) => {
      const snap = await tx.get(orgRef);
      if (!snap.exists) {
        throw new functions.https.HttpsError(
          "not-found",
          "Organización no encontrada."
        );
      }

      const memberIds = (snap.get("memberIds") as string[]) || [];
      if (!memberIds.includes(uid)) {
        throw new functions.https.HttpsError(
          "failed-precondition",
          "No eres miembro de esta organización."
        );
      }

      // Filtramos el miembro que se va
      const newMemberIds = memberIds.filter((x) => x !== uid);

      // Limpiamos hobbiesUnicos de ese uid
      const uniqueRaw = (snap.get("hobbiesUnicos") as Array<{ hobby: string; userId: string }>) || [];
      const newUnique = uniqueRaw.filter((entry) => entry.userId !== uid);

      if (newMemberIds.length === 0) {
        // Si ya no quedan miembros, borramos la org
        tx.delete(orgRef);
      } else {
        // Reasignar owner si corresponde
        let newOwner = snap.get("ownerUid") as string;
        if (newOwner === uid) {
          newOwner = newMemberIds[0];
        }

        tx.update(orgRef, {
          memberIds:     admin.firestore.FieldValue.arrayRemove(uid),
          emails:        admin.firestore.FieldValue.arrayRemove(email),
          memberCount:   admin.firestore.FieldValue.increment(-1),
          ownerUid:      newOwner,
          hobbiesUnicos: newUnique,
          updatedAt:     admin.firestore.FieldValue.serverTimestamp(),
        });
      }

      // 4) Actualizamos el perfil del usuario que sale
      tx.set(
        profileRef,
        {
          organizationIds: admin.firestore.FieldValue.arrayRemove(orgId),
          updatedAt:       admin.firestore.FieldValue.serverTimestamp(),
        },
        { merge: true }
      );
    });

    return { success: true };
  }
);

export const addOrganizationMember = functions.https.onCall(
  async (data, context) => {
    if (!context.auth) {
      throw new functions.https.HttpsError("unauthenticated", "Debes iniciar sesión.");
    }
    const orgId = (data.orgId as string) || "";
    const email = (data.email as string || "").trim().toLowerCase();
    if (!orgId) {
      throw new functions.https.HttpsError("invalid-argument", "Falta orgId.");
    }
    if (!email.match(/^[^@]+@[^@]+\.[^@]+$/)) {
      throw new functions.https.HttpsError("invalid-argument", "Email inválido.");
    }

    // 1) busco UID del email
    const userSnap = await db
      .collection("users")
      .where("email", "==", email)
      .limit(1)
      .get();
    if (userSnap.empty) {
      throw new functions.https.HttpsError("not-found", "Email no registrado.");
    }
    const uid = userSnap.docs[0].id;

    // 2) en transacción añado a la org y al perfil
    const orgRef = db.collection("organizations").doc(orgId);
    const profileRef = db.collection("userProfiles").doc(uid);

    await db.runTransaction(async (tx) => {
      tx.update(orgRef, {
        memberIds: admin.firestore.FieldValue.arrayUnion(uid),
        emails:    admin.firestore.FieldValue.arrayUnion(email),
        memberCount: admin.firestore.FieldValue.increment(1),
        updatedAt: admin.firestore.FieldValue.serverTimestamp(),
      });
      tx.set(profileRef, {
        organizationIds: admin.firestore.FieldValue.arrayUnion(orgId),
        updatedAt:        admin.firestore.FieldValue.serverTimestamp(),
      }, { merge: true });
    });

    // 3) devolvemos éxito
    return { success: true };
  }
);

export const createOrganization = functions.https.onCall(
  async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError(
        "unauthenticated",
        "Debes iniciar sesión para crear una organización."
      );
    }
    const ownerUid = context.auth.uid;
    const ownerEmail = (context.auth.token.email as string) || "";

    // 2) Validar parámetros
    const name = (data.name as string || "").trim();
    const emailsRaw = Array.isArray(data.emails) ? data.emails as string[] : [];
    if (!name) {
      throw new functions.https.HttpsError("invalid-argument", "El nombre no puede estar vacío.");
    }
    // Deduplicar y normalizar
    const emailsToInvite = Array.from(new Set(
      emailsRaw.map((e) => e.trim().toLowerCase())
        .filter((e) => e && e !== ownerEmail)
    ));

    // 3) Validar unicidad de nombre
    const exist = await db
      .collection("organizations")
      .where("name", "==", name)
      .limit(1)
      .get();
    if (!exist.empty) {
      throw new functions.https.HttpsError("already-exists", "Ya existe una organización con ese nombre.");
    }

    // 4) Verificar que todos los correos existen en /users
    const usersSnap = await db
      .collection("users")
      .where("email", "in", [ownerEmail, ...emailsToInvite])
      .get();
    const foundEmails = usersSnap.docs.map((d) => d.get("email") as string);
    const missing = [ownerEmail, ...emailsToInvite].filter((e) => !foundEmails.includes(e));
    if (missing.length) {
      throw new functions.https.HttpsError(
        "not-found",
        `Los siguientes correos no están registrados: ${missing.join(", ")}`
      );
    }
    // 5) Construir memberIds y emails
    const emailToUid = new Map<string, string>();
    usersSnap.docs.forEach((d) => emailToUid.set(d.get("email") as string, d.id));
    const memberIds = Array.from(new Set([ownerUid, ...emailsToInvite.map((e) => emailToUid.get(e)!)]));
    const emailsList = Array.from(new Set([ownerEmail, ...emailsToInvite]));

    // 6) Generar código único
    let code: string;
    do {
      code = generateRandomCode();
      const dup = await db.collection("organizations").where("code", "==", code).limit(1).get();
      if (dup.empty) break;
    } while (true);

    // 7) Crear doc de organización
    const orgId = db.collection("organizations").doc().id;
    const now = admin.firestore.FieldValue.serverTimestamp();
    await db.collection("organizations").doc(orgId).set({
      name, code, type: "organization",
      ownerUid, memberIds, emails: emailsList,
      memberCount: memberIds.length,
      createdAt: now, updatedAt: now,
      hobbiesUnicos: [], gruposDerivados: [],
    });

    // 8) Añadir orgId a cada perfil y recoger hobbies
    const profileRefs = memberIds.map((uid) => db.collection("userProfiles").doc(uid));
    const batch = db.batch();
    profileRefs.forEach((ref) =>
      batch.set(ref, {organizationIds: admin.firestore.FieldValue.arrayUnion(orgId), updatedAt: now}, {merge: true})
    );
    await batch.commit();

    // 9) Leer hobbies de cada miembro
    const profiles = await Promise.all(
      memberIds.map((uid) => db.collection("userProfiles").doc(uid).get())
    );
    const hobbyMap = new Map<string, string[]>();
    profiles.forEach((snap) => {
      hobbyMap.set(snap.id, ((snap.get("hobbies") as string[]) || []));
    });
    // 10) Contar y determinar grupos derivados y únicos
    const derived: Array<{ hobby:string, groupId:string }> = [];
    const unique: Array<{ hobby:string, userId:string }> = [];
    const counts = new Map<string, string[]>();
    hobbyMap.forEach((hobbies, uid) => {
      hobbies.forEach((h) => {
        const arr = counts.get(h) || [];
        arr.push(uid);
        counts.set(h, arr);
      });
    });
    // 11) Para cada hobby con ≥2, crear grupo; los de 1 son únicos
    for (const [hobby, uids] of counts.entries()) {
      if (uids.length >= 2) {
        // crear grupo derivado
        const groupId = db.collection("groups").doc().id;
        const groupCode = generateRandomCode();
        await db.collection("groups").doc(groupId).set({
          name: `${name} – ${hobby}`,
          code: groupCode,
          type: "personal", derivado: true, hobby,
          organizationId: orgId,
          ownerUid: uids[0],
          memberIds: uids,
          emails: uids.map((uid) => {
            // ya tenemos emailToUid invertido
            const doc = usersSnap.docs.find((d) => d.id === uid);
            return doc?.get("email") as string;
          }),
          memberCount: uids.length,
          createdAt: now, updatedAt: now,
        });
        // actualizar perfiles
        const b2 = db.batch();
        uids.forEach((uid) => {
          const ref = db.collection("userProfiles").doc(uid);
          b2.set(ref, {groupIds: admin.firestore.FieldValue.arrayUnion(groupId), updatedAt: now}, {merge: true});
        });
        await b2.commit();
        derived.push({hobby, groupId});
      } else {
        unique.push({hobby, userId: uids[0]});
      }
    }

    // 12) Finalmente actualizamos la org con esos arrays
    await db.collection("organizations").doc(orgId).update({
      gruposDerivados: derived,
      hobbiesUnicos: unique,
      updatedAt: now,
    });

    // Devolvemos el código para que el cliente lo muestre
    return {orgId, code};
  }
);


// 1) Trigger que corre cada vez que se actualiza una organización
export const onOrganizationMembershipChange = functions
  .firestore
  .document("organizations/{orgId}")
  .onUpdate(async (change, context) => {
    const before = change.before.data()!;
    const after = change.after.data()!;
    const orgId = context.params.orgId;

    // 2) Detectar nuevos miembros
    const oldIds = new Set<string>(before.memberIds || []);
    const newIds = new Set<string>(after.memberIds || []);
    // Calculamos la diferencia: quiénes están en newIds pero no en oldIds
    const added = Array.from(newIds).filter((uid) => !oldIds.has(uid));
    if (added.length === 0) {
      // No hay nuevos, salimos
      return;
    }

    // 3) Reconstruir los arrays de la org
    const derivedRaw = (after.gruposDerivados || []) as Array<{ hobby: string; groupId: string }>;
    const uniqueRaw = (after.hobbiesUnicos || []) as Array<{ hobby: string; userId: string }>;
    const derived = [...derivedRaw];
    const unique = [...uniqueRaw];

    // 4) Para cada uid agregado, leer su perfil para saber sus hobbies
    for (const uid of added) {
      const profileSnap = await db.collection("userProfiles").doc(uid).get();
      const hobbies = (profileSnap.get("hobbies") as string[]) || [];

      for (const hobby of hobbies) {
        // a) ¿Ya existe un grupo derivado para ese hobby?
        const existing = derived.find((d) => d.hobby === hobby);
        if (existing) {
          // agregamos el nuevo miembro al grupo existente
          await db.collection("groups").doc(existing.groupId).update({
            memberIds: admin.firestore.FieldValue.arrayUnion(uid),
            emails: admin.firestore.FieldValue.arrayUnion(profileSnap.get("email") || ""),
            memberCount: admin.firestore.FieldValue.increment(1),
            updatedAt: admin.firestore.FieldValue.serverTimestamp(),
          });
          continue;
        }
        // b) ¿Está ese hobby como “único” de otro usuario?
        const uidx = unique.findIndex((u) => u.hobby === hobby);
        if (uidx >= 0) {
          const otherUid = unique[uidx].userId;
          unique.splice(uidx, 1); // lo quitamos de únicos

          // creamos un nuevo grupo derivado entre los dos
          // creamos un nuevo grupo derivado entre los dos
          const code = generateRandomCode();
          const newGroupId = db.collection("groups").doc().id;


          const groupData: any = {
            name: `${after.name} – ${hobby}`,
            code,
            type: "personal",
            derivado: true,
            hobby,
            organizationId: orgId,
            ownerUid: otherUid,
            memberIds: [otherUid, uid],
            emails: [], // inicializamos vacío y luego lo rellenamos
            memberCount: 2,
            createdAt: admin.firestore.FieldValue.serverTimestamp(),
            updatedAt: admin.firestore.FieldValue.serverTimestamp(),
          };

          // obtenemos los emails de los dos usuarios
          const snaps = await Promise.all([
            db.collection("users").doc(otherUid).get(),
            db.collection("users").doc(uid).get(),
          ]);
          // aquí ya no da error, porque groupData es any
          groupData.emails = snaps.map((s) => (s.get("email") as string) || "");

          await db.collection("groups").doc(newGroupId).set(groupData);
          // actualizar perfil de ambos
          const batch = db.batch();
          for (const m of [otherUid, uid]) {
            const upr = db.collection("userProfiles").doc(m);
            batch.set(upr, {
              groupIds: admin.firestore.FieldValue.arrayUnion(newGroupId),
              updatedAt: admin.firestore.FieldValue.serverTimestamp(),
            }, {merge: true});
          }
          await batch.commit();

          derived.push({hobby, groupId: newGroupId});
          continue;
        }
        // c) hobby completamente nuevo para la org
        unique.push({hobby, userId: uid});
      }
    }

    // 5) Finalmente actualizo la organización con los nuevos arrays
    await db.collection("organizations").doc(orgId).update({
      gruposDerivados: derived,
      hobbiesUnicos: unique,
      updatedAt: admin.firestore.FieldValue.serverTimestamp(),
    });
  });

// Generador simple de códigos (6 caracteres alfanum)
function generateRandomCode() {
  const chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  return Array.from({length: 6})
    .map(() => chars[Math.floor(Math.random() * chars.length)])
    .join("");
}

export const joinOrganization = functions

  .https.onCall(async (data, context) => {
    // 1) Autenticación
    if (!context.auth) {
      throw new functions.https.HttpsError(
        "unauthenticated",
        "Debes iniciar sesión para unirte a la organización."
      );
    }
    const uid = context.auth.uid;
    const email = (context.auth.token.email as string) || "";

    // 2) Parámetro código
    const code = (data.code as string || "").trim().toUpperCase();
    if (!code) {
      throw new functions.https.HttpsError(
        "invalid-argument",
        "El código no puede estar vacío."
      );
    }

    // 3) Buscar organización por código
    const orgQuery = await db
      .collection("organizations")
      .where("code", "==", code)
      .limit(1)
      .get();

    if (orgQuery.empty) {
      throw new functions.https.HttpsError(
        "not-found",
        "Código de organización inválido."
      );
    }
    const orgDoc = orgQuery.docs[0];
    const orgRef = orgDoc.ref;
    const orgData = orgDoc.data();

    const existingEmails = orgData.emails as string[] || [];
    if (existingEmails.includes(email)) {
      throw new functions.https.HttpsError(
        "already-exists",
        "Ya eres miembro de esta organización."
      );
    }

    // 4) En transacción, añadir el usuario a la org y al perfil
    await db.runTransaction(async (tx) => {
      tx.update(orgRef, {
        memberIds: admin.firestore.FieldValue.arrayUnion(uid),
        emails: admin.firestore.FieldValue.arrayUnion(email),
        memberCount: admin.firestore.FieldValue.increment(1),
        updatedAt: admin.firestore.FieldValue.serverTimestamp(),
      });

      const profileRef = db.collection("userProfiles").doc(uid);
      tx.set(profileRef, {
        organizationIds: admin.firestore.FieldValue.arrayUnion(orgDoc.id),
        updatedAt: admin.firestore.FieldValue.serverTimestamp(),
      }, {merge: true});
    });

    // 5) Devolver el orgId para confirmación en cliente
    return {orgId: orgDoc.id};
  });

export const getOrganizationDetails = functions.https.onCall(
  async (data, context) => {
    const uid = context.auth?.uid;
    if (!uid) {
      throw new functions.https.HttpsError(
        "unauthenticated",
        "Debes estar autenticado"
      );
    }

    const orgId = data.orgId;
    if (typeof orgId !== "string" || !orgId.trim()) {
      throw new functions.https.HttpsError(
        "invalid-argument",
        "Falta orgId"
      );
    }

    const doc = await db.collection("organizations").doc(orgId).get();
    if (!doc.exists) {
      throw new functions.https.HttpsError(
        "not-found",
        "Organización no encontrada"
      );
    }


    const org = doc.data()!;

    const memberIds: string[] = Array.isArray(org.memberIds) ?
      (org.memberIds as string[]) :
      [];

    if (!memberIds.includes(uid)) {
      throw new functions.https.HttpsError(
        "permission-denied",
        "No eres miembro de esta organización"
      );
    }

    return {
      id: doc.id,
      name: org.name as string,
      code: org.code as string,
      type: org.type as string,
      ownerUid: org.ownerUid as string,
      memberCount: typeof org.memberCount === "number" ?
        org.memberCount :
        Number(org.memberCount),
      memberIds,
      emails: Array.isArray(org.emails) ?
        (org.emails as string[]) :
        [],
      createdAt: org.createdAt ?
        (org.createdAt as admin.firestore.Timestamp).toDate().toISOString() :
        null,
      updatedAt: org.updatedAt ?
        (org.updatedAt as admin.firestore.Timestamp).toDate().toISOString() :
        null,
      hobbiesUnicos: Array.isArray(org.hobbiesUnicos) ?
        (org.hobbiesUnicos as any[]) :
        [],
      gruposDerivados: Array.isArray(org.gruposDerivados) ?
        (org.gruposDerivados as any[]) :
        [],
    };
  }
);


// Función solo para validar el spin diario
export const spinDaily = functions.https.onCall(async (data, context) => {
  if (!context.auth) {
    throw new functions.https.HttpsError("unauthenticated", "Usuario no autenticado");
  }
  const uid = context.auth.uid;
  const userRef = admin.firestore().collection("userProfiles").doc(uid);

  try {
    await admin.firestore().runTransaction(async (tx) => {
      const snap = await tx.get(userRef);
      if (!snap.exists) {
        throw new functions.https.HttpsError("not-found", "Perfil no existe");
      }
      const profile = snap.data()!;
      const lastSpin: number = (profile.lastSpinAt as any) || 0;
      const nowMillis = Date.now();
      const delta = nowMillis - lastSpin;
      const dayMillis = 60 * 60 * 24 * 1000;

      if (lastSpin > 0 && delta < dayMillis) {
        const millisLeft = dayMillis - delta;
        const hoursLeft = Math.ceil(millisLeft / (1000 * 60 * 60));
        throw new functions.https.HttpsError(
          "failed-precondition",
          `Ya giraste hoy. Intenta de nuevo en ${hoursLeft} horas.`
        );
      }


      tx.update(userRef, {
        lastSpinAt: nowMillis,
      });
    });

    return {
      success: true,
      message: "Spin validado. Completa el desafío para obtener puntos.",
    };
  } catch (err: any) {
    if (err instanceof functions.https.HttpsError) throw err;
    throw new functions.https.HttpsError("internal", "Error en spin: "+err.message);
  }
});


const DAY_MS = 24 * 60 * 60 * 1000;

export const completeChallenge = functions.https.onCall(async (data, context) => {
  if (!context.auth) {
    throw new functions.https.HttpsError("unauthenticated", "Usuario no autenticado");
  }
  const uid = context.auth.uid;
  const userRef = db.collection("userProfiles").doc(uid);

  const isRespin = (data.isRespin as boolean) || false;
  const challengeName = data.challengeName as string;
  if (!challengeName) {
    throw new functions.https.HttpsError("invalid-argument", "Nombre del desafío requerido");
  }

  try {
    const result = await db.runTransaction(async (tx) => {
      const snap = await tx.get(userRef);
      // Si no existe, inicializamos un perfil “vacío”
      const profile = snap.exists ?
        snap.data()! :
        {accumulatedPoints: 0, lastSpinAt: 0, lastChallengeCompletedAt: 0};

      const lastSpin = (profile.lastSpinAt as number) || 0;
      const now = Date.now();

      // Expiración 24h + 30m
      if (now - lastSpin > DAY_MS + 30 * 60 * 1000) {
        throw new functions.https.HttpsError(
          "failed-precondition",
          "El desafío ha expirado. Gira la ruleta nuevamente."
        );
      }

      // Puntos por desafío
      const pointsMap: Record<string, number> = {
        "Descanso 5'": 10,
        "Hidratarte": 8,
        "Estiramiento": 12,
        "Caminar": 15,
        "Meditación": 20,
        "Respirar": 8,
      };
      const base = pointsMap[challengeName] ?? 10;
      const earned = isRespin ? Math.floor(base / 2) : base;
      const prev = (profile.accumulatedPoints as number) || 0;
      const total = prev + earned;

      // Si el perfil no existía, tx.set creará con merge
      tx.set(
        userRef,
        {
          accumulatedPoints: total,
          lastChallengeCompletedAt: now,
          lastSpinAt: lastSpin, // mantenemos el timestamp previo
        },
        {merge: true}
      );

      return {earned, prev, total};
    });

    return {
      earnedPoints: result.earned,
      previousPoints: result.prev,
      totalPoints: result.total,
      message: `¡Completaste el desafío! Obtuviste ${result.earned} puntos. Total: ${result.total}.`,
    };
  } catch (err: any) {
    if (err instanceof functions.https.HttpsError) throw err;
    throw new functions.https.HttpsError("internal", "Error completando desafío: " + err.message);
  }
});


interface DailyMissionsRecord {
  missionIds: string[];
  completedToday: Record<string, boolean>;
  generatedAt: number;
}

/**
 * Genera o devuelve las micro‑misiones de hoy.
 * Siempre devuelve { missions: Mision[], completed: Record<string,boolean> }.
 */
export const generateDailyMissions = functions.https.onCall(async (_data, context) => {
  if (!context.auth) {
    throw new functions.https.HttpsError("unauthenticated", "Usuario no autenticado");
  }
  const uid = context.auth.uid!;
  const userRef = db.collection("userProfiles").doc(uid);

  try {
    const txResult = await db.runTransaction<{ missions: Mision[]; completed: Record<string, boolean> }>(async (tx) => {
      const snap = await tx.get(userRef);
      const now = Date.now();
      const DAY_MS = 24 * 60 * 60 * 1000;

      const weekly: DailyMissionsRecord[] = (snap.get("weeklyMissions") as any[] || []);
      // ¿Ya hay generación hoy?
      if (weekly.length > 0 && now - weekly[weekly.length - 1].generatedAt < DAY_MS) {
        const today = weekly[weekly.length - 1];
        const full = today.missionIds.map((id) => {
          const m = MisionProvider.findById(id);
          if (!m) throw new Error(`Misión no encontrada: ${id}`);
          return {...m};
        });
        return {missions: full, completed: today.completedToday};
      }

      // Generar nuevas 3
      const nuevas = MisionProvider.obtenerMisionesDelDia();
      const ids = nuevas.map((m) => m.id);
      const compMap: Record<string, boolean> = {};
      ids.forEach((i) => compMap[i] = false);

      const newRec: DailyMissionsRecord = {
        missionIds: ids,
        completedToday: compMap,
        generatedAt: now,
      };
      const updated = [...weekly, newRec];
      if (updated.length > 7) updated.splice(0, updated.length - 7);

      tx.set(userRef, {
        weeklyMissions: updated,
        dailyMissionIds: ids,
        completed: compMap,
        lastMissionsDay: now,
      }, {merge: true});

      return {missions: nuevas, completed: compMap};
    });

    // Devuelve siempre algo, nunca undefined
    return {
      missions: txResult.missions || [],
      completed: txResult.completed || {},
    };
  } catch (e: any) {
    console.error("generateDailyMissions fallo:", e);
    // En caso de error devolvemos arrays vacíos
    return {missions: [], completed: {}};
  }
});

/**
 * Marca una micro‑misión de hoy como completada.
 */
export const completeDailyMission = functions.https.onCall(async (data, context) => {
  if (!context.auth) {
    throw new functions.https.HttpsError("unauthenticated", "Usuario no autenticado");
  }
  const missionId = data.missionId as string;
  if (!missionId) {
    throw new functions.https.HttpsError("invalid-argument", "missionId requerido");
  }
  const uid = context.auth.uid!;
  const userRef = db.collection("userProfiles").doc(uid);

  try {
    await db.runTransaction(async (tx) => {
      const snap = await tx.get(userRef);
      if (!snap.exists) throw new functions.https.HttpsError("not-found", "Perfil no existe");

      const weekly: DailyMissionsRecord[] = (snap.get("weeklyMissions") as any[] || []);
      if (weekly.length === 0) throw new functions.https.HttpsError("failed-precondition", "No hay micro‑misiones");

      const today = weekly[weekly.length - 1];
      if (!(missionId in today.completedToday)) {
        throw new functions.https.HttpsError("invalid-argument", "missionId inválida hoy");
      }

      today.completedToday[missionId] = true;
      const updated = [...weekly];
      updated[updated.length - 1] = today;

      tx.update(userRef, {
        weeklyMissions: updated,
        completed: today.completedToday,
      });
    });

    return {success: true};
  } catch (e: any) {
    console.error("completeDailyMission fallo:", e);
    throw new functions.https.HttpsError("internal", "Error completando micro‑misión");
  }
});

// Interfaz parcial de la respuesta de Perspective.
interface PerspectiveResponse {
  attributeScores: {
    TOXICITY: { summaryScore: { value: number } };
    PROFANITY: { summaryScore: { value: number } };
  };
}

/**
 * Llama a la API de Perspective para analizar el texto.
 */
async function analyzeText(text: string) {
  if (!API_KEY) {
    throw new Error("API_KEY para Perspective no configurada");
  }

  const body = {
    comment: {text},
    languages: ["es", "en"],
    requestedAttributes: {TOXICITY: {}, PROFANITY: {}},
  };

  functions.logger.log("🔍 Perspective request:", {text});
  const res = await fetch(`${PERSPECTIVE_URL}?key=${API_KEY}`, {
    method: "POST",
    headers: {"Content-Type": "application/json"},
    body: JSON.stringify(body),
  });

  if (!res.ok) {
    const txt = await res.text();
    functions.logger.error("❌ Perspective API error response:", res.status, txt);
    throw new Error(`Perspective API error ${res.status}`);
  }

  const payload = (await res.json()) as PerspectiveResponse;
  functions.logger.log("✅ Perspective result:", payload.attributeScores);
  return payload.attributeScores;
}

/**
 * Cloud Function onCall: recibe { text }, analiza y decide si permitirlo.
 */
export const moderateMessage = functions.https.onCall(
  async (data, context) => {
    if (!context.auth) {
      throw new functions.https.HttpsError("unauthenticated", "Usuario no autenticado");
    }
    const text = (data.text as string || "").trim();
    if (!text) {
      throw new functions.https.HttpsError("invalid-argument", "El texto está vacío");
    }

    try {
      const scores = await analyzeText(text);
      const tox = scores.TOXICITY.summaryScore.value;
      const prof = scores.PROFANITY.summaryScore.value;

      if (tox >= TOXICITY_THRESHOLD) {
        throw new functions.https.HttpsError(
          "permission-denied",
          "Ese mensaje parece tóxico, modifícalo para enviarlo."
        );
      }
      if (prof >= PROFANITY_THRESHOLD) {
        throw new functions.https.HttpsError(
          "permission-denied",
          "Ese mensaje contiene lenguaje inapropiado."
        );
      }

      return {allowed: true};
    } catch (e: any) {
      // 1) Si ya es HttpsError, lo reenviamos tal cual:
      if (e instanceof functions.https.HttpsError) {
        functions.logger.warn("moderateMessage rejeta con HttpsError:", e.code, e.message);
        throw e;
      }

      // 2) Si no, mostramos el stack/message en los logs:
      functions.logger.error("‼ moderateMessage ONCALL threw non-HttpsError:", e.stack || e.message);

      // 3) Ahora re-lanzamos un HttpsError permitiendo ver el detalle:
      throw new functions.https.HttpsError(
        "internal",
        `Error interno moderación: ${e.message}`
      );
    }
  }
);
