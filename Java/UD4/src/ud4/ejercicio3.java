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
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] precios = new int[5];
        
        for(int i = 0; i < precios.length; i++){
            System.out.println("Escribe el precio");    
            int numero = entrada.nextInt();
            precios[i] = numero;
        }
        
        System.out.println("Escribe el precio que deseas cambiar del 1-5");    
        int indice = entrada.nextInt();
        
        for(int i = 0; i <= precios.length + 1; i++){
            System.out.println("Escribe el precio que deseas cambiar del 1-5");    
            int numero = entrada.nextInt();
            precios[i] = numero;
        }
        
        for(int i = 0; i < precios.length; i++){
            System.out.println("La temperatura es: " + precios[i]);    
        }
    }
}
