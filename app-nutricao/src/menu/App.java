package menu;


import cadastros.CadastroAlimento;
import cadastros.CadastroCombinacao;
import cadastros.CadastroReceita;
import database.Database;

public class App {

	static Database db = Database.getDatabase();
	static CadastroAlimento cadastroAlimento = new CadastroAlimento(db.getAlimentos());
	static CadastroCombinacao cadastroCombinacao = new CadastroCombinacao();
	static CadastroReceita cadastroReceita = new CadastroReceita();
	
	public static void main(String[] args) {
		cadastroAlimento.cadastrar();
		cadastroAlimento.cadastrar();
		cadastroCombinacao.cadastrar();
		cadastroReceita.cadastrar();
	}

}
