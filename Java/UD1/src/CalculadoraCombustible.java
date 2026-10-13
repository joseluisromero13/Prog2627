
/**
 *
 * @author 04_1DAW José Luis Romero Gómez
 */
public class CalculadoraCombustible {
    public static void main(String[] args) {
        
        //Declaramos las dos constantes del consumo y de la reserva
        final double consumo_por_km = 14.75;
        final int reserva_seguridad = 500;
        
        //Declaramos las dos variables de la distancia y el precio del combustible
        int distanciaKm = 4800;
        double precioLitro = 2.35;
        
        //Realizamos los cálculos
        /**Los litros totales se consiguen la variable de la distancia * la 
         * constante del consumo por km + la costantede la reserva
         */
        double litrosTotal = (distanciaKm * consumo_por_km) + reserva_seguridad;
        
        /**El coste total se consigue con los litros totales que gastamos * el 
         * precio del combustibe
         */
        double costeTotal = litrosTotal * precioLitro;
        
     

        //Casting explicito, pasamos de double a int
        int litrosOficialesCompra = (int)litrosTotal;
        int costePresupuestado = (int)costeTotal;
        
        
        System.out.println("=======INFORME=======");
        //Mostramos por pantalla las Constantes
        System.out.println("---Datos Constantes---");
        System.out.println("El consumo es de " + consumo_por_km + " Litros/km");
        System.out.println("La reserva de seguridad es de " + reserva_seguridad + " Litros.");
        
        //Mostramos por pantalla la distancia y el precio de combustible
        System.out.println("\n ---Datos Viaje---");
        System.out.println("La distancia que tenemos que recorrer es de " + distanciaKm  + " Km.");
        System.out.println("El precio por litro de combustible es de " + precioLitro + " Euros/litro.");
        
        //Mostramos por pantalla el resultado de los calculos
        System.out.println("\n ---Calculo del Coste---");
        System.out.println("El consumo de litros total es de " + litrosTotal + " Litros.");
        System.out.println("El coste total del viaje es de " + costeTotal + " Euros.");
        
        //Mostramos por pantalla los resultados de los calculos LitrosOficiales y costePresupuestado
        System.out.println("\n -----RESUMEN DEL INFORME-----");
        System.out.println("Tenemos un consumo total de combustible de " + litrosOficialesCompra + " Litros.");
        System.out.println("El coste total de los " + litrosOficialesCompra + " litros es de: " + costePresupuestado + " euros.");
    }
}
