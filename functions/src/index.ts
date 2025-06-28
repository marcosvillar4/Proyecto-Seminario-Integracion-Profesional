import * as functions from "firebase-functions/v1";
import * as admin from "firebase-admin";
admin.initializeApp();

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

// Nueva función para completar el desafío y otorgar puntos
export const completeChallenge = functions.https.onCall(async (data, context) => {
  if (!context.auth) {
    throw new functions.https.HttpsError("unauthenticated", "Usuario no autenticado");
  }
  const uid = context.auth.uid;
  const userRef = admin.firestore().collection("userProfiles").doc(uid);

  // Extraer parámetros del cliente
  const isRespin = (data.isRespin as boolean) || false;
  const challengeName = data.challengeName as string;

  if (!challengeName) {
    throw new functions.https.HttpsError("invalid-argument", "Nombre del desafío requerido");
  }

  try {
    const result = await admin.firestore().runTransaction(async (tx) => {
      const snap = await tx.get(userRef);
      if (!snap.exists) {
        throw new functions.https.HttpsError("not-found", "Perfil no existe");
      }

      const profile = snap.data()!;
      const lastSpin: number = (profile.lastSpinAt as any) || 0;
      const nowMillis = Date.now();
      const delta = nowMillis - lastSpin;
      const dayMillis = 10000; // 24 horas

      // Verificar que el spin fue hoy (tolerancia de 30 minutos extra)
      if (delta > dayMillis + (30 * 60 * 1000)) {
        throw new functions.https.HttpsError(
          "failed-precondition",
          "El desafío ha expirado. Gira la ruleta nuevamente."
        );
      }

      // Calcular puntos según el tipo de desafío
      const challengePoints: { [key: string]: number } = {
        "Descanso 5'": 10,
        "Hidratarte": 8,
        "Estiramiento": 12,
        "Caminar": 15,
        "Meditación": 20,
        "Respirar": 8,
      };

      const baseEarned = challengePoints[challengeName] || 10;
      // Ajustar por respin (mitad de puntos)
      const earned = isRespin ? Math.floor(baseEarned / 2) : baseEarned;

      // Sumar puntos
      const prevPoints: number = (profile.accumulatedPoints as any) || 0;
      const newPoints = prevPoints + earned;

      // Actualizar puntos y marcar como completado
      tx.update(userRef, {
        accumulatedPoints: newPoints,
        lastChallengeCompletedAt: nowMillis,
      });

      return {earned, newPoints, prevPoints};
    });

    return {
      earnedPoints: result.earned,
      totalPoints: result.newPoints,
      previousPoints: result.prevPoints,
      message: `¡Completaste el desafío! Obtuviste ${result.earned} puntos. Total: ${result.newPoints}.`,
    };
  } catch (err: any) {
    if (err instanceof functions.https.HttpsError) throw err;
    throw new functions.https.HttpsError("internal", "Error completando desafío: "+err.message);
  }
});
