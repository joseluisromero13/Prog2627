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
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = {12, 5, 8, 21, 4, 16, 9};

        System.out.println("Escribe el numero que deseas buscar: ");
        int buscar = entrada.nextInt();

        int contador = 0;
        boolean aparece = false;
        int primera = -1;
        int ultima = -1;
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                aparece = true;
                contador++;
                if (primera == -1) {
                    primera = i;
                }
                ultima = i;
            }

        }
        System.out.println("Aparece el numero: " + buscar + "?" + aparece + " Aparece " + contador + " veces.");
        System.out.println("La primera posicion es: " + primera + " y la ultima: " + ultima);
    }
}
