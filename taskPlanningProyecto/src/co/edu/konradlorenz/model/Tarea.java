package co.edu.konradlorenz.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * @author Bautista_López_Patiño_Prieto
 */
 
 public class Tarea {
 
    private String nombreTarea;
    private String descripcion;
    private int prioridad;
 
    public Tarea(String nombreTarea, String descripcion, int prioridad) {
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
 
    public Tarea() {
    }
 
    public String getNombreTarea() {
        return nombreTarea;
    }
 
    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }
 
    public String getDescripcion() {
        return descripcion;
    }
 
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    public int getPrioridad() {
        return prioridad;
    }
 
    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
 
    @Override
    public String toString() {
        return getActualTime() + " " + prioridad + ". " + nombreTarea + " | Descripción: " + descripcion;
    }
 
    public String getActualTime() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        return fechaHoraActual.format(formato);
    }
}
 
