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
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero.");
        int numero = entrada.nextInt();
        int multiplicar;
        for (int i = 1 ; i <=10 ; i++) {
        multiplicar = i * numero;
        System.out.println("---------Empezamos----------");
        System.out.println(multiplicar);
    } 
    }
}
