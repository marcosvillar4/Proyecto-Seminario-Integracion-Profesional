import * as functions from "firebase-functions/v1";
import * as admin from "firebase-admin";


import {Mision} from "./types";
import {MisionProvider} from "./missionProvider";

admin.initializeApp();
const db = admin.firestore();

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
      const dayMillis = 10000; // 24 horas

      if (lastSpin > 0 && delta < dayMillis) {
        const millisLeft = dayMillis - delta;
        const hoursLeft = Math.ceil(millisLeft / (10000)); // TODO, CAMBIAR ESTO PARA 24 HORAS - ATENCIÓN - REVISAR
        throw new functions.https.HttpsError(
          "failed-precondition",
          `Ya giraste hoy. Intenta de nuevo en ${hoursLeft} horas.`
        );
      }

      // Solo actualizar el timestamp, NO los puntos
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


// Función para generar misiones diarias
export const generateDailyMissions = functions.https.onCall(
  async (_data: any, context) => {
    if (!context.auth) {
      throw new functions.https.HttpsError("unauthenticated", "Usuario no autenticado");
    }
    const uid = context.auth.uid;
    const userRef = db.collection("userProfiles").doc(uid);

    return await db.runTransaction(async (tx) => {
      const snap = await tx.get(userRef);
      const now = Date.now();
      const DAY_MS = 24 * 60 * 60 * 1000;

      const existing = snap.get("dailyMissions") as Mision[] | undefined;
      if (existing && (snap.get("lastMissionsDay") as number) + DAY_MS > now) {
        return {missions: existing};
      }

      const nuevas = MisionProvider.obtenerMisionesDelDia();
      tx.set(
        userRef,
        {dailyMissions: nuevas, lastMissionsDay: now},
        {merge: true}
      );

      return {missions: nuevas};
    });
  }
);

