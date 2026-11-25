/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4;

/**
 *
 * @author usuario
 */
public class Ejercicio17 {
    public static void main(String[] args) {
    
    }
     public static void mostrar(int[] numeros){
            for (int i = 0; i < numeros.length; i++){
                System.out.println(numeros[i]);
            }
        }
     
     public static int sumar(int[] numeros){
         int sumar = 0;
         for (int i = 0; i < numeros.length; i++){
                sumar = numeros[i] + sumar;
            }
         return sumar;
     }
     
     
     public static double calcularMedia(int[] numeros){
         double media = sumar(numeros) / numeros.length;
         return media;
     }
             
     public static int obtenerMaximo(int[] numeros){
         int maximo = 0;
         for (int i = 0; i < numeros.length; i++){
             if (numeros[i] > maximo){
                 maximo = numeros[i];
             }
         }
         return maximo;
     }  
     
     public static int contarPares(int[] numeros){
         int pares = 0;
         for (int i = 0; i < numeros.length; i++){
             if(numeros[i] % 2 == 0){
                 pares++;
             }
         }
         return pares;
     }
     
     
}
