package finance;

public class TaxCalculator {
	
	public static double calculaIR(double salario) {
		double imposto = 0d;
		if ( salario <= 1566.61) {
			return 0;
		}
		else if ( salario > 1566.61 && salario <= 2347.85 ) {
			imposto = (salario - 1566.61) * 0.075; 
		}
		else if ( salario > 2347.85 && salario <= 3130.51 ) {
			imposto += (salario - 2347.85) * 0.15;
			imposto += (2347.85 - 1566.61) * 0.075;
		}
		// ... demais condicoes
		return imposto;
	}
} // fim da classe
