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
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe una Frase:");
        String frase = entrada.nextLine();
        String minuscula = frase.toLowerCase();
        int contador = 0;
        for (int i = 0 ; i < minuscula.length() ; i++){
            char c = minuscula.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                contador++;
            } 
        }
        System.out.println("Hay " + contador + " vocales.");
    }
}
