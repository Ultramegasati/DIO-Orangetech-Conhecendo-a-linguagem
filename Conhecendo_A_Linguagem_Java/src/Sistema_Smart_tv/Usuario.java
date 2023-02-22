package Sistema_Smart_tv;

public class Usuario {

	public static void main(String[] args) {

		SmartTv smartTv = new SmartTv();
		
		smartTv.diminuirVolume();  //24
		smartTv.diminuirVolume();  //23
		smartTv.diminuirVolume();  //22
		smartTv.aumentarVolume();  //23
		
		System.out.println("Volume atual? " + smartTv.volume);
		
		System.out.println("Tv ligada? " + smartTv.ligada);
		System.out.println("Volume atual? " + smartTv.volume);

		smartTv.ligar();  //chamando método
		System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
		
		smartTv.desligar();
		System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
		
		System.out.println("Canal atual? " + smartTv.canal);
		smartTv.mudarCanal(15);
		System.out.println("Canal atual? " + smartTv.canal);
		
		
		
	}

}
