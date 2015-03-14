
package ordenamiento;

import java.util.Random;

public class Ordenamiento {

    public static void main(String[] args) 
    
    {
        
        Random rnd = new Random();
        
        long startTime, endTime;
        
        int[] arreglo = new int[10];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = rnd.nextInt(100);
        }
        
        RadixSort rax = new RadixSort();
        startTime = System.nanoTime();
        arreglo = rax.sort(arreglo);
        endTime = System.nanoTime();
        
        long tiempoFinal = (endTime - startTime);
        
        System.out.println("It took " + tiempoFinal + " nanoSecons"); 
        
    }
    
}
