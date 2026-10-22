package ud2;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 04_1DAW
 */
public class Ejercicio19 {
    public static void main(String[] args) {
        int suma = 0;
        int numero;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("Escribe el numero que quieras sumar:");
            numero = entrada.nextInt();
            
            
            if (numero == 0) {
                System.out.println(suma);
            } else {
                suma = suma + numero;
                System.out.println(suma);
            }
            }while (numero != 0);
              
    }
}
