package Padaria;

public class Gerente extends Funcionario{
	
	private Double metaMensal;

	public Gerente(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Double salario,
			Integer numRegistro, Double metaMensal) {
		super(nome, idade, altura, sexo, cpf, saldo, salario, numRegistro);
		this.metaMensal = metaMensal;
	}
	
	public void setMetaMetasal(Double metaMensal) {
		this.metaMensal = metaMensal;
	}
	
	public Double getMetaMensal() {
		return this.metaMensal;
	}
	
	public void promocaoSalario(){
		if(getMetaMensal() >= 50000.00) {
			setSalario(getSalario() + (getSalario() * 0.1));
			System.out.println("Parabéns "+getNome()+" você bateu a meta de R$50.000,00. Você ganhou um bonus de 10% em cima do seu salario!"
					+ "Seu salario deste mês será R$"+getSalario());
		}
		else {
			System.out.println("Infelizmente "+getNome()+" você não bateu a meta mensal, por isso não receberá uma bonificação esse mês!");
		}
	}
}
