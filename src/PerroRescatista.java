public class PerroRescatista extends Perro {
    // Cada perro rescatista tiene una especialidad
    private String especialidad;

    // Recibimos los datos generales y la especialidad del perro rescatista.
    public PerroRescatista(String nombre, String raza, int edad, String especialidad) {
        super(nombre, raza, edad);
        this.especialidad = especialidad;
    }

    // Agregamos la especialidad a la ficha del perro rescatista.
    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Tipo: Rescatista");
        System.out.println("Especialidad: " + especialidad);
    }

    // Esta accion es exclusiva de los perros rescatistas.
    public void buscarPersona() {
        System.out.println(getNombre() + " inicia una búsqueda.");
        System.out.println("Especialidad: " + especialidad);
    } 
}
   