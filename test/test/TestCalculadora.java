
package test;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;
import pruebasjunit.Calculadora;

public class TestCalculadora {
   
    Calculadora p;
    
    public TestCalculadora(){
        p = new Calculadora();
    }
    
    @Test
    public void testSumar(){
        System.out.println("Sumar");
        assertTrue(p.sumar(4,5) == 4+5);
    }
    
    @Test
    public void testRestar(){
        System.out.println("Restar");
        assertTrue(p.restar(10,6) == 10-6);
    }
    
    @Test
    public void testMultiplicar(){
        System.out.println("Multiplicar");
        assertTrue(p.multiplicar(11, 10) == 11*10);
    }
    
    @Test
    public void testDividir(){
        System.out.println("Dividir");
        assertTrue(p.dividir(100,10) == 1);
    }
}
