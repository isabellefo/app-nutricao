package menu;

import java.util.ArrayList;
import java.util.List;

import cadastros.CadastroAlimento;
import nutri.Alimento;

public class App {

	//Apenas teste, pode apagar depois
	static List<Alimento> alimento = new ArrayList<Alimento>();
	static CadastroAlimento cadastro = new CadastroAlimento();
	
	public static void main(String[] args) {

		cadastro.cadastrarAlimento(alimento);
		for (Alimento a : alimento) {
			System.out.println(a.toString());
			System.out.println(a.getTabela().toString());
		}
	}

}
