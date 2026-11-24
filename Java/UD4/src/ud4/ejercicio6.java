/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4;

/**
 *
 * @author 04_1DAW
 */
public class ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = {12, 5, 8, 20, 3, 15};
        
        for (int i = 0; i < numeros.length; i++){
             if (numeros[i] > 10){
                System.out.println(numeros[i]);
             }
        }
                   
        System.out.println("-------------");

        
        for (int numero : numeros){
            if (numero > 10){
            System.out.println(numero);
             }
        }
    }
    
}
