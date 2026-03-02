import java.util.Scanner;

public class parcial {

    public static void main(String arg) {

        Scanner teclado= new Scanner(System.in);

        final int CLAVE_CORRECTA = 1234;
        final int SALDO_CUENTA = 900000;

        int claveDigitada;
        int cantidad;
        int saldoRestante;

        System.out.println("===CAJERO AUTOMATICO UNIVERSITARIO ===");
        System.out.print("Ingrese su clave de acceso: ");
        claveDigitada = teclado.nextInt();

        if (claveDigitada == CLAVE_CORRECTA) {
            
            System.out.println("autentificacion exitosa");
            System.out.print("¿cuanto dinero desea retirar?:");
            cantidad = teclado.nextInt();

            int comision = (cantidad > 250000) ? 2500 : 0;
            if (cantidad + comision <= SALDO_CUENTA) {


                saldoRestante = SALDO_CUENTA - ( cantidad + comision);

                System.out.println("nMovimiento aprovado.");
                System.out.println("comision apliacada: $" + comision);
                System.out.println("saldo disponible despues del retiro: $" + saldoRestante);

                } else {
                    System.out.println("Operacion cancelada: saldo insuficiente.");
                }
                
                } else {
                    System.out.println("Clave incorrecta. Acceso bloqueado.");
                }

                teclado.close();

                


                
                    
                    




            }
        

    }

                   
    

            
        

                







    
      




    
