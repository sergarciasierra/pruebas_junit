import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class CalculadoraTest {
	static Calculadora calc;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass(");
		calc = new Calculadora();
	}
	
	@Before
	public void before() {
		System.out.println("Before()");
		calc.clear();
	}
	
	@After
	public void after() {
		System.out.println("After()");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass()");
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
    
    @Test
    public void testDivide() {
    	System.out.println("Divide()");
    	int resultado = calc.divide(12, 4);
    	int esperado = 3;
    	assertEquals(esperado, resultado);
    }
    
    @Test
    (expected = ArithmeticException.class)
    public void testDivPorCero() {
    	System.out.println("DivPorCero()");
    	calc.divide(3, 0);
    	
    }
}
