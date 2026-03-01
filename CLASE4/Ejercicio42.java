package CLASE4;

import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Pedir los números al usuario
        System.out.println("Digite el primer numero:");
        int numero1 = sc.nextInt();
        
        System.out.println("Digite el segundo numero:");
        int numero2 = sc.nextInt();
        
        // Condicional
        if (numero1 > numero2){
            System.out.println("El primer numero es el mayor");
        }else if (numero1 < numero2){
            System.out.println("El primer numero es el mas pequeno");
        }else{
            System.out.println("Ambos numeros son iguales");
        }
        
        sc.close();
    }
}
    

