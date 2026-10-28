/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud2;

/**
 *
 * @author 04_1DAW
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        /**
         * Creamos el bucle for ya que queremos reccorrer una serie de veces exactas el bucle
         * I la inicializamos en 100 y que sume de 1 en 1 hasta llegar a 150
         */
        for (int i = 100 ; i <=150 ; i++) {
            //Creamos un if para los diferentes casos
            //Si es divisble entre 5 no se imprime el valor se salta
            if (i % 5 == 0){
                continue;
            //Si la emisora es 137 corta el bucle con el break y se sale
            } else if (i == 137) {
                System.out.println("Se encontró la freciuencia socorro " + i);
                break;
            //Imprime el resto de emisoras normales
            } else {
                System.out.println("Sintonizando frecuencia: [" + i + "]");
            }
        }
    }
}
