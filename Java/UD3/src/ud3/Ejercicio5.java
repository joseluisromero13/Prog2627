
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud3;

import java.util.Scanner;

/**
 *
 * @author 04_1DAW
 */

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("-----Elige una opción-----");
        System.out.println("----- 1. SUMAR -----");
        System.out.println("----- 2. RESTAR -----");
        System.out.println("----- 3. MULTIPLICAR -----");
        System.out.println("----- 4. DIVIDIR -----");
        int opcion = entrada.nextInt();
        
        System.out.println("Escribe el primer numero");
        int a = entrada.nextInt();
        
        System.out.println("Escribe el segundo numero");
        int b = entrada.nextInt();
        
        switch (opcion) {
            case 1:
              
                System.out.println("El resultado es " + suma(a, b));
                break;
            case 2:
                System.out.println("El resultado es " + resta(a, b));
                break;
            case 3:
                System.out.println("El resultado es " + multiplicar(a, b));
                break;
            case 4:
                System.out.println("El resultado es " + dividir(a, b));
                break;
            default:
                System.out.println("Error opcion invalida.");
                break;
        }
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
            return a / b;
    }
}
