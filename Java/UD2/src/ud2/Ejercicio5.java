package ud2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author 04_1DAW
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escribe el primer número:");
        int numPrimero = entrada.nextInt();
        
        System.out.println("Escribe el segundo número:");
        int numSegundo = entrada.nextInt();
        
        
        
        if (numPrimero > numSegundo){
            System.out.println("El número " + numPrimero + " > " + numSegundo);
        }
        else if(numSegundo > numPrimero){ 
            System.out.println("El número " + numSegundo + " > " + numPrimero);
        }   
        else{
            System.out.println("El número " + numSegundo + " = " + numPrimero);
        }
    }
}
