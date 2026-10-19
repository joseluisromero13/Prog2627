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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        System.out.println("Escribe el número:");
        int numero = entrada.nextInt();
         int par = numero%2;
        if (par == 0){
            System.out.println("El numero " + numero + " es par.");
        }else{
            System.out.println("El numero " + numero + " no es par.");
        }
    }
}

