public class Main {
    public static void main(String[] args) {
        // Creamos dos perros usando el constructor de la clase Perro.
        Perro perro1 = new Perro("Max", "Chihuahua", 3);
        Perro perro2 = new Perro("Luna", "Labrador", 4);

        System.out.println("=== REGISTRO DE PERROS ===");

        // Probamos los metodos con Max.
        System.out.println("\n--- Perro 1 ---");
        perro1.mostrarFicha();
        perro1.ladrar();
        perro1.cumplirAnios();

        // Ahora hacemos lo mismo con Luna.
        System.out.println("\n--- Perro 2 ---");
        perro2.mostrarFicha();
        perro2.ladrar();
    }
}
