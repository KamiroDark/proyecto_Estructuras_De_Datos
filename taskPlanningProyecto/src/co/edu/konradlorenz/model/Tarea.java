package co.edu.konradlorenz.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * @author Bautista_López_Patiño_Prieto
 */

public class Tarea {

    //Atributos de la tarea
    private String nombreTarea;
    private String descripcion;
    private int prioridad;

    //Constructor
    public Tarea(String nombreTarea, String descripcion, int prioridad) {
        this.nombreTarea = nombreTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }//Cierre Constructor

    //Constructor vacio
    public Tarea() {
    }

    //Getters & Setters
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

    //ToString
    @Override
    public String toString() {
        return getActualTime()+ " "+ prioridad + ". " + nombreTarea + " | Descripción: " + descripcion;
    }

    //Metodo para mostrar fecha de manera agradable a la vista
    public String getActualTime() {
        LocalDateTime fechaHoraActual = LocalDateTime.now(); //Formato de LocalDate Time: YYYY-MM-DDTHH:MM:SS
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"); //Formato más agradable a la vista.
        String actualTime = fechaHoraActual.format(formato);
        return actualTime;
    }//Cierre getActualTime
    
}//Cierre tarea
