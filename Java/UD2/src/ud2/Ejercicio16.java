package ud2;
//Importamos la herramienta Scanner
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
        //Creamos el escaner 
        Scanner entrada = new Scanner(System.in);
        
        //Hacemos un bucle infinito
        while (true) {
            
            //Creamos el menú
            System.out.println("------Escribe una opción-----");
            System.out.println("------1. pulsa uno para mostrar saldo-----");
            System.out.println("------2. pulsa para retirar dinero-----");
            System.out.println("------3. pulsa para salir del cajero-----");
            
            //Cogemos el numero que pase el usuario por teclado
            int numero = entrada.nextInt();
            
            //Estructura de control para conrtolar las distintas opciones
            if (numero == 3) {
                //Salimos del bucle
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
