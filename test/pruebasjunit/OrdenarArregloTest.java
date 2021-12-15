
package pruebasjunit;

import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;

public class OrdenarArregloTest {
    
    public OrdenarArregloTest() {
    }
    
    @Test
    public void testMergeSort() {
        System.out.println("MergeSort");
        int[] entrada1 = {5,7,3,6,1};
        int[] salida1 = {1,3,5,6,7};
        
        int[] entrada2 = {50, 11, 39 ,47 ,101, 73, 81, 25, 3, -12};
        int[] salida2 = {-12, 3, 11, 25, 39, 47, 50, 73, 81, 101};
        
        OrdenarArreglo.MergeSort(entrada2);
        
        assertTrue(Arrays.equals(entrada2, salida2)); //valida si la condicion es verdadera.
        //assertArrayEquals(salida1, entrada1); //valida si los arreglos son iguales.
    }
    
    @Test
    public void testBubbleSort(){
        System.out.println("BubbleSort");
        int[] entrada3 = {50, 11, 39 ,47, 73, 81, 25, 3, -12};
        int[] salida3 = {-12, 3, 11, 25, 39, 47, 50, 73, 81};
        
        OrdenarArreglo.BubbleSort(entrada3);
        
        assertArrayEquals(salida3, entrada3);
    }
}
