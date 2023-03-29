package Padaria;

public class Caixa extends Funcionario{
	
	public Caixa(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Double salario, Integer numRegistro) {
		super(nome, idade, altura, sexo, cpf, saldo, salario, numRegistro);
	}
	public void receberPagamento(Double valorDaCompra, String formaDePagamento){
		if(formaDePagamento == "credito") {
			valorDaCompra = valorDaCompra + (valorDaCompra* 0.1);
			System.out.println("Para pagamentos em crédito, temos um adicional de 10% da maquina de cartão! Sua compra ficou R$"+valorDaCompra);
		}
		else if(formaDePagamento == "debito") {
			System.out.println("Para pagamentos em debito, o valor da sua compra permanece o mesmo! Sua conta deu R$"+valorDaCompra);
		}
		else if(formaDePagamento == "dinheiro") {
			valorDaCompra = valorDaCompra - (valorDaCompra * 0.1);
			System.out.println("Para pagamentos em dinheiro, temos um desconto de 10%! Sua compra ficou R$"+valorDaCompra);
		}
	}
}