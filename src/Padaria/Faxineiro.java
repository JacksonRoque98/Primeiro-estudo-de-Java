package Padaria;

public class Faxineiro extends Funcionario{
	
	private char tamanhoUniforme;
	
	public Faxineiro(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, 
			Double salario, Integer numRegistro, char tamanhoUniforme) {
		super(nome, idade, altura, sexo, cpf, saldo, salario, numRegistro);
		this.tamanhoUniforme = tamanhoUniforme;
		
	}

	public char getTamanhoUniforme() {
		return tamanhoUniforme;
	}

	public void setTamanhoUniforme(char tamanhoUniforme) {
		this.tamanhoUniforme = tamanhoUniforme;
	}
	
	public void limparChao(String chao) {
		if(chao == "Sujo" || chao == "sujo"){
			System.out.println("Vou limpar o chão!!");
		}
		else {
			System.out.println("O chão está limpo!");
		}
	}
	
	public void novoSaldo() {
		Double novoSaldo = getSaldo() + getSalario();
		System.out.println("Seu saldo após receber o salário é "+novoSaldo);
	}
}
