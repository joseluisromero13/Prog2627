import java.util.Scanner;
/**
 *
 * @author José Luis
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pido por pantalla que introduzca la primera nota y la guardo en la varible nota1
        System.out.println("Escribe la primera nota: ");
        int nota1 = sc.nextInt();
        
        //Pido por pantalla que introduzca la segunda nota y la guardo en la varible nota2
        System.out.println("Escribe la segunda nota");
        double nota2 = sc.nextInt();
        
        //Calculamos la media
        double media = (nota1 + nota2) / 2;
        
        //Mostamos por pantalla el resultado
        System.out.println("La media de las notas es: " + media);
        
    }
}
