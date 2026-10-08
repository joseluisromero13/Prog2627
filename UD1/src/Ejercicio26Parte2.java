import java.util.Scanner;
/**
 *
 * @author 04_1DAW
 */
public class Ejercicio26Parte2 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Escribe el nombre del cliente:  ");
      String nombreCliente = entrada.nextLine();
      
      System.out.println("Escribe la edad del cliente:");
      int edadCliente = entrada.nextInt();
      
      double precio = edadCliente < 12 ? 5 : 8;
     double precioDos = edadCliente >= 12 ||  edadCliente <= 65 ? 8 : ;
      System.out.println("El cliente debe pagar: " + precio + " Euros.");
    }
}
