import java.util.Scanner;

/**
 *
 * @author José Luis
 */
public class Ejercicio28 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       //Pedimos la primera nota y lo guardamos en la variable primerTrimestre
       System.out.println("Escribe la nota del primer trimestre:");
       int primerTrimestre = entrada.nextInt();
       
       //Pedimos la nota del segundo trimestre y lo guardo en la variable segundoTrimestre
       System.out.println("Escribe la nota del segundo trimestre:");
       int segundoTrimestre = entrada.nextInt();
       
       //Guardamos la nota del tercer trimestre y lo guardo en la variable tercerTrimestre
       System.out.println("Escribe la nota del tercer trimestre:");
       int tercerTrimestre = entrada.nextInt();
       
       //Calculamos la media con un float para tener decimales
       float media = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 2;
       int mediaBoletin = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 2;
       //Mostramos el resultado por pantalla
       System.out.println("La nota media es (Expediente académico: "  + media);
       System.out.println("La nota media es (Boletin académico: "  + mediaBoletin);
       
   }
}
