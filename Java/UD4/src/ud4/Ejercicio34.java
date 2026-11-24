/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio34 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe una Frase:");
        String frase = entrada.nextLine(); 
        
        System.out.println("Escribe un caracter:");
        char letra = entrada.nextLine().charAt(0);
        
        String minusculas = frase.toLowerCase();
        int apariciones = 0;
        boolean aparece = false;
        int posicion = -1;
        
        //indexOf  --> primer caracter
        //lastIndexOf --> ultimo
        
        for(int i = 0; i < frase.length(); i++){
            char c = minusculas.charAt(i);
            
            if (c == letra){
                aparece = true;
                apariciones++;
                
            } 
            
            
            
        }
        
        System.out.println(aparece);
        System.out.println(apariciones);
        
        
    }
}
