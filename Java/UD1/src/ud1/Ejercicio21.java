import java.util.Scanner;
/**
 *
 * @author José Luis
 */
public class Ejercicio21 {
    public static void main(String[] args) {
         final double pi = 3.14;
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserta el radio: ");
        double radio = entrada.nextDouble();
        
       
        double longitud = (2 * pi * radio);
        double area = (pi * radio *radio);
        System.out.println("La Longitud es: " + longitud + " , el area es: " + area);
                
    }
}
