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
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero.");
        int numero = entrada.nextInt();
        
        if (numero % numero == 0){
            System.out.println("El numero es primo.");
        } else {
            System.out.println("El número no es primo");
        }
    }
}






