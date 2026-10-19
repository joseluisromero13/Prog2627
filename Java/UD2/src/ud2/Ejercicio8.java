
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
public class Ejercicio8 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nota:");
        int nota = entrada.nextInt();
        
        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println("Tienes un insuficiente");
                break;
            case 5:
                System.out.println("Tienes un suficiente");
                break;
            case 6:
                System.out.println("Tienes un bien");
                break;
            case 7, 8:
                System.out.println("Tienes un notable");
                break;
            case 9, 10:
                System.out.println("Tienes un sobresaliente");
                break;
            default:
                System.out.println("Opción no valida, elija del 1-5");
        }
    }
}
