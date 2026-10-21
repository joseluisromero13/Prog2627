package ud2;

import java.awt.BorderLayout;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author José Luis
 */
public class EjercicicioAmpliacion1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;
        final int PIN = 2580;
        
        while (contador <= 3 && PIN != 2580) {
           
            
            System.out.println("Escribe el pin");
            int numero = entrada.nextInt();

            if (numero == PIN) {
                System.out.println("El pin es correcto");
                System.out.println("Has necesitado " + contador + " intentos.");
            } else {
                System.out.println("Error fallaste el pin, te quedan " + (3 - contador) + " intentos.");
            }
            
            contador++;

        }
    }
}
