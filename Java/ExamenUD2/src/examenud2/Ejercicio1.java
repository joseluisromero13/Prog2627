/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenud2;

import java.util.Scanner;

/**
 *
 * @author 04_1DAW
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        //creamos el scaner
        Scanner entrada = new Scanner(System.in);
        //Imprimimos por pantalla para introducir el codigo
        System.out.println("Introduce el codigo de la nave:");
        //Guardamos lo que introducimos por teclado en la variable opcion
        int opcion = entrada.nextInt();
        
        //Creamos un switch con la variable de menu opcion para controlar el flujo de las opciones
        switch (opcion) {
            case 1:
                System.out.println("Acceso concedido: Sector Central");
                break;
            case 2:
                System.out.println("Acceso concedido: Hangar de Carga");
                System.out.println("Introduce el tonelaje de carga (numeros enteros)");
                int tonelaje = entrada.nextInt();
                
                //Controlamos el tonelaje con el if
                if (tonelaje >= 500) {
                    System.out.println("Requiere inspeccion aduanera");
                } else {
                    System.out.println("Puede pasar");
                }
                break;
            case 3:
                System.out.println("Acceso restringido: Enviar escolta");
                break;
            case 4:
                System.out.println("¡ALERTA! Iniciar protocolos de defensa");
                break;
            //Salida predeterminada redirege el flujo a un error    
            default:
                System.out.println("Código no válido");
        }
    }
}
