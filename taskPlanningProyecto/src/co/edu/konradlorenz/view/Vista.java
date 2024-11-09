
package co.edu.konradlorenz.view;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Vista {
    
    //Scanner
    public static Scanner sc = new Scanner(System.in);
    
    //Metodo para menú
    public void menu(){
        System.out.println("------Task Planning------");
        
        //Mensajito aleatorio para el usuario :3
        Random random = new Random();
	int numeroAleatorio = random.nextInt(5) + 1;
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
            default:
                System.out.println("Bienvenid@ a Task Planning");//Por si acaso no salta el mensaje :D
        }//Cierre switch
        
        
    }//Cierre menu
    
}//Cierre Vista
