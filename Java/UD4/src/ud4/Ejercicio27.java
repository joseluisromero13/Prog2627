/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4;
import java.util.Scanner;

/**
 *
 * @author 04_1DAW
 */
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe una Palabra:");
        String palabra = entrada.nextLine();
        
        System.out.println("Escribe una Frase:");
        String frase = entrada.nextLine();
       
        System.out.println("La frase contiene la palabra?: " + frase.toLowerCase().contains(palabra));
        System.out.println("Posición:: " + frase.toLowerCase().indexOf(palabra));
        System.out.println("¿Comienza por ella?:: " + frase.toLowerCase().startsWith(palabra));
        System.out.println("¿Termina por ella?:: " + frase.toLowerCase().endsWith(palabra));
        
    }
}
