package co.edu.konradlorenz.view;

import co.edu.konradlorenz.model.Tarea;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Bautista_López_Patiño_Prieto
 */

public class Vista {

    //Scanner
    public static Scanner sc = new Scanner(System.in);

    //Metodo para mostrar mensajito aleatorio al usuario
    public void mensajito() {

        //Mensajito aleatorio para el usuario :3
        Random random = new Random();
        int numeroAleatorio = random.nextInt(5) + 1; //Se generan de 1 a 5 numeros aleatorios
        switch (numeroAleatorio) {
            case 1:
                System.out.println("Recuerda tomar agua!");
                break;
            case 2:
                System.out.println("Organiza tu éxito, tarea por tarea");
                break;
            case 3:
                System.out.println("Pequeños pasos, grandes logros!");
                break;
            case 4:
                System.out.println("Todo a su tiempo y lugar.");
                break;
            case 5:
                System.out.println("Bienvenid@ de vuelta!!!");
                break;
            default:
                System.out.println("Bienvenid@ a Task Planning");//Por si acaso no salta el mensaje :D
        }//Cierre switch

    }//Cierre Mensajito

    //Metodo para el menu de opciones
    public void menu() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Que deseas hacer?");
        System.out.println("1. Agregar tarea nueva");
        System.out.println("0. Salir");
    }//Cierre menu

    //Metodo para mostrar un mensaje de acción y la tarea que se necesita notificar
    public void estadoTarea(String mensaje, Tarea tarea) {
        System.out.println(mensaje + "" + tarea);
    }//Cierre estadoTarea

    //Metodo para mostrar mensajes al usuario
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }//Cierre mostrarMensaje

    //Metodo para tomar Entero por consola
    public int pedirInt(String mensaje) {
        System.out.println(mensaje);
        int op = sc.nextInt();
        sc.nextLine();
        return op;
    }//Cierre pedirInt

    //Metodo para pedir String
    public String pedirString(String mensaje) {
        System.out.println(mensaje);
        String op = sc.nextLine();
        return op;
    }//Cierre pedirString

}//Cierre Vista
