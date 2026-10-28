/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicar;
import java.util.Scanner;
/**
 *
 * @author 04_1DAW
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int teclado;
        int suma = 0;
        
        do {
            System.out.println("Escribe le numero");
            teclado =entrada.nextInt();
            suma = suma +teclado;
        } while (teclado != 0);
        
        System.out.println(suma);
    }
}
