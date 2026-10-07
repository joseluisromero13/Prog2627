import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el año actual: ");
        int anioActual = sc.nextInt();

        System.out.print("Introduce tu año de nacimiento: ");
        int anioNacimiento = sc.nextInt();

        // Calcular la edad
        int edad = anioActual - anioNacimiento;

        // Mostrar el resultado
        System.out.println("Tienes " + edad + " años."); 
                
    }
}
