import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        //variables
        double precio = 120;
        final double descuento = 0.15;
        double total = precio * descuento;
        
        
        System.out.println("El producto se queda en un valor de: " + (precio - total));
    }
}
