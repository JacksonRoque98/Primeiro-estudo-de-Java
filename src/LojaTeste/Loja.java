package LojaTeste;

import java.util.ArrayList;
import java.util.List;

import Teste.Pessoa;



public class Loja {
	
	List<Pessoa> listaDePessoas = new ArrayList<>();
	
	public void adicionarFuncionarioNaLista(Pessoa p) {
		listaDePessoas.add(p);
	}
	
	public void demitirFuncionario(Pessoa p) {
		listaDePessoas.remove(p);
	}
	
	public void mostrarListaDeFuncionarios(){
		System.out.println("----------Lista de Funcionários----------");
		listaDePessoas.forEach(nome -> {
			System.out.println("Nome: "+nome.getNome()+"           Idade:"+nome.getIdade());
		});
		
	}
}
