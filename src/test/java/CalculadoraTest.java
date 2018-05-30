import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;

public class CalculadoraTest {
	Calculadora calc;
	
	@Before
	public void before() {
		System.out.println("Before()");
		calc = new Calculadora();
	}
	
	@After
	public void after() {
		System.out.println("after()");
		calc.clear();
	}
	
    @Test
    public void testSuma() {
    	System.out.println("Suma()");
    	int esperado = 5;
        int resultado = calc.suma(3, 2);
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testAnsSuma() {
    	System.out.println("AnsSuma()");
    	calc.suma(3, 2);
        int resultado = calc.ans();
        int esperado = 5;
        assertEquals(esperado, resultado);
    }
}
