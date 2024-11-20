package co.edu.konradlorenz.model;

import java.util.ArrayList;

/*
 * @author Bautista_López_Patiño_Prieto
 */

public class AdministradorTareas {

    //Atributos
    private ArrayList<Tarea> colaArrayList;

    //Constructor
    public AdministradorTareas() {
        this.colaArrayList = new ArrayList<>();
    }//Cierre constructor

    public ArrayList<Tarea> getColaArrayList() {
        return colaArrayList;
    }

    public void agregarTarea(Tarea tarea) {
        colaArrayList.add(tarea);
    }//Cierre agregar tarea

    public boolean estaVacia() {
        return colaArrayList.isEmpty();
    }

}//Cierre AdministradirTareas
