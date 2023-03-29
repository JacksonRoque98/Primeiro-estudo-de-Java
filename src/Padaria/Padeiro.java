package Padaria;

public class Padeiro extends Funcionario{
	

	public Padeiro(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Double salario,
			Integer numRegistro) {
		super(nome, idade, altura, sexo, cpf, saldo, salario, numRegistro);
	}
	
	public void fazerPao(Integer qtdPao) {
		if(qtdPao <= 20) {
			System.out.println("Vou assar mais pães!!");
		}
		else {
			System.out.println("No momento temos "+qtdPao+" pães prontos, quando tiver menos de 20 pães, eu asso mais!");
		}
	}
	
	public void novoSaldo() {
		Double novoSaldo = getSaldo() + getSalario();
		System.out.println("Seu saldo após receber o salário é "+novoSaldo);
	}
}
