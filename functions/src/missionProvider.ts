// functions/src/missionProvider.ts

import {Mision} from "./types";

// Lista maestra de posibles misiones (sin la propiedad `completada`)
const ALL_MISIONES: Mision[] = [
  {
    id: "1",
    titulo: "Respirá profundo",
    descripcion: "Guía de respiración",
    tipo: "GUIADA",
    pasosGuiados: ["Inhalá", "Exhalá", "Inhalá", "Exhalá", "Listo"],
    duracionSegundos: 10,
  },
  {
    id: "2",
    titulo: "Desconectate",
    descripcion: "Sin celular 2 minutos",
    tipo: "TEMPORIZADOR",
    pasosGuiados: null,
    duracionSegundos: 120,
  },
  {
    id: "3",
    titulo: "Estirate",
    descripcion: "Estiramiento 30s",
    tipo: "TEMPORIZADOR",
    pasosGuiados: null,
    duracionSegundos: 30,
  },
  {
    id: "4",
    titulo: "Tomá agua",
    descripcion: "Bebe un vaso",
    tipo: "SIMPLE",
    pasosGuiados: null,
    duracionSegundos: 0,
  },
  {
    id: "5",
    titulo: "Camina un poco",
    descripcion: "Camina 1 min",
    tipo: "TEMPORIZADOR",
    pasosGuiados: null,
    duracionSegundos: 60,
  },
  {
    id: "6",
    titulo: "Mirada al horizonte",
    descripcion: "Mira lejos 20s",
    tipo: "TEMPORIZADOR",
    pasosGuiados: null,
    duracionSegundos: 20,
  },
  {
    id: "7",
    titulo: "Postura consciente",
    descripcion: "Corrige tu postura",
    tipo: "SIMPLE",
    pasosGuiados: null,
    duracionSegundos: 0,
  },
];

export const MisionProvider = {
  /**
   * Devuelve 3 misiones aleatorias para el día.
   */
  obtenerMisionesDelDia(): Mision[] {
    return ALL_MISIONES
      .sort(() => Math.random() - 0.5)
      .slice(0, 3);
  },

  /**
   * Busca una misión en la lista maestra por su ID.
   */
  findById(id: string): Mision | undefined {
    return ALL_MISIONES.find((m) => m.id === id);
  },
};
