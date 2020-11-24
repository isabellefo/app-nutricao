package menu;


import cadastros.CadastroAlimento;
import cadastros.CadastroCombinacao;
import database.Database;

public class App {

	static Database db = Database.getDatabase();
	static CadastroAlimento cadastroAlimento = new CadastroAlimento(db.getAlimentos());
	static CadastroCombinacao cadastroCombinacao = new CadastroCombinacao();
	
	public static void main(String[] args) {
		
	}

}
