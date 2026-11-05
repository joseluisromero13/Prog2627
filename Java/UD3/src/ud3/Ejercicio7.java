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
public class Ejercicio7 {
       public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("-----Elige una opción-----");
        System.out.println("----- 1. SUMAR -----");
        System.out.println("----- 2. RESTAR -----");
        System.out.println("----- 3. MULTIPLICAR -----");
        System.out.println("----- 4. DIVIDIR -----");
        System.out.println("----- 5. POTENCIA -----");
        System.out.println("----- 6. RAIZ CUADRADA -----");
        int opcion = entrada.nextInt();
        
        System.out.println("Escribe el primer numero");
        double a = entrada.nextDouble();
        
        System.out.println("Escribe el segundo numero");
        double b = entrada.nextDouble();
        
//Control para pedir 2 numeros, 3 o 1
if (opcion == 1 || opcion == 2 || opcion == 4){
    
}       
        switch (opcion) {
            case 1:
              
                System.out.println("El resultado es " + suma(a, b));
                break;
            case 2:
                System.out.println("El resultado es " + resta(a, b));
                break;
            case 3:
                System.out.println("Elige un tipo de multiplicación");
                System.out.println("-----Elige una opción-----");
                System.out.println("----- 1. MULTIPLICAR CON DOS OPERADORES-----");
                System.out.println("----- 2. MULTIPLICAR CON 3 OPERADORES-----");
                System.out.println("----- 3. MULTIPLICAR CON DOS OPERADORES ENTEROS-----");
                int opcionMultiplicar = entrada.nextInt();
            /*Menu para las multiplicaciones*/    
                switch (opcionMultiplicar){
                    case 1:
                        System.out.println("El resultado es " + multiplicar(a, b));
                        
                        break;
                    case 2:
                        System.out.println("Escribe el tercer valor");
                        int c = entrada.nextInt();
                        System.out.println("El resultado es " + multiplicar((int)a, (int)b, (int)c));
                        break;
                        
                    case 3:
                        System.out.println("El resultado es " + multiplicar((int)a, (int)b));
                        break;
                    default:
                        System.out.println("Error opcion invalida de multiplicar.");
                        break;
                }
                break;
                
            case 4:
                if (b == 0){
                    System.out.println("No se puede dividir, el dividendo es 0");
                }else{
                System.out.println("El resultado es " + dividir(a, b));
                break;
                }
            case 5:
                System.out.println("El resultado es " + potencia(a, b));
                break;
            case 6:
                System.out.println("El resultado es " + raiz(a));
                break;
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
    
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    public static int multiplicar(int a, int b, int c) {
        return multiplicar(a, b) * c;
    }
    
    public static double dividir(double a, double b) {
            return a / b;
    }
    
    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }
    
    public static double raiz(double a){
        return Math.sqrt(a);
    }
}
