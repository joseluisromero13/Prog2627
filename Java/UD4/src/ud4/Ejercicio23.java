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
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre:");
        String nombre = entrada.nextLine();
        
        System.out.println("Escribe tu Primer Apellido:");
        String primerApellido = entrada.nextLine();

        System.out.println("Escribe tu Segundo Apellido:");
        String segundoApellido = entrada.nextLine();

        int suma = nombre.length() + primerApellido.length() + segundoApellido.length();
        
        System.out.println("El nombre completo es: " + nombre + " " + 
                primerApellido +  " " + segundoApellido);
        
        System.out.println("La cadena tiene " + suma + " caracteres");
        
        System.out.println("El nombre completo es: " + nombre.toLowerCase() + 
                " " + primerApellido.toLowerCase() +  " " 
                + segundoApellido.toLowerCase());
        
        System.out.println("El nombre completo es: " + nombre.toUpperCase() + 
                " " + primerApellido.toUpperCase() + " " 
                + segundoApellido.toUpperCase());


        
        
    }
        
}
