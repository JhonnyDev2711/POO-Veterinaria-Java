REGISTRO BASICO DE PERROS - POO EN JAVA

Este proyecto es una practica sencilla de Programacion Orientada a Objetos.
La idea es registrar dos perros de ejemplo y probar algunas acciones desde la consola.

ARCHIVOS
- src/Perro.java: aqui esta la clase Perro, sus atributos, el constructor y sus metodos.
- src/Main.java: aqui se crean los objetos y se prueban los metodos.

CONCEPTOS QUE SE PRACTICAN
- Clase: Perro, que sirve como molde.
- Atributos: nombre, raza y edad.
- Constructor: recibe los datos iniciales del perro.
- Objetos: perro1 y perro2, creados con new.
- Metodos: mostrarFicha(), ladrar() y cumplirAnios().
- Encapsulamiento inicial: los atributos estan declarados como private.

COMO EJECUTAR
Se necesita tener instalado un JDK de Java.
Desde la carpeta principal del proyecto, abre una terminal y ejecuta:

javac -d out src/Perro.java src/Main.java
java -cp out Main

RESULTADO ESPERADO
El programa muestra la ficha de Max y Luna, simula sus ladridos y aumenta la edad de Max de 3 a 4 anios.
