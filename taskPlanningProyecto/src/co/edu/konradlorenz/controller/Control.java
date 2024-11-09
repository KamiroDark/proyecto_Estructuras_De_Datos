
package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Vista;


public class Control {
    
    protected Vista objVista = new Vista();
    
    //Metodo para correr el programa
    public void run(){
        objVista.menu();
    }//Cierre Run
    
}//Cierre Control
