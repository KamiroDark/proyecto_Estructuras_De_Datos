package co.edu.konradlorenz.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/*
 * @author Bautista_López_Patiño_Prieto
 */
public class Tarea implements Serializable {

    private static final long serialVersionUID = 1L; // Versión de serialización
    // -- // Atributos // -- //
    private String nombreTarea;
    private String descripcion;
    private int prioridad;
    private LocalDateTime fechaCreacion;

    // -- // Constructores // -- //
    public Tarea(String nombreTarea, String descripcion, int prioridad) {
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaCreacion = LocalDateTime.now();
    }

    public Tarea() {
    }

    // -- // Getters & Setters // -- //
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

    // -- // ToString // -- //
    @Override

    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        return fechaCreacion.format(formato) + " " + prioridad + ". " + nombreTarea + " | Descripción: " + descripcion;
    }

    /*/ -- // Metodo para la hora y fecha en formato legible // -- //
    public String getActualTime() {
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy");
        return fechaHoraActual.format(formato);
    }//Cierre getActualTime/*/
}//Cierre Tarea Class
