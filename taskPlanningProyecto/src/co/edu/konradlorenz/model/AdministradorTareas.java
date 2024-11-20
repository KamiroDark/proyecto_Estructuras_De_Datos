package co.edu.konradlorenz.model;

import java.util.ArrayList;

/*
 * @author Bautista_López_Patiño_Prieto
 */
 
 public class AdministradorTareas {
 
    private ArrayList<Tarea> colaArrayList;
 
    public AdministradorTareas() {
        this.colaArrayList = new ArrayList<>();
    }
 
    public ArrayList<Tarea> getColaArrayList() {
        return colaArrayList;
    }
 
    public void agregarTarea(Tarea tarea) {
        colaArrayList.add(tarea);
    }
 
    public boolean estaVacia() {
        return colaArrayList.isEmpty();
    }
 
    public boolean eliminarTarea(String nombreTarea) {
        return colaArrayList.removeIf(tarea -> tarea.getNombreTarea().equalsIgnoreCase(nombreTarea));
    }
 
    public Tarea buscarTareaPorNombre(String nombreTarea) {
        for (Tarea tarea : colaArrayList) {
            if (tarea.getNombreTarea().equalsIgnoreCase(nombreTarea)) {
                return tarea;
            }
        }
        return null;
    }
 
    public ArrayList<Tarea> buscarTareasPorPrioridad(int prioridad) {
        ArrayList<Tarea> tareasPorPrioridad = new ArrayList<>();
         for (Tarea tarea : colaArrayList) {
            if (tarea.getPrioridad() == prioridad) {
                tareasPorPrioridad.add(tarea);
            }
        }
        return tareasPorPrioridad;
    }
} 
