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
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe una Frase:");
        String frase = entrada.nextLine();
        
        System.out.println("Escribe una Posición de inicio:");
        int inicio = entrada.nextInt();
        
        System.out.println("Escribe una Posición de fin:");
        int fin = entrada.nextInt();
        
        if (inicio >= 0 && fin <= frase.length() && inicio <= fin){
            System.out.println(frase.substring(inicio, fin));
        } else {
             System.out.println("ERROR");
        }
        
        int primer = frase.indexOf(" ");
        System.out.println(frase.substring(0, primer));
        
    }
}
