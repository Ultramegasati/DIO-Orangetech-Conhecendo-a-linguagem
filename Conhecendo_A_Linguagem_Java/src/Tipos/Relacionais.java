package Tipos;

public class Relacionais {

	public static void main(String[] args) {

		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2;
		
		if(numero1 < numero2) {//se comparar == não ira imprimir
			System.out.println("A nossa condição é verdadeira");
		}
		
		System.out.println("numeroUm é igual a numeroDois" + simNao);
		//false
		
		simNao = numero1 != numero2;
		System.out.println("numeroum é diferente de numeroDois" + simNao);
		//true
		
		simNao = numero1 > numero2;
		System.out.println("numeroum é maior que numeroDois" + simNao);
		//false
		
////////////////////////////////
		
		String nome1 = "euu";
		String nome2 = "euu";
		System.out.println(nome1 == nome2);// true
		//se criar um novo objeto da false
		//String nome2 = new String("euu");  false
		
		//se utilizar equals que compara objetos, ira dar true
		//System.out.println(nome1.equals(nome2));   true

	}

}
