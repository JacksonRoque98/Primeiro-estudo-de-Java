package Padaria;

public class Chapeiro extends Funcionario{

	public Chapeiro(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Double salario,
			Integer numRegistro) {
		super(nome, idade, altura, sexo, cpf, saldo, salario, numRegistro);
	}
	public void fazerLanches(Integer lanches) {
		if(lanches >= 1) {
			System.out.println("Lanche saindo...");
		}
		else {
			System.out.println("Aguardando pedidos de lanche!");
		}
	}
	public void novoSaldo() {
		Double novoSaldo = getSaldo() + getSalario();
		System.out.println("Seu saldo após receber o salário é "+novoSaldo);
	}
}
