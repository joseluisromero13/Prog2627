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
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Nombre completo:");
        String nombreCompleto = entrada.nextLine();
        
        System.out.println("Salida: " + 
                nombreCompleto.trim().toLowerCase().replace(' ', '-'));
    }
}
