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
public class Ejercicio27 {

    public static void main(String[] args) {
        String introducirNumeros;
        
        double suma, promedio;
        
        int contador;
        
        suma = 0;
        
        contador = 0;
        
     
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce numeros)");
        
        while (true) {
        
           introducirNumeros = entrada.nextLine(); // Se puede introducir el . en los numero porque lo recibe como String
            
            if (introducirNumeros.equals(" ")) break; // Salimos del bucle infinito si se pulsa espacio
            
            suma += Double.parseDouble(introducirNumeros); // Convertimos un String a double
            
            contador++;
        
        }
        
        promedio = suma / contador;
        
        // Mostrar los datos
        System.out.println("El promedio es: " + promedio);
    }
        
}
