package finance;

import junit.framework.TestCase;

public class TaxCalculatorTest extends TestCase {
	
	// *** Constantes para auxiliar no projeto dos casos de teste **
	
	private final double LIMITE_FAIXA_1 = 1566.61;
	private final double LIMITE_FAIXA_2 = 2347.85;
	private final double LIMITE_FAIXA_3 = 3130.51;
	private final double LIMITE_FAIXA_4 = 3911.63;
	
	private final double PERC_FAIXA_1 = 0.0;
	private final double PERC_FAIXA_2 = 0.075;
	private final double PERC_FAIXA_3 = 0.15;
	private final double PERC_FAIXA_4 = 0.225;
	private final double PERC_FAIXA_5 = 0.275;

	private final double TOT_FAIXA_2 = 58.59;
	private final double TOT_FAIXA_3 = 117.40;
	private final double TOT_FAIXA_4 = 175.75;
	private final double TOT_FAIXAS = 351.74;
	

	
	
	
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
		assertEquals(0, imposto);
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
		assertEquals( TOT_FAIXA_2 , imposto, 0.01);
	}
	
	public void testCalculaImposto_b6() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(2347.86); 
		assertEquals( TOT_FAIXA_2 , imposto, 0.01);
	}

	public void testCalculaImposto_b7() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3130.51); 
		assertEquals( TOT_FAIXA_2 + TOT_FAIXA_3, imposto, 0.01);
	}

	public void testCalculaImposto_b8() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3130.52); 
		assertEquals( TOT_FAIXA_2 + TOT_FAIXA_3 , imposto, 0.01);
	}

	public void testCalculaImposto_b9() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3911.63); 
		assertEquals( TOT_FAIXAS , imposto, 0.01);
	}

	public void testCalculaImposto_b10() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(3911.64); 
		assertEquals( TOT_FAIXAS , imposto, 0.01);
	}
	
	public void testCalculaImposto_b11() {
		double esperado, imposto = 0d;
		imposto = TaxCalculator.calculaIR(Double.MAX_VALUE);
		esperado = TOT_FAIXAS + ( Double.MAX_VALUE - 3911.63 )* 0.275;
		assertEquals( esperado , imposto, 0.01);
	}
	
	public void testCalculaImposto_b12() {
		double imposto = 0d;
		imposto = TaxCalculator.calculaIR(Double.MAX_VALUE + 0.01);
		assertEquals( -1 , imposto );
	}
}
