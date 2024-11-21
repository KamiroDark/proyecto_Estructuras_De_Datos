package co.edu.konradlorenz.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.io.*;

/*
 * @author Bautista_López_Patiño_Prieto
 */
public class AdministradorTareas {

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
        colaArrayList.add(tarea);
    }

    //Metodo para verificar si la lista esta vacia
    public boolean estaVacia() {
        return colaArrayList.isEmpty();
    }//Cierre estaVacia

    //Metodo para eliminar una tarea
    public boolean eliminarTarea(String nombreTarea) {
        return colaArrayList.removeIf(tarea -> tarea.getNombreTarea().equalsIgnoreCase(nombreTarea));
    }

    //Metodo para buscar una tarea por nombre
    public Tarea buscarTareaPorNombre(String nombreTarea) {
        for (Tarea tarea : colaArrayList) {
            if (tarea.getNombreTarea().equalsIgnoreCase(nombreTarea)) {
                return tarea;
            }
        }
        return null;
    }//Cierre buscarTareaPorNombre

    //Metodo para buscar tareas por prioridad
    public ArrayList<Tarea> buscarTareasPorPrioridad(int prioridad) {
        ArrayList<Tarea> tareasPorPrioridad = new ArrayList<>();
        for (Tarea tarea : colaArrayList) {
            if (tarea.getPrioridad() == prioridad) {
                tareasPorPrioridad.add(tarea);
            }
        }
        return tareasPorPrioridad;
    }//Cierre buscarTareasPorPrioridad

    //Metodo para organizar las tareas por prioridad
    public void ordenarPorPrioridad() {
        colaArrayList.sort(Comparator.comparingInt(Tarea::getPrioridad));
    }//Cierre ordenarPorPrioridad

    public void guardarTareasEnArchivo(String nombreArchivo) {
        // Usa la ruta relativa directamente
        File archivo = new File(nombreArchivo);  // "tareas.dat" guardado en el directorio de trabajo del proyecto
        File directorio = archivo.getParentFile(); // Obtener el directorio donde se encuentra el archivo

        // Si el directorio no existe, crearlo
        if (directorio != null && !directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado: " + directorio.getAbsolutePath());
            } else {
                System.out.println("No se pudo crear el directorio.");
                return;
            }
        }

        // Guardar el archivo
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
            oos.writeObject(colaArrayList);  // Escribe las tareas en el archivo
            System.out.println("Tareas guardadas exitosamente.");
            System.out.println("Archivo guardado en: " + archivo.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Error al guardar las tareas: " + e.getMessage());
        }
    }

    public void cargarTareasDesdeArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        // Verifica si el archivo existe
        if (!archivo.exists()) {
            System.out.println("No se encontró el archivo tareas.dat en: " + archivo.getAbsolutePath());
            System.out.println("Se iniciará con una lista vacía.");
            return;
        }

        // Intentar cargar las tareas
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
            colaArrayList = (ArrayList<Tarea>) ois.readObject();  // Recarga las tareas
            System.out.println("Tareas cargadas exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar las tareas: " + e.getMessage());
            colaArrayList = new ArrayList<>();  // Si ocurre un error, reinicia la lista
        }
    }
}//Cierre AdministradorTareas Class
