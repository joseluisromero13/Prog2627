/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud2;

import java.util.Scanner;

/**
 *
 * @author 04_1DAW
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        //creamos el scaner
        Scanner entrada = new Scanner(System.in);
        //Creamos las variables de contador y de bateria
        int ciclos = 0;
        int bateria = 10;
        System.out.println("La bateria es " + bateria);
        /**
         * Realizamos el bucle con esta condición donde se puede superar el 100%
         * Ya que el enunciado nos especifica este apartado:
         * La recarga finaliza cuando la batería alcanza o supera el 100%.
         */
        while (bateria < 100) {
            
            //Preguntamos cuantos puntos de recarga
            System.out.println("Introduce cuantos puntos de cargas quieres asiganar:");
            int puntos = entrada.nextInt();
            
            //Realizamos la estructura de control si los puntos son menos de 1 salta error
            //Aquí controlamos que no entren numeros negativos
            if (puntos < 1) {
                System.out.println("Entrada invalida");
            //Realizamos la estructura de control si los puntos son mayores de 30 salta error
            //Aquí controlamos el limite máximo de puntos que podemos meter
            } else if (puntos > 30) {
                System.out.println("Entrada invalida");
            //Realiza la suma del ciclo y de la bateria
            } else {
                bateria = bateria + puntos;
                System.out.println("La bateria es " + bateria + "%");
                ciclos++;
            }

        }
            //Imprimimos el numero de ciclos
            System.out.println("Se necesitó " + ciclos + "ciclos");
    }
}
