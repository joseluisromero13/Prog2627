/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoud3;

/**
 *
 * @author 04_1DAW
 */
public class Proyecto {
    /**
     * Realiza la multiplicación de dos numeros
     * @param a --> Primer coeficiente de la multiplicación
     * @param b --> Segundo coeficiente de la multiplicación
     * @return --> Devuelve el resultado de la operación
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }
    
    /**
     * Realiza la multiplicación de tres numeros usando la función multiplicar 
     * creada anteriormente con dos numeros.
     * @param a --> Primer coeficiente de la multiplicación
     * @param b --> Segundo coeficiente de la multiplicación
     * @param c --> Tercer coeficiente de la multiplicación
     * @return --> Devuelve el resultado de la operación
     */
    public static int multiplicar(int a, int b, int c) {
        return multiplicar(a, b) * c;
    }
    
    /**
     * Un número primo es un número entero mayor que 1 que solo se puede dividir
     * exactamente entre dos cosas: entre 1 y entre sí mismo.
     * @param a --> Número para la comprobación para saber si es primo
     * @return --> Devuelve un boolean (Verdadero/Falso) dependiendo del resultado
     *             de la comprobación.
     */
    public static boolean esPrimo(int a) {
        if (a <= 1) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            // Tiene divisor, no es primo
            if (a % i == 0) {
                return false; 
            }
        }
        return true;
    }
    
   /**
    * El factorial de un número es el resultado de multiplicar 
    * todos los números enteros desde el 1 hasta llegar a ese número.
    * @param a --> Número que vamos a descomponer para el factorial.
    * @return --> Devuelve el resultado de la multiplicación de todos los numeros(Factorial).
    */
    public static int factorial(int a) {
        int resultado = 1;
        for (int i = 1; i <= a; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
    
   /**
    * Calcular el descuento de un producto, pasamos el primer parametro que es 
    * el precio original y el segundo es el porcentaje de descuento. devuelve el
    * precio final con el descuento ya aplicado.
    * @param precioOriginal --> Pasamos el precio sin descuento del producto.
    * @param porcentajeDescuento --> Pasamos el porentaje del descuento.
    * @return 
    */
    public static double descuento(double precioOriginal, double porcentajeDescuento) {
        double cantidadDescuento = (precioOriginal * porcentajeDescuento) / 100;
        
        // Restamos el descuento al precio original para conseguir el precio final
        double precioFinal = precioOriginal - cantidadDescuento;
        
        return precioFinal;
    }
    
    /**
     * Saber si el numero que pasamos es positivo o negativo.
     * @param a --> Numero positivo/negativo.
     * @return 
     */
    
    public  static boolean positivo(int a) {
        return a > 0;
    }
    
}
