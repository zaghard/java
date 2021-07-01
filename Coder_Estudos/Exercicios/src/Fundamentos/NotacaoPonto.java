package Fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		
	double a = 2.3;
	String s =  "Bom dia X";
	s = s.toUpperCase();
	
	System.out.println(s);
	
	s = s.replace("X", "Senhora");
	s = s.toUpperCase();
	
	System.out.println(s);
		
	s = s.concat("!!!");
	
	System.out.println(s);
	
	String x = "Mauricio".toUpperCase();
	System.out.println(x);
	
	String y ="Bom dia X"
			.replace("X", "Gui")
			.toUpperCase()
			.concat("!!!!");
	System.out.println(y);
	
	//Tipos primitivos não tem o operador "."
	int a = 3;
	System.out.println(a);
	}
	
}
