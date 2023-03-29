package Carro;

public class Carro {
	
	private Double Motor;
	private Integer Portas;
	private Boolean Rodas;
	private String Marca;
	private String Modelo;
	private Integer Ano;
	
	
	public void setMotor(Double Motor) {
		this.Motor = Motor;
	}
	public Double getMotor() {
		return this.Motor;
	}
	public void setPortas(Integer Portas) {
		this.Portas = Portas;
	}	
	public Integer getPortas() {
		return this.Portas;
	}	
	public void setRodas(Boolean Rodas) {
		this.Rodas = Rodas;
	}	
	public Boolean getRodas() {
		return this.Rodas;
	}
	public void setMarca(String Marca) {
		this.Marca = Marca;
	}
	public String getMarca() {
		return this.Marca;
	}
	public void setModelo(String Modelo) {
		this.Modelo = Modelo;
	}
	public String getModelo() {
		return this.Modelo;
	}
	public void setAno(Integer Ano) {
		this.Ano = Ano;
	}
	public Integer getAno() {
		return this.Ano;
	}	
	
	public String ligarCarro() {
		return "Carro Ligado";
	}
	public String desligarCarro() {
		return "Carro Desligado";
	}
}
	
