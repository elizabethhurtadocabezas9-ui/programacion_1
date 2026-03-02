import java.util.Scanner;

public class Parcial1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final int CLAVE_CORRECTA = 1234;
        final int SALDO_CUENTA = 900000;

        int claveDigitada;
        int cantidad;
        int saldoRestante;

        System.out.println("=== CAJERO AUTOMÁTICO UNIVERSITARIO ===");
        System.out.print("Ingrese su clave de acceso: ");
        claveDigitada = teclado.nextInt();

        if (claveDigitada == CLAVE_CORRECTA) {

            System.out.println("Autenticación exitosa.");
            System.out.print("¿Cuánto dinero desea retirar?: ");
            cantidad = teclado.nextInt();

            int comision = (cantidad > 250000) ? 2500 : 0;

            if (cantidad + comision <= SALDO_CUENTA) {

                saldoRestante = SALDO_CUENTA - (cantidad + comision);

                System.out.println("\nMovimiento aprobado.");
                System.out.println("Comisión aplicada: $" + comision);
                System.out.println("Saldo disponible después del retiro: $" + saldoRestante);

            } else {
                System.out.println("Operación cancelada: saldo insuficiente.");
            }

        } else {
            System.out.println("Clave incorrecta. Acceso bloqueado.");
        }

        teclado.close();
    }
}
                    
    

            
        

                







    
      




    
