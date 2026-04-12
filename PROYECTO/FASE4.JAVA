package Proyecto;

import java.util.Scanner;

public class Fase4_Reporte{
    public static void main(String[]arg){

        Scanner sc = new Scanner(System.in);

        int totalPasajerosDia = 0;
        int totalVueltas = 0;

        double totalRecaudo =0;
        double maxRecaudo =0;
        double recaudo;
        double promedio;

        int maxPasajeros =0;
        int minPasajeros = Integer.MAX_VALUE;

        String rutaMasConcurrida ="";
        String rutaMenosConcurrida ="";
        String rutaMayorRecaudo ="";
        String nombreRuta;

        int pasajeros,vueltas,pctNormal,pctEstudiante;

        for (int ruta = 1; ruta<=1;ruta<=3;ruta++){

            //Determinar nombre de la ruta
            if(ruta==1){
                nombreRuta="T31";
            }else if (ruta==2){
                nombreRuta="A10";
            }else{
                nombreRuta="P22A";
            }

            System.out.println("\n-----Datos de la ruta"+ nombreRuta+"-----");

        System.out.println("Ingrese pasajeros:");
        pasajeros = sc.nextInt();

        System.out.print("Ingese vuetas:");
        vueltas=sc,nextInt();

        System.out.print("Ingrese porcentaje normal:");
        pctNormal=sc.nextInt();

        //TODO:calcular pctEstudiante y recaudo pctEstudiante=100-pctNormal;

        recaudo= pasajes*((pctNormal*3000+pctEstudiante*1500)/100.0);

        //TODO:actualizar acumuladores globales
         totalpasajerosDia+=pasajeros;
         totalRecaudoDia+=recaudo;
         totalVueltas+=vueltas;

         //TODO:actualizar maximos y minimos

         if(pasajeros>maxPasajeros){
            maxPasajeros=pasajeros;
            rutaMasConcurrida=nombreRuta;
         }

         if(pasajeros<minPasajeros){
            minPasajeros=pasajeros;
            rutaMenosConcurrida=nombreRuta;
         }

         //TODO:calcular promedio

         promedio=totalpasajerosDia/3.0;

         //TODO:imprimir reporte final


         System.out.println("\n========================");
         System.out.println("TOTAL PASAJEROS:"+totalpasajerosDia);
         System.out.println("TOTAL RECAUDO:$"+totalRecaudoDia);
         System.out.println("ruta mas concurrida:"+rutaMasConcurrida+"(+maxpasajeros+")");
         System.out.println("ruta menos concurrida:"+rutamenosconcurrida+"("minpasajeros+")");
         System.out.println("ruta mayor recaudo:"+rutaMayorRecaudo:"+ rutaMayorRecaudo+"($"+ maxRecaudo+")");
         System.out.println("promedio pasajeros:"+promedio);

         sc.close();
        

        }
    }
}