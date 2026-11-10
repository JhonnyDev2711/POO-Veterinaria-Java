
public class Perro {

    // Estos son los datos que comparten todos los perros.
    private String nombre;
    private String raza;
    private int edad;

    // El constructor recibe los datos y prepara al perro.
    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Estos metodos permiten consultar los datos privados.
    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    // Mostramos la informacion general del perro.
    public void mostrarFicha() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
    }

    // Simulamos un ladrido.
    public void ladrar() {
        System.out.println(nombre + " dice: Guau, guau!");
    }

    // Cada vez que llamamos este metodo, aumenta su edad.
    public void cumplirAnios() {
        edad++;
        System.out.println(nombre + " ahora tiene " + edad + " años.");
    }
}
