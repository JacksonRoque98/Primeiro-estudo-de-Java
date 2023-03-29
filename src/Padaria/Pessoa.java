package Padaria;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private Double altura;
	private char sexo;
	private String cpf;
	private Double saldo;
	
	public Pessoa(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.sexo = sexo;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void andar() {
		System.out.println("Andando...");
	}
	
	public void comprarVariosPaes(Double qtds) {
		Double precoAPagar = 2 * qtds;
		Double diferenca = precoAPagar - getSaldo();
		if(getSaldo() >= precoAPagar) {
			setSaldo(getSaldo() - precoAPagar);
			System.out.println("Você acabou de comprar "+qtds+" paes na padaria!");
			System.out.println("Seu saldo é de R$"+getSaldo());
		}
		else if(diferenca == 10) {
			setSaldo(getSaldo() - (precoAPagar - 10));
			System.out.println("Você conseguiu um desconto!!!!");
			System.out.println("Você acabou de comprar "+qtds+" paes na padaria!");
			System.out.println("Seu saldo é de R$"+getSaldo());
		}
		else {
			System.out.println("Saldo Insuficiente");
		}
	}
}