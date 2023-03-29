package Lista;

import LojaTeste.Loja;

import Teste.Pessoa;

public class Lista {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jackson", 24, 1.84, "123.456.789-10");
		Pessoa p2 = new Pessoa("Paulo", 19, 1.78, "987.654.321.00");
		Pessoa p3 = new Pessoa("Daniel", 16, 1.82, "456.789.123-12");
		
		
//		List<Pessoa> listaDePessoas = new ArrayList<>();
//		listaDePessoas.add(p1);
//		listaDePessoas.add(p2);
//		listaDePessoas.add(p3);
//		
//		listaDePessoas.forEach(nome -> {
//			System.out.println("Nome: "+nome.getNome()+"-------------- Idade: "+nome.getIdade());
//		});
		
		

		Loja loja = new Loja();
		loja.adicionarFuncionarioNaLista(p1);
		loja.adicionarFuncionarioNaLista(p2);
		loja.adicionarFuncionarioNaLista(p3);
		loja.mostrarListaDeFuncionarios();
		
		loja.demitirFuncionario(p2);
		loja.mostrarListaDeFuncionarios();
	}

}
