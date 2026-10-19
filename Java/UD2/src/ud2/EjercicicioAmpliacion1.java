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
        int intento = 3;

        while (contador <= 3 && intento >= 1) {
            contador++;
            intento--;
            System.out.println("Escribe el pin");
            int pin = entrada.nextInt();

            if (pin == 2580) {
                System.out.println("El pin es correcto");
                break;
            } else {

                System.out.println("Error fallaste el pin, te quedan " + intento + " intentos.");
                
            }

        }

    }
}
