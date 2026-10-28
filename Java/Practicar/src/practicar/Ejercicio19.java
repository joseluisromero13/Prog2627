/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicar;
import java.util.Scanner;
/**
 *
 * @author 04_1DAW
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int intentos = 1;
        int teclado;
        final int pin = 5860;
        
        do {
            System.out.println("Escribe el pin.");
            teclado = entrada.nextInt();
            if (teclado == pin) {
                System.out.println("Contraseña correcta");
                System.out.println("Has necesitado " + intentos + " intentos");
            } else {
                System.out.println("Error pin incorrecto");
                System.out.println("Te quedan " + (3 - intentos) + " intentos");

                intentos++;
            }
            
            
            
            
        }while (intentos <= 3);
    }
}
