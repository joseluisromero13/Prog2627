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
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe una Frase:");
        String frase = entrada.nextLine();
        String minuscula = frase.toLowerCase();
        
        int letras = 0;
        int numeros = 0;
        int espacios = 0;
        int otros = 0;
        
        
        for (int i = 0; i < minuscula.length(); i++){
            char c = minuscula.charAt(i);
            
            if (Character.isLetter(c)){
                letras++;  
            } else if(Character.isDigit(c)){
                numeros++;
            } else if(Character.isWhitespace(c)){
                espacios++;
            } else{
                otros++;
            }
            
        }
        System.out.println("Letras: " + letras);
        System.out.println("Numeros: " + numeros);
        System.out.println("Espacios: " + espacios);
        System.out.println("Otros: " + otros); 
    }
}
