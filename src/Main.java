public class Main {

    public static void main(String[] args) {

        System.out.println("REGISTRO DE PERROS: HERENCIA\n");

        PerroDomestico max = new PerroDomestico(
            "Max", "Chihuahua", 3, "Alex"
        );

        System.out.println("--- PERRO DOMESTICO ---");
        max.mostrarFicha();
        max.ladrar();
        max.saludarDueno();
        max.cumplirAnios();

        System.out.println();

        PerroRescatista luna = new PerroRescatista(
            "Luna", "Labrador", 4, "Búsqueda y rescate"
        );

        System.out.println("--- PERRO RESCATISTA ---");
        luna.mostrarFicha();
        luna.ladrar();
        luna.buscarPersona();
    }
}