package Tipos;

public class Incrementacao {

	public static void main(String[] args) {

		int numero = 4;
		

		//mesmo para decremento
		numero++;
		//numero = numero +1;
		System.out.println(numero);

		System.out.println(numero ++);
		//não faz o incremento,imprime primeiro e depois faz incremento
		System.out.println(numero);//agora fez

		//OU
		System.out.println(++ numero);
		//faz o incremento antes de imprimir
		
		
		/////////////////////////////////
		
		boolean variavel = true;
		System.out.println( !variavel);//imprime false
		//impressão em memoria, variavel continua true
		
		variavel = !variavel;//invertendo variavel para false
		System.out.println(variavel);
		
	}

}
