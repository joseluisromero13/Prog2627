import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Mostramos en pantalla y Solicitamos al usuario si llueve
        System.out.println("Está lloviendo? (true/false): ");
        boolean usuarioLlueve = sc.nextBoolean();
        
        //Mostramos en pantalla y Solicitamos si termina la tarea
        System.out.println("Tienes la tarea terminada? (si/no): ");
        boolean usuarioTarea = sc.nextBoolean();
        
        //Mostramos en pantalla y Solicitamos si tiene que ir a la biblioteca
        System.out.println("Tienes que ir a la biblioteca? (sin/no): ");
        boolean usuarioBiblioteca = sc.nextBoolean();
        
        //Hacemos la comparación de las respuestas de cada entrada
        boolean salir = !(usuarioLlueve) && usuarioTarea && usuarioBiblioteca;
        
        //Mostramos el resultado por pantalla
        System.out.println("El usuario podrá salir: " + salir);
        
    }
}

