package finance;

import junit.framework.TestCase;

public class TaxCalculatorTest extends TestCase {
	
	// *** Classes de Equivalencia - Entrada ***
	
	public void testCalculaImposto_c1_o1() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(1000); 
		assertEquals(0, imposto, 0);
	}
	
	public void testCalculaImposto_c2() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(2000); 
		assertEquals(32.5, imposto, 0.01);
	}
	
	public void testCalculaImposto_c3() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3000); 
		assertEquals(156.41, imposto, 0.01);
	}
	
	public void testCalculaImposto_c4() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3500); 
		assertEquals(259.13, imposto, 0.01);
	}

	public void testCalculaImposto_c5() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(4500); 
		assertEquals(513.54, imposto, 0.01);
	}
	
	public void testCalculaImposto_c6_o2() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(-100); 
		assertEquals(-1, imposto );
	}
	
	public void testCalculaImposto_c7() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(Double.MAX_VALUE + 1); 
		assertEquals(-1, imposto);
	}
	
	// *** Valores Limite ***

	public void testCalculaImposto_b1() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(0); 
		assertEquals(0f, imposto, 0f);
	}

	public void testCalculaImposto_b2() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(-0.01); 
		assertEquals(-1, imposto);
	}
	
	public void testCalculaImposto_b3() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(1566.61); 
		assertEquals(0, imposto);
	}
	
	public void testCalculaImposto_b4() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(1566.62); 
		assertEquals(0, imposto, 0.01);
	}
	
	public void testCalculaImposto_b5() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(2347.85); 
		assertEquals(58.59, imposto, 0.01);
	}
	
	public void testCalculaImposto_b6() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(2347.86); 
		assertEquals(58.59, imposto, 0.01);
	}

	public void testCalculaImposto_b7() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3130.51); 
		assertEquals(175.99, imposto, 0.01);
	}

	public void testCalculaImposto_b8() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3130.52); 
		assertEquals(175.99, imposto, 0.01);
	}

	public void testCalculaImposto_b9() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3911.63); 
		assertEquals(351.74, imposto, 0.01);
	}

	public void testCalculaImposto_b10() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3911.64); 
		assertEquals(351.74, imposto, 0.01);
	}
	
	public void testCalculaImposto_b11() {
		double esperado, imposto = 0d;
		imposto = TaxCalculator.calculaIR(Double.MAX_VALUE);
		esperado = 351.74 + ( Double.MAX_VALUE - 3911.63 )* 0.275;
		assertEquals( esperado , imposto, 0.01);
	}
	
	public void testCalculaImposto_b12() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(Double.MAX_VALUE + 0.01);
		assertEquals( -1 , imposto );
	}
}
