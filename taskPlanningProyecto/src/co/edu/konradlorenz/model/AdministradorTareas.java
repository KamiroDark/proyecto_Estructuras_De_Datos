package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.Vista;
import java.util.ArrayList;
import java.util.Comparator;
import java.io.*;

/*
 * @author // Integrantes del grupo //
 *  Jose Luis Patiño | 506232065
 *  Laura Valentina López García | 506232714
 *  Briyid Tatiana Bautista Atuesta | 506222708
 *  Juan Camilo Prieto Mestizo | 506232717
 */
public class AdministradorTareas {

    protected Vista objVista = new Vista();

    // -- Atributos -- //
    private ArrayList<Tarea> colaArrayList;

    // -- Constructor -- //
    public AdministradorTareas() {
        this.colaArrayList = new ArrayList<>();
    }

    // -- Get & Set -- //
    public ArrayList<Tarea> getColaArrayList() {
        return colaArrayList;
    }

    public void agregarTarea(Tarea tarea) {
        tarea.setPrioridad(colaArrayList.size() + 1);
        colaArrayList.add(tarea);
    }

    //Metodo para verificar si la lista esta vacia
    public boolean estaVacia() {
        return colaArrayList.isEmpty();
    }//Cierre estaVacia

    //Metodo para eliminar una tarea
    public void eliminarTarea() {
        colaArrayList.remove(0);
        for (int i = 0; i < colaArrayList.size(); i++) {
            colaArrayList.get(i).setPrioridad(i + 1);
        }

    }//Cierre eliminarTarea

    //Metodo para buscar una tarea por nombre
    public Tarea buscarTareaPorNombre(String nombreTarea) {
        for (Tarea tarea : colaArrayList) {
            if (tarea.getNombreTarea().contains(nombreTarea)) {
                return tarea;
            }
        }
        return null;
    }//Cierre buscarTareaPorNombre

    //Metodo para buscar tareas por prioridad
    public Tarea buscarTareasPorPrioridad(int prioridad) {

        for (Tarea tarea : colaArrayList) {
            if (tarea.getPrioridad() == prioridad) {
                return tarea;
            }
        }
        return null;

    }//Cierre buscarTareasPorPrioridad

    //Metodo de persistencia para guardar un archivo en el dispositivo
    public void guardarTareasEnArchivo(String nombreArchivo) {
        // Usa la ruta relativa directamente
        File archivo = new File(nombreArchivo);  // "tareas.dat" guardado en el directorio de trabajo del proyecto
        File directorio = archivo.getParentFile(); // Obtener el directorio donde se encuentra el archivo

        // Si el directorio no existe, crearlo
        if (directorio != null && !directorio.exists()) {
            if (directorio.mkdirs()) {

                objVista.mostrarMensaje("Directorio creado: " + directorio.getAbsolutePath());
            } else {
                objVista.mostrarMensaje("No se pudo crear el directorio.");
                return;
            }
        }

        // Guardar el archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(colaArrayList);  // Escribe las tareas en el archivo
            objVista.mostrarMensaje("Tareas guardadas exitosamente.");
            objVista.mostrarMensaje("Archivo guardado en: " + archivo.getAbsolutePath());

        } catch (IOException e) {
            objVista.mostrarMensaje("Error al guardar las tareas: " + e.getMessage());
        }
    }//Cierre guardarTareasEnArchivo
    
    //Metodo para buscar y cargar los datos del archivo dentro del dispositivo
    public void cargarTareasDesdeArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        // Verifica si el archivo existe
        if (!archivo.exists()) {
            objVista.mostrarMensaje("No se encontró el archivo tareas.dat en: " + archivo.getAbsolutePath());
            objVista.mostrarMensaje("Se iniciará con una lista vacía.");
            return;
        }

        // Intentar cargar las tareas
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            colaArrayList = (ArrayList<Tarea>) ois.readObject();  // Recarga las tareas
            objVista.mostrarMensaje("Tareas cargadas exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            objVista.mostrarMensaje("Error al cargar las tareas: " + e.getMessage());
            colaArrayList = new ArrayList<>();  // Si ocurre un error, reinicia la lista
        }
    }//Cierre cargarTareasDesdeArchivo
    
}//Cierre AdministradorTareas Class
