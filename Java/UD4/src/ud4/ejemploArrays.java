/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud4;

/**
 *
 * @author 04_1DAW
 */
public class ejemploArrays {
    public static void main(String[] args) {
        double[] temperaturas = {18.5, 21.0, 24.5, 19.0, 27.5};
        
        //System.out.println(temperaturas);
        
        for(int i = 0; i < temperaturas.length ; i++) {
            System.out.println("Día " + (i + 1) + " - " + temperaturas[i]);
        }
        
        temperaturas[1] = 23.33;

    }   
}
