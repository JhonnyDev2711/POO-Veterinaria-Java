
public class PerroDomestico extends Perro {

    // Este dato es exclusivo de los perros domesticos.
    private String dueno;

    // El constructor recibe los datos generales y el nombre del dueño.
    public PerroDomestico(String nombre, String raza, int edad, String dueno) {
        super(nombre, raza, edad);
        this.dueno = dueno;
    }

    // Sobrescribimos la ficha para agregar la informacion del dueño.
    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Tipo: Domestico");
        System.out.println("Dueño: " + dueno);
    }

    // Esta accion es exclusiva de los perros domesticos.
    public void saludarDueno() {
        System.out.println(getNombre() + " mueve la cola al ver a " + dueno + ".");
    }
}


