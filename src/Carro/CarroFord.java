package Carro;

public class CarroFord extends Carro{
	
	private String tetoSolar;
	private Integer identificadorUnico;
	private boolean hibrido;
		
	public CarroFord(String tetoSolar,Integer identificadorUnico, boolean hibrido) {
		super();
		this.tetoSolar = tetoSolar;
		this.identificadorUnico = identificadorUnico;
		this.hibrido = hibrido;
	}

	public String getTetoSolar() {
		return tetoSolar;
	}

	public void setTetoSolar(String tetoSolar) {
		this.tetoSolar = tetoSolar;
	}

	public Integer getIdentificadorUnico() {
		return identificadorUnico;
	}

	public void setIdentificadorUnico(Integer identificadorUnico) {
		this.identificadorUnico = identificadorUnico;
	}

	public boolean isHibrido() {
		return hibrido;
	}

	public void setHibrido(boolean hibrido) {
		this.hibrido = hibrido;
	}

	
	
	
}
