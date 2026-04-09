
import java.util.Scanner;

pubic classFase2_aforo{
    public static void main(String args){

        Scanner sc = new Scanner(System.in);

        int capacidadMaxima = 80;
        int pasajerosActuales = 0;
        int totalSubieron = 0;
        int totalBajaron = 0;
        int paradasRecorridas = 0;
        int paradasConAforo = 0;
        int parada = 1;
        boolean rutaActiva = true;

        while (parada<=25 && rutaActiva){

        System.out.println("\n===PARADA"+parada+"de 25===");
        System.out.println("pasajeros en el bus:"+ pasajerosActuales);
        System.out.println("cuantos SUBEN?(-1 para terminar"):");

        int suben = sc,nextInt():

        if(suben==-1){
        rutaActiva=false;
        }else{
          System.out.print("cuantas BAJAN?");
        int bajan = sc,nexInt();

        //TODO1: validar que no bajen mas de los que hay
        if(bajan >pasajerosActuales){
        System.out.println(Error:solo hay"+ pasajerosActuales+"pasajeros en el bus.No pueden bajar"+bajan+".");
        bajan=pasajerosActuales;
        }

        //TODO2: validar que no se supere el aforo maximo
        if((pasajerosActuales+sueben-bajan)>80){
            System.out.println("Alerta:capacidad maxima superada.Solo subiran los que caben.");
            suben=80-(pasajerosActuales-bajan);
        }
        //TODO3: Actualizar pasajrosAcuales,totalSubieron,totalBajaron
        pasajerosActuales=pasajerosActuales+suben-bajan;
            totalSubieron=totalSubieron+suben;
            totalBajaron=totalBajaron+bajan;

        //TODO4: si el bus llego a 80, suemar 1a paradaConAforo
        if(pasajerosActuales==capacidadMaxima){
            paradaConAforo=paradaConAforo+1;
        }

        //TODO5: calacular porcentaje y mostrar estado del bus
        double porcentaje=(pasajerosActuales*100.0)/capacidadMaxima;
                       Strig estado;

                if(pasajerosActuales==80){
                    estado="AFORO MARIXO";
                }else if(porcentaje>=60){
                    estado="BUSLLENO";
                }else{
                    estado="NORMAL";
                }
                System.out.println("Estado actual:+ estado+"("+ porcentaje +"% de ocupacion)");

                //TODO: mostrar resumen final de la ruta
                System.out.println("\n===RESUMEN FINAL DE LA RUTA===");
                System.out.println("paradas compeletadas:"+ paradasRecorridas);
                System.out.println("total de pasajeros que subieron:"+ totalSubieron);
                System.out.ptintln("Total de pasajeros que bajaron:"+ totalBajaron);
                System.out.println("Paradas con el bus completamente lleno(Aforo):"+ paradasConAforo);
                System.out.println("pasajeros que quedaron en el bus al terminar:"+pasajerosActuales);

                   sc.close();
            }

        }
    }
}