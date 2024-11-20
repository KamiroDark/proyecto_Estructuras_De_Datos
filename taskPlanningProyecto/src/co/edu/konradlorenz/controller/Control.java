package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.AdministradorTareas;
import co.edu.konradlorenz.model.Tarea;
import co.edu.konradlorenz.view.Vista;

public class Control {
    
    protected Vista objVista = new Vista();
    protected AdministradorTareas listaTareas = new AdministradorTareas();
    
    //Metodo para correr el programa
    public void run(){
        objVista.mostrarMensaje("TasKonrad Planning");
        int opcion;
        do {
        objVista.mensajito();
        mostrarTareas();
        objVista.menu();
        
        opcion = objVista.pedirInt("Digita una opcion del menu!:");
            switch (opcion) {
                case 1:
                    String nombre = objVista.pedirString("Ingresa el nombre de la tarea:");
                    String descripcion = objVista.pedirString("Agrega una descripción para acordarte ;)");
                    int prio = objVista.pedirInt("Que prioridad le quieres dar?(1, 2, 3...)");
                    Tarea nuevaTarea = new Tarea(nombre, descripcion, prio);
                    listaTareas.agregarTarea(nuevaTarea);
                    break;
                case 0:
                    objVista.mostrarMensaje("Nos vemos al rato!, Saliendo...");
                    System.exit(0);
                    break;
                default:
                    objVista.mostrarMensaje("Opción incorrecta, selecciona un numero dentro del menú");
            }
        } while (true);
    
    }//Cierre Run
    
    //Metodo para mostrar tareas
    public void mostrarTareas() {
        boolean vacio = listaTareas.estaVacia();

        if (vacio) {
            objVista.mostrarMensaje("No hay tareas en la lista");
        } else {
            for (Tarea tarea : listaTareas.getColaArrayList()) {
                objVista.estadoTarea("-", tarea);
            }
        }
    }//Cierre mostrarTareas

}//Cierre Control
