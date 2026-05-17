public class Inscripcion {

    private Estudiante estudiante;
    private Actividad actividad;

    // Constructor
    public Inscripcion(Estudiante estudiante,
                       Actividad actividad) {

        this.estudiante = estudiante;
        this.actividad = actividad;

    }

    // Mostrar inscripción
    public void mostrarInscripcion() {

        System.out.println(estudiante.getNombre()
        + " inscrito en "
        + actividad.getNombre());

    }

}