// functions/src/types.ts
export interface Mision {
  id: string;
  titulo: string;
  descripcion: string;
  tipo: "TEMPORIZADOR" | "GUIADA" | "SIMPLE";
  duracionSegundos: number;
  pasosGuiados: string[] | null;
}

// Guarda sólo IDs + estado completado:
export interface DailyMissionsRecord {
  missionIds: string[];
  completedToday: Record<string, boolean>;
  generatedAt: number;
}
