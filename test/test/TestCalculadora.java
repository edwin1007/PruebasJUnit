
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
        assertTrue(p.sumar(4,5) == 4+5);
    }
    
    @Test
    public void testRestar(){
        assertTrue(p.restar(10,6) == 10-6);
    }
    
    @Test
    public void testMultiplicar(){
        assertTrue(p.multiplicar(11, 10) == 11*10);
    }
    
    @Test
    public void testDividir(){
        assertTrue(p.dividir(100,10) == 100);
    }
}
