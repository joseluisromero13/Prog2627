/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double[] temperaturas = new double[7];
        
        
        for (int i = 0 ; i < temperaturas.length; i++){
            System.out.println("Introduce una temperatura:");
            temperaturas[i] = entrada.nextDouble();     
        }
        
        //Mostrar las temperaturas
        for (int m = 0; m < temperaturas.length; m++){
            System.out.println("Temperaturas: " + temperaturas[m]);
        }
        
         //Media temperaturas
        double sumar = 0;
        double maximo = 0;
        double minimo = 0;
        int contador = 0;
        for (int m = 0; m < temperaturas.length; m++){
            sumar = temperaturas[m] + sumar;
            
            //Maximo
            if (temperaturas[m] > maximo){
                maximo = temperaturas[m];
            }
            
            //Minimo
            if (temperaturas[m] < minimo){
                minimo = temperaturas[m];
            }
            
            if (temperaturas[m] > 25){
                contador++;
            }
            
        }
        //Mostrar 
        System.out.println("La media es: " + (sumar / temperaturas.length));
        System.out.println("La temperatura maxima es: " + maximo);
        System.out.println("La temperatura minima es: " + minimo);
        System.out.println("La temperatura supera los 25: " + contador);
        
        
       
        
        
        
        
        
        
        
    }
}
