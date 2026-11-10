
REGISTRO DE PERROS - PROGRAMACION ORIENTADA A OBJETOS EN JAVA

Este proyecto es una practica de Programacion Orientada a Objetos. En esta version se amplia el registro basico de perros desarrollado anteriormente, aplicando el concepto de herencia para crear diferentes tipos de perros y reutilizar informacion y acciones de una clase base.

La aplicacion utiliza como ejemplo una pequeña veterinaria, donde se registran dos tipos de perros, uno domestico y otro rescatista.

ARCHIVOS DEL PROYECTO

- src/Perro.java: contiene la clase base, sus atributos, constructor y metodos generales.

- src/PerroDomestico.java: contiene la clase derivada que agrega el nombre del dueño y una accion propia.

- src/PerroRescatista.java: contiene la clase derivada que agrega una especialidad de busqueda y rescate.

- src/Main.java: contiene el metodo principal, donde se crean los objetos y se prueban sus metodos.

CONCEPTOS QUE SE PRACTICAN

- Clase base: Perro, que contiene la informacion y acciones comunes.

- Clases derivadas: PerroDomestico y PerroRescatista.

- Herencia: reutilizacion de atributos y metodos mediante extends.

- Constructores: inicializacion de los objetos mediante super().

- Encapsulamiento: proteccion de atributos mediante private.

- Getters: metodos para consultar los atributos privados.

- Sobrescritura: modificacion del metodo mostrarFicha() mediante @Override.

- Metodos propios: saludarDueno() y buscarPersona().

RESULTADO ESPERADO

El programa muestra la ficha de Max como perro domestico y Luna como perro rescatista, ambos utilizan los metodos heredados y ejecutan sus acciones correspondientes.

Max puede mostrar su ficha, ladrar, saludar a su dueño y cumplir años.

Luna puede mostrar su ficha, ladrar e iniciar una busqueda de personas de acuerdo con su especialidad.

ENTORNO DE DESARROLLO

El proyecto fue desarrollado en Java utilizando el JDK instalado en el equipo y Visual Studio Code como entorno de desarrollo.

Durante la escritura del codigo se utilizo IntelliSense de VS Code como apoyo para recibir sugerencias y autocompletado de instrucciones y sintaxis.

Para ejecutar el programa se abre el archivo Main.java en Visual Studio Code y se utiliza la opcion Run Without Debugging.

REPOSITORIO

La Actividad Formativa 3 se encuentra en la rama:

Actividad-3-Herencia

El proyecto conserva la version anterior en main y mantiene los cambios de herencia en una rama independiente.
