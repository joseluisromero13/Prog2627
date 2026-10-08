import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        System.out.println("Escribe tu edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;  
        System.out.println("Eres mayor de edad: " + mayorEdad);
      
    }    
}
