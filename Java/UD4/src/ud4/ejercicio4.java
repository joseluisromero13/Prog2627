/*
 * Crea un array de seis números enteros.
 *Intercambia el primer elemento con el último, el segundo con el penúltimo y el tercero con el cuarto.
 *Muestra el array antes y después de realizar los intercambios.
 */
package ud4;

/**
 *
 * @author 04_1DAW
 */
public class ejercicio4 {
    public static void main(String[] args) {
        int numeros[] = {23, 32, 11, 41, 67, 44};
    
    int aux = numeros[0];
    numeros[0] = numeros[5];
    numeros[5] = aux;
    aux = numeros[1];
    numeros[1] = numeros[4];
    numeros[4] = aux;
    aux = numeros[2];
    numeros[2] = numeros[3];
    numeros[3] = aux;       
    System.out.println(numeros[0]);
    System.out.println(numeros[5]);

    for(int i = 0; i < numeros.length; i++){
        System.out.println(numeros[i]);
    }
    }
    
    
  
}
