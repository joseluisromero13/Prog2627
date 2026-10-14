import java.util.Scanner;
 
public class FichaNave {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        //2. Datos de la Nave y Piloto
        System.out.println("Escribe el nombre del piloto:");
        String nombrePiloto = entrada.nextLine();
       
        System.out.println("Escribe el rango del piloto (una letra):");
        char rango = entrada.next().charAt(0);
       
        System.out.println("Escribe el nivel de experiencia del piloto:");
        int experiencia = entrada.nextInt();
       
        System.out.println("Escribe el combustible actual en litros:");
        double litrosActual = entrada.nextDouble();

        System.out.println("Sistemas listos? (true/false)");
        boolean sistema = entrada.nextBoolean();
       
        //3. Constantes de Misión
        final double capacidad_Maxima_litros = 2000.0;
        final double Consumo_Ano_Luz = 180.5;
       
        //4. Operaciones y cálculos
        experiencia ++;
        double anosLuz = (litrosActual / Consumo_Ano_Luz);
        double porcentaje = (litrosActual/capacidad_Maxima_litros)*100;
        //5. Presupuesto y casting explicito
        int anosLuzTrunc = (int) anosLuz;
       
//Prints
System.out.println("----RESUMEN VIAJE----");
System.out.println("Nombre del piloto: "+ nombrePiloto);
System.out.println("Rango del piloto: "+ rango);
System.out.println("Experiencia del piloto: "+ experiencia);
System.out.println("¿Está listo?: "+ sistema);
System.out.println("\n ----DATOS DEL VIAJE----");
System.out.println("Capacidad del tanque: "+ capacidad_Maxima_litros);
System.out.println("El consumo x años luz es: " + Consumo_Ano_Luz);
System.out.println("\n -----OPERACIONES-----------");
System.out.println("EL total de años luz es de: " + anosLuzTrunc);
System.out.println("Porcentaje del tanque es de: " + porcentaje + "%");

    }
}
