package co.edu.konradlorenz.controller;

/*
* @author Bautista_López_Patiño_Prieto
 */
import co.edu.konradlorenz.model.AdministradorTareas;
import co.edu.konradlorenz.model.Tarea;
import co.edu.konradlorenz.view.Vista;
import java.util.ArrayList;

public class Control {

    protected Vista objVista = new Vista();
    protected AdministradorTareas listaTareas = new AdministradorTareas();

    public void run() {
        listaTareas.cargarTareasDesdeArchivo("tareas.dat");
        objVista.mostrarMensaje("TasKonrad Planning");
        int opcion;
        do {
            objVista.mensajito();
            mostrarTareas();
            objVista.menu();

            opcion = objVista.pedirInt("Digita una opción del menú:");
            switch (opcion) {

                case 1:
                    String nombre = objVista.pedirString("Ingresa el nombre de la tarea:");
                    String descripcion = objVista.pedirString("Agrega una descripción:");
                    int prio = objVista.pedirInt("¿Qué prioridad le quieres dar? (1, 2, 3...)");

                    Tarea nuevaTarea = new Tarea(nombre, descripcion, prio);
                    listaTareas.agregarTarea(nuevaTarea);
                    break;
                case 2:
                    String nombreEliminar = objVista.pedirString("Ingresa el nombre de la tarea a eliminar:");
                    boolean eliminada = listaTareas.eliminarTarea(nombreEliminar);
                    if (eliminada) {
                        objVista.mostrarMensaje("Se completó / eliminó " + nombreEliminar);
                    } else {
                        objVista.mostrarMensaje("No se encontró una tarea con ese nombre.");
                    }
                    break;
                case 3:
                    String nombreBuscar = objVista.pedirString("Ingresa el nombre de la tarea a buscar:");
                    Tarea tareaEncontrada = listaTareas.buscarTareaPorNombre(nombreBuscar);
                    objVista.mostrarTarea(tareaEncontrada);
                    break;
                case 4:
                    int prioridadBuscar = objVista.pedirInt("Ingresa la prioridad a buscar:");
                    Tarea tareasPrioridad = listaTareas.buscarTareasPorPrioridad(prioridadBuscar);
                    objVista.mostrarTarea(tareasPrioridad);
                    break;
                case 5:
                    mostrarTareas();
                    break;
                case 6:
                    listaTareas.guardarTareasEnArchivo("tareas.dat");
                    objVista.mostrarMensaje("Nos vemos al rato! Tareas guardadas.");

                    // Mostrar las tareas después de cargarlas
                    mostrarTareas();
                    
                    System.exit(0);
                    break;
                case 7:
                    objVista.mostrarMensaje("Nos vemos!!");
                    objVista.mostrarMensaje("Saliendo...");
                    System.exit(0);
                default:
                    objVista.mostrarMensaje("Opción incorrecta. Selecciona un número dentro del menú.");
            }
        } while (true);
    }

    // -- Metodo para mostrar Tareas -- //
    public void mostrarTareas() {
        boolean vacio = listaTareas.estaVacia();
        if (vacio) {
            objVista.mostrarMensaje("No hay tareas en la lista.");
        } else {
            listaTareas.ordenarPorPrioridad();
            for (Tarea tarea : listaTareas.getColaArrayList()) {
                objVista.estadoTarea("-", tarea);
            }

        }
    }//Cierre mostrarTareas

}//Cierre Control
