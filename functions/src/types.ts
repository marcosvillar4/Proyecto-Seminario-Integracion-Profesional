// interfaces de datos compartidos por tus funciones

export interface Mision {
  id: string;
  titulo: string;
  descripcion: string;
  tipo: "TEMPORIZADOR" | "GUIADA" | "SIMPLE";
  duracionSegundos: number;
  pasosGuiados: string[] | null;
  completada: boolean;
}
