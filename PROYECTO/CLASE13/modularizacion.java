package CLASE13;

public class modularizacion {
    public static void main(String[] args) {

 }

 public static double convertirDolares(double monedaLocal) {
 return monedaLocal / 3631.44;
 }

 public static void mostrarSaludo(Stringnombre) {
System.out.println("Bienvenido al curso " + nombre + "...");
 }

 public static double descuento(int precio) {
 return precio - (precio * 0.15);
 }

 public static double calcularDescuento(int precio, double descuento) {
 return precio - (precio * (descuento / 100));
 }
}
