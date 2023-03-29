package Padaria;

public class Confeitero extends Funcionario{

	public Confeitero(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Double salario,
			Integer numRegistro) {
		super(nome, idade, altura, sexo, cpf, saldo, salario, numRegistro);
	}
	
	public void fazerDoce(Integer qtdDoces) {
		if(qtdDoces <= 10) {
			System.out.println("Vou fazer mais alguns doces!!");
		}
		else {
			System.out.println("No momento temos "+qtdDoces+" doces prontos, quando tiver menos de 10 doces, eu faço mais!");
		}
	}
	
	public void novoSaldo() {
		Double novoSaldo = getSaldo() + getSalario();
		System.out.println("Seu saldo após receber o salário é "+novoSaldo);
	}
}