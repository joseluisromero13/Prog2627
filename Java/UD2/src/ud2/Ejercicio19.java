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
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Escribe el numero que quieras sumar:");
            int numero = entrada.nextInt();
            suma = suma + numero;
            if (numero == 0) {
                System.out.println(suma);
                break;
            } else {
                System.out.println(suma);

            }
        }        
    }
}
