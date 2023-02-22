package Tipos;

public class OperadorTernario {

	public static void main(String[] args) {

		int a = 5, b = 6;
		String resultado = "";
		
		
		if(a == b)
			resultado = "verdadeiro";
		else
			resultado = "falso";
		
		System.out.println(resultado);//falso
		
//////////////////////////////////////
		
		String resultado1 = a == b ? "Verdadeiro" : "Falso";
		System.out.println("TERNARIO STRING " + resultado1);
		
		int resultado3 = a == b ? 1 : 0;
		System.out.println("TERNARIO INTEIRO " + resultado3);

	}

}
