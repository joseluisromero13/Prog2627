/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud3;
 import java.util.Scanner;
/**
 *
 * @author 04_1DAW
 */
public class CalculadoraNotas {
  
    public static void main(String[] args) {
        System.out.print("Introduce la primera nota: ");
        double num1 = leerNota();
        System.out.print("Introduce la segunda nota: ");
        double num2 = leerNota();
        System.out.print("Introduce la tercera nota: ");
        double num3 = leerNota();
        
        

        // Mostrar resultados
        System.out.println("\n--- INFORME ACADÉMICO ---");
        System.out.println("Media: " + media);
        System.out.println("Nota máxima: " + maxima);

        if (aprobado) {
            System.out.println("Resultado: APROBADO");
        } else {
            System.out.println("Resultado: SUSPENSO");
        }

        
    }
    
    public static double leerNota() {
        Scanner teclado = new Scanner(System.in);
        // Introducir las notas
        
        return teclado.nextDouble();    
    }
    
    
    public static double calcularMedia(double nota1, double nota2, double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }
    
    
    public static double obtenerNotaMaxima(double nota1, double nota2, double nota3){
        // Obtener la nota máxima
        double maxima = nota1;

        if (nota2 > maxima) {
            maxima = nota2;
        }

        if (nota3 > maxima) {
            maxima = nota3;
        }
        
        return maxima;
    }
    
    
    public static boolean estaAprobado() {
        // Comprobar si está aprobado
        boolean aprobado = media >= 5;
    }
    
}



