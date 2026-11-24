/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4;

/**
 *
 * @author usuario
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        double[] precios = {10.0, 15.5, 20.0, 8.5, 12.0};
        
        for (int i = 0; i < precios.length; i++){
            System.out.println("Precios: " + precios[i]);
        }
        
        System.out.println("=============================");
        
        
        double media = 0;
        int contador = 0;
        for (int i = 0; i < precios.length; i++){
            System.out.println("Precios: " + (precios[i] - (precios[i] * 0.05)));
            media = precios[i] + media;
            
            if (precios[i] > 15){
                contador++;
            }
        }
        
        System.out.println("=============================");

        
        System.out.println("Precio medio: " + (media / precios.length));
        System.out.println("Los precios que superan los 15 euros son : " + contador);

        
        
    }
}
