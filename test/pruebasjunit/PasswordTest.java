
package pruebasjunit;

import org.junit.*;
import static org.junit.Assert.*;

public class PasswordTest {
    
    public PasswordTest() {
    }
    
    @Test
    public void testPasswordCorto(){ //contraseña con menos de 8 simbolos.
        System.out.println("Test password corto!");
        assertEquals(Password.SecurityLevel.Debil, Password.contraseña("123ab"));
    }
    
    @Test
    public void testSoloNumeros(){ //contraseña que lleva solo numeros.
        System.out.println("Test password solo numeros!");
        assertEquals(Password.SecurityLevel.Debil, Password.contraseña("1234567"));
    }
    
    @Test
    public void testSoloLetras(){ //contraseña que lleva solo letras.
        System.out.println("Test password solo letras!");
        assertEquals(Password.SecurityLevel.Debil, Password.contraseña("abcdefg"));
    }
    
    @Test
    public void testLetrasYNumeros(){ //contraseña que lleva letras y numeros.
        System.out.println("Test password letras y numeros!");
        assertEquals(Password.SecurityLevel.Medio, Password.contraseña("abcd1234"));
    }
    
    @Test
    public void testLetrasNumerosYSimbolos(){ //contraseña con letras, numeros y simbolos.
        System.out.println("Test password letras, numeros y simbolos!");
        assertEquals(Password.SecurityLevel.Alto, Password.contraseña("abcd12"));
    }
}
