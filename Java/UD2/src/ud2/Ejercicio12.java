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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe un numero positivo:");
        int numero = entrada.nextInt();
        if (numero < 0){
            numero = -1 * numero;
        }else{
        int contador = 1;
        while (contador <= numero){
            System.out.print(contador + ", ");
            contador++;
        }
        }
    }
}
