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
public class ejercicio1 {
    
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0 ; i < numeros.length ; i++) {
        System.out.println(numeros[i]);
    }
        
        numeros[2] = 6;
        
        for (int i = 0 ; i < numeros.length ; i++) {
        System.out.println(numeros[i]);
        }
    }
}
