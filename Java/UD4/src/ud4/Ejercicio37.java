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
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Escribe un Codigo:");
            String frase = entrada.nextLine();
            System.out.println("Codigo: " + frase);
            System.out.println("Resultado: " + frase.matches("[A-Z]{2}\\d{4}"));

        } while (!"SALIR".equals(frase));
    
    }
}
