package Tipos;

public class Operadores {
	
public static void main(String[] args) {
		
		String nome = "Ultra";
		int idade = 38;
		double peso = 64.7;
		char sexo = 'M';
		boolean doadorOrgao = true;
		//Date dataNascimento = new Date();
		// = atribuição
		// String  usar ""
		//char usar ''
		//boolean true ou false
		
		// + soma; - subtração; / divisão  * multiplicação; % resto da divisão
		
		int modulo = 18 % 3;
		double resultado = (10 * 7) + (34 / 2);
		
		String nomeCompleto = "Ultra" +" " + "Mega";
		
		
		String concatenacao = "?";
		concatenacao = 1+1+1+"1";
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+1;
		System.out.println(concatenacao);
		concatenacao = 1+"1"+1+"1";
		System.out.println(concatenacao);
		concatenacao = "1"+1+1+1;
		System.out.println(concatenacao);
		concatenacao = "1"+(1+1+1);
		System.out.println(concatenacao);
		//utilizar debug
		// + quando utilizado em variaveis de texto sera realizado concatenação
		//no momento q detecta o carater,deixa de realizar a operação de soma, menos nas evidencias ()
		
		
		

	}

}
