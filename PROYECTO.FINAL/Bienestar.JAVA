import java.util.Scanner;

public class Bienestar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear estudiante
        Estudiante estudiante1 =
        new Estudiante("Maike",
                        "Peñue",
                        "1100256698",
                        4.2);

        // Crear actividades
        Actividad futbol =
        new Actividad("Futbol",
                       "Deporte",
                       "Lunes",
                       "2PM-5PM",
                       2,
                       5,
                       false);

        Actividad danza =
        new Actividad("Danza",
                       "Cultura",
                       "Lunes",
                       "2PM-5PM",
                       2,
                       4,
                       false);

        Actividad yoga =
        new Actividad("Yoga",
                       "Salud",
                       "Martes",
                       "8AM-10AM",
                       2,
                       6,
                       false);

        Actividad viaje =
        new Actividad("Viaje Cultural",
                       "Cultura",
                       "Viernes",
                       "7AM-4PM",
                       1,
                       8,
                       true);

        String diaGuardado = "";
        String horarioGuardado = "";

        int opcion;

        do {

            System.out.println("====================");
            System.out.println("SISTEMA BIENESTAR");
            System.out.println("====================");

            System.out.println("1. Ver actividades");
            System.out.println("2. Inscribirse en Futbol");
            System.out.println("3. Inscribirse en Danza");
            System.out.println("4. Inscribirse en Yoga");
            System.out.println("5. Inscribirse en Viaje Cultural");
            System.out.println("6. Ver información estudiante");
            System.out.println("7. Salir");

            opcion = sc.nextInt();

            switch(opcion) {

                case 1:

                    futbol.mostrarActividad();
                    danza.mostrarActividad();
                    yoga.mostrarActividad();
                    viaje.mostrarActividad();

                    break;

                case 2:

                    if(futbol.getCupos() > 0) {

                        if(diaGuardado.equals(futbol.getDia()) &&
                           horarioGuardado.equals(futbol.getHorario())) {

                            System.out.println("Error, el horario se cruza");

                        } else {

                            futbol.disminuirCupo();

                            estudiante1.agregarHoras(
                            futbol.getCategoria(),
                            futbol.getHoras());

                            Inscripcion ins1 =
                            new Inscripcion(estudiante1, futbol);

                            ins1.mostrarInscripcion();

                            diaGuardado = futbol.getDia();
                            horarioGuardado = futbol.getHorario();

                        }

                    } else {

                        System.out.println("No hay cupos");

                    }

                    break;

                case 3:

                    if(danza.getCupos() > 0) {

                        if(diaGuardado.equals(danza.getDia()) &&
                           horarioGuardado.equals(danza.getHorario())) {

                            System.out.println("Error, el horario se cruza");

                        } else {

                            danza.disminuirCupo();

                            estudiante1.agregarHoras(
                            danza.getCategoria(),
                            danza.getHoras());

                            Inscripcion ins2 =
                            new Inscripcion(estudiante1, danza);

                            ins2.mostrarInscripcion();

                            diaGuardado = danza.getDia();
                            horarioGuardado = danza.getHorario();

                        }

                    } else {

                        System.out.println("No hay cupos");

                    }

                    break;

                case 4:

                    if(yoga.getCupos() > 0) {

                        if(diaGuardado.equals(yoga.getDia()) &&
                           horarioGuardado.equals(yoga.getHorario())) {

                            System.out.println("Error, el horario se cruza");

                        } else {

                            yoga.disminuirCupo();

                            estudiante1.agregarHoras(
                            yoga.getCategoria(),
                            yoga.getHoras());

                            Inscripcion ins3 =
                            new Inscripcion(estudiante1, yoga);

                            ins3.mostrarInscripcion();

                            diaGuardado = yoga.getDia();
                            horarioGuardado = yoga.getHorario();

                        }

                    } else {

                        System.out.println("No hay cupos");

                    }

                    break;

                case 5:

                    if(estudiante1.getPromedio() >= 4.0) {

                        if(viaje.getCupos() > 0) {

                            viaje.disminuirCupo();

                            estudiante1.agregarHoras(
                            viaje.getCategoria(),
                            viaje.getHoras());

                            Inscripcion ins4 =
                            new Inscripcion(estudiante1, viaje);

                            ins4.mostrarInscripcion();

                        } else {

                            System.out.println("No hay cupos");

                        }

                    } else {

                        System.out.println("No puede ingresar por promedio bajo");

                    }

                    break;

                case 6:

                    estudiante1.mostrarInformacion();

                    if(estudiante1.getHorasDeporte() >= 10 &&
                       estudiante1.getHorasCultura() >= 10 &&
                       estudiante1.getHorasSalud() >= 10) {

                        System.out.println("APTO PARA GRADO");

                    } else {

                        System.out.println("NO APTO PARA GRADO");

                    }

                    break;

                case 7:

                    System.out.println("Saliendo del sistema...");

                    break;

                default:

                    System.out.println("Opción inválida");

            }

        } while(opcion != 7);

    }

}