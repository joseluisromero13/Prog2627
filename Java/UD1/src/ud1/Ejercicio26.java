import java.util.Scanner;
/**
 *
 * @author 04_1DAW
 */
public class Ejercicio26 {
    public static void main(String[] args) {
       
      /*
        int x = 5; x += 3 * 2;
        boolean b = false; b = !b || 7 % 2 == 1;
        
        
        System.out.println(10 + 5 * 2 > 20 && 4 == 4); //Si 20 es mayor de 20 y 4 es igual a 4 es verdadero
        System.out.println(!(7 + 3 > 10) || 3 * 2 <= 6); // Si 10 no es mayor de 10 o 6 es menor o igual a 6 es verdadero
        System.out.println(10 / 2 + 3 * 5 == 19 && true); // Si 10 dividido 2 más 3 por 5 (20) es igual a 19 y es verdadero
        System.out.println(x); //Asignamos el valor de 5 si x es más o igual a 6
        System.out.println(b); //Es falso si b es disinto de b o si el resto de 7/2 es igual a 1
      */
      //Nivel 1
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Escribe el nombre del cliente:  ");
      String nombreCliente = entrada.nextLine();
      
      System.out.println("Escribe la edad del cliente:");
      int edadCliente = entrada.nextInt();
      
      double precio = edadCliente < 12 ? 5 : 8;
     
      System.out.println("El cliente debe pagar: " + precio + " Euros.");
    }
}
