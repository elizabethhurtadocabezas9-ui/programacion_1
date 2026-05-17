public class estudante{

    private String nombre;
    private String apellido;
    private String identificacion;

    private double promedio;

    private int horasDeporte;
    private int horasCultura;
    private int horasSalud;

    private int horasTotales;

    //constructor
    public Estudiante(String nombre,String apellido,String identificacion,double promedio){

        this.nombre=nombre;
        this.apellido=apellido;
        this identificacion=identificacion;
        this.promedio=promedio;
    }

    /Gtters
    public String getNombre(){

        return nombre;
    }

    public double getPromedio(){

        return promedio;
    }

    public int getHorasDeporte(){

        return horasDeporte;

    }

    public int getHorasCulrura(){

        return horasCultura;

    }

    public int getHorasSalud(){

        return horasSalud;

    }

    public int getHorasTotales(){

        return horasTotales;

    }

    //Agregarhoras
    public void Agregarhoras(String categoria,int horas){

        if(categoria,equals("deporte")){

            horasDeporte}+=horas;

        }

        else if(categoria.equals("cultura")){

            horasCultura+=horas;

        }

        else if(categoria.equals("Salud")){

            horasSalud+=horas;

        }

        horasTotales=horasDeporte+horasCultura+horasSalud;

    }

    //penalizacion
    public void aplicarPenalizacion(){

        horasTotales-=2;

    }

    //Mostrar informacion
    public void mostrarInformacion(){

        System.out,pritln("===============");
        System.out.pritln("ESTUDIANTE");
        System.out.pritln("===============");

        System.out.pritln("Nombre:"+ nombre);
        System.out.pritln("Apellido:"+ apellido);
        System.out.pritln("Identificacion"+ identificacion);

        System.out.pritln("Promedio:"+ promedio);

        System.out.pritln("Horas deporte"+ horasDeporte);
        System.out.pritln("Horas cultura"+ horasCultura);
        System.out.pritln("Horas salud" + horasSalud);

        System.out.pritln("Horas totales"+ horasTotales);
    }
    }
    
}

