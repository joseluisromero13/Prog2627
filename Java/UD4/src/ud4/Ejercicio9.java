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
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double[] notas = new double[10];
        
        int suspensos = 0;
        int aprobados = 0;
        int notables = 0;
        int sobresalientes = 0;
        
        for (int i = 0; i < notas.length; i++){
            System.out.println("Introduce la nota: ");
            notas[i] = entrada.nextDouble();
            
            
        }
        
        for (int n = 0; n < notas.length; n++){
            if (notas[n] < 5){
                    suspensos++;
                }

                if (notas[n] >= 5 && notas[n] < 7){
                    aprobados++;
                }

                if (notas[n] >= 7 && notas[n] < 9){
                    notables++;
                }

                if (notas[n] >= 9){
                    sobresalientes++;
                } 
        }
        
        System.out.println("Numero suspensos: " + suspensos);
        System.out.println("Numero aprobados: " + aprobados);
        System.out.println("Numero notables: " + notables);
        System.out.println("Numero sobresalientes: " + sobresalientes);
        
                

        
        
        
    }
}
