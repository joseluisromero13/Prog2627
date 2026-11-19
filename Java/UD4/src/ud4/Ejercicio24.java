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
public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe la primera palabra:");
        String primera = entrada.nextLine();

        System.out.println("Escribe la segunda palabra:");
        String segunda = entrada.nextLine();

        //Comparación normal
        System.out.println("Las palabras: " + primera + " y " + segunda + " son iguales: " + (primera.equals(segunda)));
        //Ignorando mayusculas
        System.out.println("Las palabras: " + primera + " y " + segunda + " son iguales: " + (primera.equalsIgnoreCase(segunda)));

        if (primera.length() > segunda.length()) {
            System.out.println("La primera palabra es más larga que la segunda.");
        } else if (primera.length() < segunda.length()) {
            System.out.println("La segunda palabra es más larga que la primera:.");
        } else {
            System.out.println("Las dos palabras son igual de largas.");
        }

    }
}
