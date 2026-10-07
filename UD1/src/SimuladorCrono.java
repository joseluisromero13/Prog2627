import java.util.Scanner;
public class SimuladorCrono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el total de segundos:");
        
        int totalSegundos = sc.nextInt();
        int horas = totalSegundos / 3600;              // 1 hora tiene 3600 segundos
        int segundosRestantes = totalSegundos % 3600;  // Segundos que quedan tras calcular las horas
        int minutos = segundosRestantes / 60;          // 1 minuto tiene 60 segundos
        int segundos = segundosRestantes % 60;         // Segundos finales que no forman un minuto

        // Mostrar resultados por pantalla
        System.out.println("\n--- DESCOMPOSICIÓN DEL TIEMPO ---");
        System.out.println(totalSegundos + " segundos equivalen a:");
        System.out.println(horas + " horas, " + minutos + " minutos y " + segundos + " segundos.");          
    }
}
