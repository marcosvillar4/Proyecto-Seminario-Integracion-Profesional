import {Mision} from "./types";

// Lista maestra de posibles misiones
const ALL_MISIONES: Mision[] = [
  {
    id: "1",
    titulo: "Respirá profundo",
    descripcion: "Guía de respiración",
    tipo: "GUIADA",
    pasosGuiados: ["Inhalá", "Exhalá", "Inhalá", "Exhalá", "Listo"],
    duracionSegundos: 10,
    completada: false,
  },
  {
    id: "2",
    titulo: "Desconectate",
    descripcion: "Sin celular 2 minutos",
    tipo: "TEMPORIZADOR",
    pasosGuiados: null,
    duracionSegundos: 120,
    completada: false,
  },
  {
    id: "3",
    titulo: "Estirate",
    descripcion: "Estiramiento 30s",
    tipo: "TEMPORIZADOR",
    pasosGuiados: null,
    duracionSegundos: 30,
    completada: false,
  },
  {
    id: "4",
    titulo: "Tomá agua",
    descripcion: "Bebe un vaso",
    tipo: "SIMPLE",
    pasosGuiados: null,
    duracionSegundos: 0,
    completada: false,
  },
  {
    id: "5",
    titulo: "Camina un poco",
    descripcion: "Camina 1 min",
    tipo: "TEMPORIZADOR",
    pasosGuiados: null,
    duracionSegundos: 60,
    completada: false,
  },
  {
    id: "6",
    titulo: "Mirada al horizonte",
    descripcion: "Mira lejos 20s",
    tipo: "TEMPORIZADOR",
    pasosGuiados: null,
    duracionSegundos: 20,
    completada: false,
  },
  {
    id: "7",
    titulo: "Postura consciente",
    descripcion: "Corrige tu postura",
    tipo: "SIMPLE",
    pasosGuiados: null,
    duracionSegundos: 0,
    completada: false,
  },
];

export const MisionProvider = {
  obtenerMisionesDelDia(): Mision[] {
    // Devuelve 3 aleatorias cada día
    return ALL_MISIONES.sort(() => Math.random() - 0.5).slice(0, 3);
  },
};
