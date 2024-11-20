package co.edu.konradlorenz.view;

import co.edu.konradlorenz.model.Tarea;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


/**
 * @author Bautista_López_Patiño_Prieto
 */
 
 public class Vista {
 
    public static Scanner sc = new Scanner(System.in);
 
    public void mensajito() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1;
        switch (numeroAleatorio) {
            case 1 -> System.out.println("Recuerda tomar agua!");
            case 2 -> System.out.println("Organiza tu éxito, tarea por tarea.");
            case 3 -> System.out.println("Pequeños pasos, grandes logros!");
            case 4 -> System.out.println("Todo a su tiempo y lugar.");
            case 5 -> System.out.println("Bienvenid@ de vuelta!!!");
            default -> System.out.println("Bienvenid@ a Task Planning");
        }
    }
 
    public void menu() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Agregar tarea nueva");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Buscar tarea por nombre");
        System.out.println("4. Buscar tareas por prioridad");
        System.out.println("5. Mostrar todas las tareas asignadas");
        System.out.println("0. Salir");
    }
 
    public void estadoTarea(String mensaje, Tarea tarea) {
        System.out.println(mensaje + " " + tarea);
    }
 
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
 
    public int pedirInt(String mensaje) {
        System.out.println(mensaje);
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }
 
    public String pedirString(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }
 
    public void mostrarTarea(Tarea tarea) {
        if (tarea != null) {
            System.out.println(tarea);
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }
 
    public void mostrarListaTareas(ArrayList<Tarea> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No se encontraron tareas.");
        } else {
            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }
        }
    }
}
 
