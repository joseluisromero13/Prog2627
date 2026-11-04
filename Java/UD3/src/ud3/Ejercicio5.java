
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
        double a = entrada.nextDouble();
        
        System.out.println("Escribe el segundo numero");
        double b = entrada.nextDouble();
        
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
                if (b == 0){
                    System.out.println("No se puede dividir, el dividendo es 0");
                }else{
                System.out.println("El resultado es " + dividir(a, b));
                break;
                }
            default:
                System.out.println("Error opcion invalida.");
                break;
        }
    }
   
    
    
    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }
    
    

    public static double dividir(double a, double b) {
            return a / b;
    }
}

