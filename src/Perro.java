public class Perro {
    // Aqui guardamos los datos que tiene cada perro.
    private String nombre;
    private String raza;
    private int edad;

    // Este constructor recibe los datos y los deja guardados en el perro nuevo.
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Mostramos la informacion del perro en la consola.
    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " anios");
    }

    // Simulamos que el perro esta ladrando.
    public void ladrar() {
        System.out.println(nombre + " dice: Guau, guau!");
    }

    // Cada vez que llamamos este metodo, le sumamos un anio.
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " anios.");
    }
}
