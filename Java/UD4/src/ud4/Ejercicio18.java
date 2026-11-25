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
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = {1, 2, 3, 4, 5};
        mostrar(numeros);
        incrementar(numeros);
        mostrar(numeros);

    }
    
    public static void incrementar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] + 1;
        }
    }

    public static void mostrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public static void multiplicar(int[] numeros, int factor) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el factor de multiplicaciion: ");
        int multiplicador = entrada.nextInt();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * multiplicador;
        }
    }
    
    public static void rellenarCeros(int[] numeros){        
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }
    }

}
