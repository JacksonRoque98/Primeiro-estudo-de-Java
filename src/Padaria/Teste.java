package Padaria;

public class Teste {
	
	public static void main(String[] args) {
		
		Faxineiro faxineiro1 = new Faxineiro("José", 30, 1.84, 'M', "123.456.789-10", 5000.00, 2000.00, 123456, 'M');
		
		faxineiro1.limparChao("limpo");
		
		Chapeiro chapeiro1 = new Chapeiro("Carlos", 35, 1.69, 'M', "789.456.123-10", 2500.00, 4000.00, 789456);
		
		chapeiro1.fazerLanches(0);
		
		System.out.println();
		System.out.println();
	}
}
