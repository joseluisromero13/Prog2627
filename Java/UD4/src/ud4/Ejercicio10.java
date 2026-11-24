/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4;

/**
 *
 * @author usuario
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numeros = {3,8,5,2,9};
        int longitud = numeros.length;
        
        int[] reversa = new int[numeros.length];
        
        for (int i = longitud - 1; i >= 0 ; i--){
            
            reversa[(longitud - 1) - i] = numeros[i];
        }
        
        for (int j = 0; j < numeros.length; j++) {
             System.out.println(numeros[j]);
        }
        
        System.out.println("=================================");
        System.out.println("=================================");
        
        for (int n = 0; n < reversa.length; n++) {
            System.out.println(reversa[n]);
        }
        
    }
}
