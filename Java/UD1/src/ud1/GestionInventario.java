public class GestionInventario {
    public static void main(String[] args) {
        //declaramos las variables
        int cantidadPociones = 0;
        double precioPocion = 10;
        boolean estadoMochila = false;
        double cartera = 100; //Oro inicial que tenemos
       
        //Mostrar datos iniciales        
        System.out.println("Cantidad pociones: " + cantidadPociones);
        System.out.println("Nos queda de oro: " + cartera);
        System.out.println("La mochila esta: " + estadoMochila);
        
        //realizamos los calculos
        int totalPociones = cantidadPociones + 3;
        double precioTotal = precioPocion * 3;
        double totalCartera = cartera - precioTotal;
        estadoMochila = totalPociones >= 3;
        
        //mostramos el resultado de la mochila
        System.out.println("Cantidad pociones: " + totalPociones);
        System.out.println("Nos queda de oro: " + totalCartera);
        System.out.println("La mochila esta: " + estadoMochila);
        
        byte a = 127;
        a = (byte) (a + 1);
        System.out.println("a:" + a);
    }
}
