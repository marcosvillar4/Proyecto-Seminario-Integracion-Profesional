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
