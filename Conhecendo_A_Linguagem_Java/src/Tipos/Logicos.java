package Tipos;

public class Logicos {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = false;
		
		if(condicao1 && condicao2) { //as DUAS condições tem que ser verdadeira
			System.out.println("As duas condições são verdadeiras");
		}
		System.out.println("fim");

		
		if(condicao1 || condicao2) {  //uma das condições pode ser verdadiera
			System.out.println("Uma das condições é verdadeira");
		}
		
		if(condicao1 && (8 > 3)) { //se condição1 for true e 8 maior que 3 
			System.out.println("As duas condições são verdadeiras");
		}
		
		
	}

}
