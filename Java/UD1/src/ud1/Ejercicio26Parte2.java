
import java.util.Scanner;

/**
 *
 * @author 04_1DAW
 */
public class Ejercicio26Parte2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final float precioNormal = 8;
        System.out.println("Escribe el nombre del cliente:  ");
        String nombreCliente = entrada.nextLine();

        System.out.println("Escribe la edad del cliente:");
        int edadCliente = entrada.nextInt();

<<<<<<< HEAD
        double precio = edadCliente < 12 ? 5 : 8;
        System.out.println("El cliente debe pagar: " + precio + " Euros.");
=======
        double precio = edadCliente < 12 ? 5 : precioNormal;
        double precio2 = edadCliente >= 65 ? 6 : precioNormal;
        System.out.println("El cliente" + nombreCliente + " debe pagar: " + precio + " Euros.");
        
        System.out.println("El cliente" + nombreCliente + " debe pagar: " + precio2 + " Euros.");    
>>>>>>> 814b99cb00863c835652ad272a1e2f0e4548cfde
    }
}
