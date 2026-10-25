/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud2;

import java.util.Scanner;

/**
 *
 * @author José Luis
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        System.out.println("Introduzca dos números mayores que 0");
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();

        // Bucle principal mientras b sea diferente de 0
        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
         System.out.println(a);
    }
}