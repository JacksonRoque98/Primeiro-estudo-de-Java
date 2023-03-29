package Padaria;

public class Cliente extends Pessoa{
	
	private Integer comandaFixa;

	public Cliente(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Integer comandaFixa) {
		super(nome, idade, altura, sexo, cpf, saldo);
		this.comandaFixa = comandaFixa;
				
	}

	public Integer getComandaFixa() {
		return comandaFixa;
	}

	public void setComandaFixa(Integer comandaFixa) {
		this.comandaFixa = comandaFixa;
	}
	
	public void comprarPao() {
		if(getSaldo() >= 2) {
			setSaldo(getSaldo()-2);
			System.out.println("Seu saldo atual é R$ "+getSaldo());
			}
		else {
			System.out.println("Não será possivel comprar, pois o seu saldo é inválido!");
		}
	}
	
	
}
