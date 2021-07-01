package Fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionario
		
		// Tipos numéricos interiros
		
		byte anosDeEmpresa = 23;
		short numerosDeVoos= 542;
		int id = 56789;
		long pontoAcumulados = 3_234_845_223L;
		
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleanos
		boolean estaDeFerias = false; //True
		
		// Tipos caractere
		char status = 'A'; //ativo!
				
		
		//Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numerosDeVoos / 2);
		
		//Pontos por Real
		System.out.println(pontoAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias );
		System.out.println("Status: " + status);
		
		
		
	}

}
