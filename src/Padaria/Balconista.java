package Padaria;

public class Balconista extends Funcionario{
	
	private String tipoDeChapeu;

	public Balconista(String nome, Integer idade, Double altura, char sexo, String cpf, Double saldo, Double salario,
			Integer numRegistro, String tipoDeChapeu) {
		super(nome, idade, altura, sexo, cpf, saldo, salario, numRegistro);
		this.tipoDeChapeu = tipoDeChapeu;
	}

	public void settipoDeChapeu(String tipoDeChapeu) {
		this.tipoDeChapeu = tipoDeChapeu;
	}
	
	public String gettipoDeChapeu() {
		return this.tipoDeChapeu;
	}
	
	public void atenderCliente(Integer cliente, Double horario) {
		Double manha1 = 06.00;
		Double manha2 = 12.00;
		Double tarde1 = 12.01;
		Double tarde2 = 18.00;
		Double noite1 = 18.01;
		Double noite2 = 22.00;
		if(cliente >= 1){
			if(horario >= manha1 && horario <= manha2) {
				System.out.println("Bom dia, o que deseja?");				
			}
			else if(horario >= tarde1 && horario <= tarde2) {
				System.out.println("Boa tarde, o que deseja?");
			}
			else if(horario >= noite1 && horario <= noite2) {
				System.out.println("Boa noite, o que deseja?");
			}
			else {
				System.out.println("Encerramos nossos atendimentos! Volte amanhã!");
			}
		}
		else {
			System.out.println("Aguardando clientes!!");
		}
	}
	public void novoSaldo() {
		Double novoSaldo = getSaldo() + getSalario();
		System.out.println("Seu saldo após receber o salário é "+novoSaldo);
	}
}
