//Importamos las herramientas (Scanner para introducir datos por parte del  cliente

import java.util.Scanner;

/**
 *
 * @author 04_1DAW
 */
public class Ejercicio25 {

    public static void main(String[] args) {

        //Creamos el Scanner de entrada para recoger los datos y lo guardamos en la variable manzana
        Scanner entrada = new Scanner(System.in);

        //Solicitamos que el cliente escriba los kilos de manzanas
        System.out.println("Escribe cuantos kilos de manzana has vendido: ");
        double manzanas = entrada.nextDouble();

        //Solicitamos que el cliente escriba los kilos de peras y lo guardamos en la variable pera
        System.out.println("Escribe cuantos kilos de pera has vendido: ");
        double peras = entrada.nextDouble();

        //Calculamos con los operadores nuevos
        manzanas *= 2.35;
        peras *= 1.95;

        //Mostramos por pantalla el resultado
        System.out.println("Has vendido " + manzanas + " Euros de manzanas.");
        System.out.println("Has vendido " + peras + " Euros de peras.");

    }
}
