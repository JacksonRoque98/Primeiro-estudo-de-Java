package Padaria;

public class Copeiro extends Funcionario{
	
	public Copeiro(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Double salario, Integer numRegistro) {
		super(nome, idade, altura, sexo, cpf, saldo, salario, numRegistro);
	}
	
	public void retirarCafe(Integer cliente) {
		if(cliente >= 1) {
			System.out.println("Saindo um cafezinho...");
		}
		else {
			System.out.println("A espera do cliente para fazer o café!");
		}
	}

}
