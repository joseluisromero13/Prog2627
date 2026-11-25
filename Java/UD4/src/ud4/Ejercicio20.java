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
public class Ejercicio20 {

    public static void main(String[] args) {
        int[][] numeros = {
            {2, 4, 6, 8},
            {1, 3, 5, 7},
            {10, 20, 30, 40}
        };
        int columnas = 0;
        
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[i].length; j++){
                System.out.println(numeros[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("==============");
        
        

    }
}
