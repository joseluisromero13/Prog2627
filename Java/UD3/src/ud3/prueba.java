/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud3;
import java.util.Scanner;

public class prueba{
    public static void main(String[] args) {
        RandomBot bot = new RandomBot();
        Scanner scanner = new Scanner(System.in);

        // Reto 1: Probar una calculadora
        System.out.println("--- RETO 1: CALCULADORA ---");
        int num1 = bot.entre(1, 100);
        int num2 = bot.entre(1, 100);
        System.out.println("Números generados: " + num1 + " y " + num2);
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + ((double) num1 / num2));

        // Reto 2: Clasificador de triángulos
        System.out.println("\n--- RETO 2: CLASIFICADOR DE TRIÁNGULOS ---");
        int lado1 = bot.entre(1, 20);
        int lado2 = bot.entre(1, 20);
        int lado3 = bot.entre(1, 20);
        System.out.println("Lados generados: " + lado1 + ", " + lado2 + ", " + lado3);
        
        // Comprobar la desigualdad triangular
        if ((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)) {
            System.out.print("Forman un triángulo ");
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("isósceles.");
            } else {
                System.out.println("escaleno.");
            }
        } else {
            System.out.println("No forman un triángulo válido.");
        }

        // Reto 4: Generador de pruebas automáticas
        // Se ejecuta antes del Reto 3 para no bloquear la salida con el juego interactivo
        System.out.println("\n--- RETO 4: PRUEBAS AUTOMÁTICAS ---");
        for (int i = 1; i <= 20; i++) {
            int a = bot.entre(1, 50);
            int b = bot.entre(1, 50);
            System.out.println("Prueba " + i + ": " + 
                               a + " + " + b + " = " + (a + b) + " | " + 
                               a + " * " + b + " = " + (a * b));
        }

        // Reto 3: Juego de adivinanzas
        System.out.println("\n--- RETO 3: JUEGO DE ADIVINANZAS ---");
        int numeroSecreto = bot.entre(1, 100);
        int intento = 0;
        System.out.println("El bot ha generado un número secreto entre 1 y 100. Adivínalo.");
        
        while (intento != numeroSecreto) {
            System.out.print("Introduce tu intento: ");
            intento = scanner.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            }
        }
        System.out.println("Correcto. Has adivinado el número secreto.");

        scanner.close();
    }
}
