package menu;

public class Menu {
	public void ShowMenu() {
		System.out.println("|------ MENU ------|");
		System.out.println("[1] - Cadastro de Alimento");
		System.out.println("[2] - Cadastro de Combina��o");
		System.out.println("[3] - Cadastro de Receita");
		System.out.println("[4] - Calcular IMC");
		System.out.println("[5] - Listar Dados");
		System.out.println("[6] - Sair");
	}
	public void ShowSubMenu() {
		System.out.println("|------ LISTAGEM ------|");
		System.out.println("[1] - Alimentos Cadastrados");
		System.out.println("[2] - Combina��es Cadastradas");
		System.out.println("[3] - Receitas Cadastradas");
		System.out.println("[4] - Voltar menu");
	}
}
