package ud2;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author José Luis
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        //Declaramos las variables y el array
        double[] precios = {10.5, -5.0, 20.0, -1.2, 5.5};
        double suma = 0 ;
        
        for (double numero : precios) {
            if (numero <= 0) {
                continue;
            } else {
                suma += numero;
                System.out.println(suma);
            }
            
        }
    }
}
