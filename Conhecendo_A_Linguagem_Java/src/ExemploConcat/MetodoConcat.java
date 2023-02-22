package ExemploConcat;

public class MetodoConcat {
	public  static  void  main ( String [] args ) {

		String  primeiroNome = "Lucas" ;
		String  segundoNome = "Barbosa" ;
		
		String  nomeCompleto = nomeCompleto ( primeiroNome , segundoNome );
		System.out.println( nomeCompleto );
	}
	
	public  static  String  nomeCompleto ( String  primeiroNome , String  segundoNome ) {
		
		return  "Resultado do método " +   primeiroNome . concat ( " " ). concat ( segundoNome );
	}
}