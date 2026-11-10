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
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] temperaturas = new int[5];
        
        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("Escribe la temperatura");    
            int numero = entrada.nextInt();
            temperaturas[i] = numero;
        }
         
        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("La temperatura es: " + temperaturas[i]);    
        }

    
    }
}
