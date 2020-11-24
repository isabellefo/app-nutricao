package menu;

import cadastros.CadastroAlimento;
import cadastros.CadastroCombinacao;
import cadastros.CadastroReceita;
import calculo.IMC;
import controle.Controlador;
import database.Database;

public class Menu {
	
	Database db = Database.getDatabase();
	CadastroReceita ReceitaOp = new CadastroReceita();
	CadastroAlimento AlimentoOp = new CadastroAlimento(db.getAlimentos());
	CadastroCombinacao CombinacaoOp = new CadastroCombinacao();
	IMC ImcOp = new IMC();
	
	public void ShowMenu() {
		System.out.println("|------ MENU ------|");
		System.out.println("[1] - Cadastro de Alimento");
		System.out.println("[2] - Cadastro de Combinação");
		System.out.println("[3] - Cadastro de Receita");
		System.out.println("[4] - Calcular IMC");
		System.out.println("[5] - Listar Dados");
		System.out.println("[6] - Sair");
	}
	
	public void ShowSubMenu() {
		System.out.println("|------ LISTAGEM ------|");
		System.out.println("[1] - Alimentos Cadastrados");
		System.out.println("[2] - Combinações Cadastradas");
		System.out.println("[3] - Receitas Cadastradas");
		System.out.println("[4] - Voltar menu");
	}
	
	public boolean sair(int op) {
		return op == 6;
	}
	
	public void run () {
		int op = 0;
		int opsub = 0;
		do{
			ShowMenu();
			Controlador controle = Controlador.obterControlador();
			op = controle.lerInt("Opcao: ");
			
			switch (op) {
			
			case 1:
				AlimentoOp.cadastrar();
				break;
			case 2:
				CombinacaoOp.cadastrar();
				break;
			case 3:
				ReceitaOp.cadastrar();
				break;
			case 4:
				ImcOp.calculaImc();
				break;
			case 5:
				ShowSubMenu();
				opsub = controle.lerInt("Opcao: ");
				
				switch (opsub) {
				
					case 1:
						db.printAlimentos();
						break;
					case 2:
						db.printCombinacoes();
						break;
					case 3:
						db.printReceitas();
						break;
					case 4:
						ShowMenu();
				
				}
				
				break;
			case 6:
				System.out.println("Programa finalizado!");
				break;
			default:
				ShowMenu();
			}
		 }while(sair(op));
	}
}
