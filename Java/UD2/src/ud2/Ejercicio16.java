package ud2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author José Luis
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("------Escribe una opción-----");
            System.out.println("------1. pulsa uno para mostrar saldo-----");
            System.out.println("------2. pulsa para retirar dinero-----");
            System.out.println("------3. pulsa para salir del cajero-----");
            int numero = entrada.nextInt();
            if (numero == 3) {
                System.out.println("Gracias por usar el cajero. ¡Adiós!");
                break;
            } else if(numero == 1){
                System.out.println("Mostrar saldo......");
            } else if(numero == 2) {
                System.out.println("Retirando dinero...");
            } else {
                System.out.println("No introduciste una opción correcta");
            }
            
            

            

        }
    }
}
