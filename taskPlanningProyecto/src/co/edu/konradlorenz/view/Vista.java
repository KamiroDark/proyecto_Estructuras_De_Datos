package co.edu.konradlorenz.view;

import co.edu.konradlorenz.model.Tarea;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author Bautista_López_Patiño_Prieto
 */
public class Vista {

    //Scanner estatico
    public static Scanner sc = new Scanner(System.in);

    //Metodo para mostrar un mensaje de motivación aleatorio para el usuario :3
    public void mensajito() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1;
        switch (numeroAleatorio) {
            case 1 ->
                System.out.println("Recuerda tomar agua!");
            case 2 ->
                System.out.println("Organiza tu éxito, tarea por tarea.");
            case 3 ->
                System.out.println("Pequeños pasos, grandes logros!");
            case 4 ->
                System.out.println("Todo a su tiempo y lugar.");
            case 5 ->
                System.out.println("Bienvenid@ de vuelta!!!");
            default ->
                System.out.println("Bienvenid@ a Task Planning");
        }
        //Cierre Switch
    }//Cierre mensajito

    //Metodo para crear el menu visualmente para el usuario
    public void menu() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        System.out.println("¿Qué deseas hacer?");
        System.out.println("1. Agregar tarea nueva");
        System.out.println("2. Eliminar tarea");
        System.out.println("3. Buscar tarea por nombre");
        System.out.println("4. Buscar tareas por prioridad");
        System.out.println("5. Mostrar todas las tareas asignadas");
        System.out.println("0. Salir");

    }//cierre menu

    public void estadoTarea(String mensaje, Tarea tarea) {
        System.out.println(mensaje + " " + tarea);
    }

    //Metodo para mostrar algun mensaje al usuario
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);

    }//Cierre mostrarMensaje

    //Metodo para pedir un Entero al usuario
    public int pedirInt(String mensaje) {
        while (true) {

            try {//Excepción por si se ingresa algo diferente a un numero
                System.out.println(mensaje);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero válido.");
            }
        }//Cierre While
    }//Cierre pedirInt

    //Metodo para pedir una Cadena de texto al usuario
    public String pedirString(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }//Cierre pedirString

    //Metodo para buscar una tarea en la lista
    public void mostrarTarea(Tarea tarea) {
        if (tarea != null) {
            System.out.println(tarea);
        } else {
            System.out.println("Tarea no encontrada.");
        }
    }//Cierre mostrarTarea

    //Metodo para mostrar todas las tareas en la lista actual
    public void mostrarListaTareas(ArrayList<Tarea> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No se encontraron tareas.");
        } else {
            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }
        }
    }//Cierre mostrarListaTareas
}//Cierre Vista Class
