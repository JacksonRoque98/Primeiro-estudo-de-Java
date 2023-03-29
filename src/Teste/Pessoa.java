package Teste;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private Double altura;
	private String cpf;
	
	public Pessoa(String nome, Integer idade, Double altura, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.cpf = cpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getIdade() {
		return this.idade;
	}
	
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public Double getAltura() {
		return this.altura;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}
