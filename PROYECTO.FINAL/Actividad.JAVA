public class Actividad {

    private String nombre;
    private String categoria;

    private String dia;
    private String horario;

    private int cupos;
    private int horas;

    private boolean especial;

    // Constructor
    public Actividad(String nombre,
                     String categoria,
                     String dia,
                     String horario,
                     int cupos,
                     int horas,
                     boolean especial) {

        this.nombre = nombre;
        this.categoria = categoria;

        this.dia = dia;
        this.horario = horario;

        this.cupos = cupos;
        this.horas = horas;

        this.especial = especial;

    }

    // Getters
    public String getNombre() {

        return nombre;

    }

    public String getCategoria() {

        return categoria;

    }

    public String getDia() {

        return dia;

    }

    public String getHorario() {

        return horario;

    }

    public int getCupos() {

        return cupos;

    }

    public int getHoras() {

        return horas;

    }

    public boolean isEspecial() {

        return especial;

    }

    // Disminuir cupos
    public void disminuirCupo() {

        if(cupos > 0) {

            cupos--;

        }

    }

    // Mostrar actividad
    public void mostrarActividad() {

        System.out.println("====================");
        System.out.println("ACTIVIDAD");
        System.out.println("====================");

        System.out.println("Nombre: " + nombre);
        System.out.println("Categoria: " + categoria);

        System.out.println("Dia: " + dia);
        System.out.println("Horario: " + horario);

        System.out.println("Cupos: " + cupos);
        System.out.println("Horas: " + horas);

    }

}