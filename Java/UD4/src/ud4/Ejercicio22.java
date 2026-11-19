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
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe una palabra:");
        String palabra = entrada.nextLine();
                
        System.out.println("La longitud de " + palabra + " es " + 
                palabra.length());
        
        System.out.println("La primera letra de " + palabra + " es " + 
                palabra.charAt(0));
        
        System.out.println("La primera letra de " + palabra + " es " + 
                palabra.charAt(palabra.length() - 1));
    }
}
