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
       
        int contadora = 0;
        int contadore = 0;
        int contadori = 0;
        int contadoro = 0;
        int contadoru = 0;
        for (int i = 0 ; i < minuscula.length() ; i++){
            char c = minuscula.charAt(i);
            
            if (c == 'a'  c == 'i' || c == 'o' || c == 'u'){
                
            } else if(c == 'e'){
                    
                    }
                  
        }
        System.out.println("Hay " + contador + " vocales.");
    }
}
