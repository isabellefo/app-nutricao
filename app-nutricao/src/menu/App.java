package menu;

import cadastros.CadastroAlimento;
import cadastros.CadastroCombinacao;
import cadastros.CadastroReceita;
import database.Database;
import calculo.IMC;


public class App {

	static Database db = Database.getDatabase();

	static CadastroReceita ReceitaOp = new CadastroReceita();
	static CadastroAlimento AlimentoOp = new CadastroAlimento(db.getAlimentos());
	static CadastroCombinacao CombinacaoOp = new CadastroCombinacao();
	static IMC ImcOp = new IMC();
	
	public static void main(String[] args) {
		
		Menu menu = new Menu();
		menu.run();
	}

}
