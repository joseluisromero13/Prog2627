package ud2;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 04_1DAW
 */
public class Ejercicio9 {
    public static void main(String[] Args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción (1(MULTIPLICACION), 2(DIVISION), 3(SUMA), 4(RESTA)");
        int opcion = entrada.nextInt();
        switch (opcion){
            case 1:
                System.out.println("MULTIPLICACIÓ");
                System.out.println("Introduce el primer número");
                int numPrimero = entrada.nextInt();
                System.out.println("Introduce el segundo número");
                int numSegundo = entrada.nextInt();
                System.out.println("El resultado de la mutiplicación es:" + (numPrimero * numSegundo));
            break;
            
            case 2:
                System.out.println("DIVISION");
                System.out.println("Introduce el primer número");
                int numDivisor = entrada.nextInt();
                System.out.println("Introduce el segundo número");
                int numDividendo = entrada.nextInt();
               
                if (numDivisor > numDividendo){
                System.out.println("El resultado de la división es:" + (numDivisor / numDividendo));
                }else{
                    System.out.println("No se puede realizar la división elige un divisor mayor que el dividendo");
                    }
            break;
            
            case 3:
                System.out.println("SUMA");
                System.out.println("Introduce el primer número");
                int sumaPrimero = entrada.nextInt();
                System.out.println("Introduce el segundo número");
                int sumaSegundo = entrada.nextInt();
                System.out.println("El resultado de la suma es:" + (sumaPrimero + sumaSegundo));
            break;
            
            case 4:
                System.out.println("RESTA");
                System.out.println("Introduce el primer número");
                int restaPrimero = entrada.nextInt();
                System.out.println("Introduce el segundo número");
                int restaSegundo = entrada.nextInt();
                if (restaPrimero > restaSegundo){
                System.out.println("El resultado de la división es:" + (restaPrimero - restaSegundo));
                }else{
                    System.out.println("No se puede realizar la resta, elige un primer número mayor");
                }
            break;
            default:
                System.out.println("Opción no valida");
        }
    }
}
