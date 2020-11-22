package menu;

import cadastros.CadastroAlimento;
import database.Database;
import nutri.Alimento;

public class App {

	static Database db = Database.getDatabase();
	static CadastroAlimento cadastro = new CadastroAlimento(db.getAlimentos());
	
	public static void main(String[] args) {

		cadastro.cadastrar();
		for (Alimento a : db.getAlimentos()) {
			System.out.println(a.toString());
			System.out.println(a.getTabela().toString());
		}
	}

}
