package finance;

import junit.framework.TestCase;

public class TaxCalculatorTest extends TestCase {
	
	public void testCalculaImposto_C1() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(1000); 
		assertEquals(0, imposto, 0);
	}
	
	public void testCalculaImposto_C2() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(2000); 
		assertEquals(32.5, imposto, 0.01);
	}
	
	public void testCalculaImposto_C3() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3000); 
		assertEquals(156.41, imposto, 0.01);
	}
	
	//... // demais testes
		
}
