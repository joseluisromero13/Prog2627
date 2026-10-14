import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud2;

/**
 *
 * @author 04_1DAW
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe tu usuario: ");
        String nombreUsuario = entrada.nextLine();
           if (nombreUsuario == "usuario"){
               System.out.println("Sesión iniciada correctamente.");
               System.out.println("Bienvenido <" + nombreUsuario + ">!");

           }
    }
}
