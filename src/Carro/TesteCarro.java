package Carro;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		carro1.setModelo("Jetta");
		carro1.setMarca("Volksvagem");
		carro1.setAno(2016);
		carro1.setMotor(2.5);
		carro1.setPortas(4);
		carro1.setRodas(true);
		
		carro2.setModelo("Camaro");
		carro2.setMarca("Chevrolet");
		carro2.setAno(2020);
		carro2.setMotor(5.0);
		carro2.setPortas(2);
		carro2.setRodas(false);
		
		
		System.out.println("O carro do modelo "+carro1.getModelo()+" da marca "+carro1.getMarca()+" do ano "
				+carro1.getAno()+" tem um motor de "+carro1.getMotor()+"v, possui "+carro1.getPortas()+" portas!");
		
		System.out.println("O carro do modelo "+carro2.getModelo()+" da marca "+carro2.getMarca()+" do ano "
				+carro2.getAno()+" tem um motor de "+carro2.getMotor()+"v, possui "+carro2.getPortas()+" portas!");
	}

}
