package menu;

import cadastros.CadastroAlimento;
import cadastros.CadastroCombinacao;
import cadastros.CadastroReceita;
import database.Database;

import controle.Controlador;
import calculo.IMC;


public class App {

	static Database db = Database.getDatabase();

	static CadastroReceita ReceitaOp = new CadastroReceita();
	static CadastroAlimento AlimentoOp = new CadastroAlimento(db.getAlimentos());
	static CadastroCombinacao CombinacaoOp = new CadastroCombinacao();
	static IMC ImcOp = new IMC();
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		int op = 0;
		int opsub = 0;
		do{
			menu.ShowMenu();
			Controlador controle = Controlador.obterControlador();
			op = controle.LerOpcaoMenu();
			
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
				menu.ShowSubMenu();
				opsub = controle.LerOpcaoMenu();
				
				switch (opsub) {
				
					case 1:
						//ListarAlimento
						break;
					case 2:
						//ListarCombinacao
						break;
					case 3:
						//ListarReceita
						break;
					case 4:
						menu.ShowMenu();
				
				}
				
				break;
			case 6:
				System.out.println("Programa finalizado!");
				break;
			default:
				menu.ShowMenu();
			}
		 }while(op != 0);
	}

}
