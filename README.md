# ProyectoED_TasKonradPlanning
Repositorio con el código del proyecto final de la materia Estructuras de datos 2024-II llamado "Task Planning"

Este es un proyecto de Java implementado utilizando el patrón de diseño MVC (Modelo-Vista-Controlador). El proyecto es una aplicación simple para gestionar un planificador de tareas, donde los usuarios pueden agregar, eliminar, buscar y mostrar tareas con diferentes prioridades.

#Características
El programa permite a los usuarios realizar las siguientes acciones:

Agregar tareas: Los usuarios pueden agregar nuevas tareas, proporcionando un nombre, una descripción y una prioridad para cada tarea.
Eliminar tareas: Los usuarios pueden eliminar tareas existentes por su nombre.
Buscar tareas por nombre: Permite a los usuarios buscar y visualizar tareas por su nombre.
Buscar tareas por prioridad: Los usuarios pueden buscar y listar todas las tareas con una prioridad específica.
Mostrar todas las tareas: Permite a los usuarios ver todas las tareas asignadas en la lista.

#Estructura del Proyecto
- El proyecto está estructurado en tres capas principales según el patrón MVC:

Modelo (model):
- Contiene las clases Tarea (que representa una tarea individual) y AdministradorTareas (que administra la lista de tareas).

Vista (view):
- Contiene la clase Vista, que maneja toda la interacción con el usuario, como la presentación de menús y mensajes.

Controlador (controller):
- Contiene la clase Control, que coordina la lógica de la aplicación y la interacción entre el modelo y la vista.

#Requisitos
Para ejecutar este proyecto, asegúrate de tener instalado Java. El proyecto fue desarrollado y probado con Java 8 o superior.
- Java Development Kit (JDK) 8 o superior.

