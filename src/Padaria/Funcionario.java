package Padaria;

public class Funcionario extends Pessoa{
	
	private Double salario;
	private Integer numRegistro;
	
	public Funcionario(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Double salario, Integer numRegistro) {
		super(nome, idade, altura, sexo, cpf, saldo);
		this.salario = salario;
		this.numRegistro = numRegistro;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(Integer numRegistro) {
		this.numRegistro = numRegistro;
	}
	
}
