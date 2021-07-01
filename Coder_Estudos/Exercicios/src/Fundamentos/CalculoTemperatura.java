package Fundamentos;

public class CalculoTemperatura {

	public static void main(String[] args) {
		//(°F - 32) *5/9 = °C
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double fahrenheint = 150;
		double celsius = (fahrenheint - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius + "°C.");
		
		
		fahrenheint = 86;
		celsius = (fahrenheint - AJUSTE) * FATOR;
		
		System.out.println("O resultado é " + celsius + "°C.");
	}
	
}
