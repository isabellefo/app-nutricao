package menu;


import cadastros.CadastroAlimento;
import cadastros.CadastroCombinacao;
import cadastros.CadastroReceita;
import calculo.IMC;
import controle.Controlador;
import database.Database;

public class App {

	static Database db = Database.getDatabase();
	static CadastroAlimento cadastroAlimento = new CadastroAlimento(db.getAlimentos());
	static CadastroCombinacao cadastroCombinacao = new CadastroCombinacao();
	static CadastroReceita cadastroReceita = new CadastroReceita();
	static IMC ImcOp = new IMC();
	
public static void main(String[] args) {
		
		Menu menu = new Menu();
		int op = 0;
		int opsub = 0;
		do{
			menu.ShowMenu();
			Controlador controle = new Controlador();  
			op = controle.LerOpcaoMenu();
			
			switch (op) {
			
			case 1:
				cadastroAlimento.cadastrar();
				break;
			case 2:
				cadastroCombinacao.cadastrar();
				break;
			case 3:
				cadastroReceita.cadastrar();
				break;
			case 4:
				ImcOp.calculaImc();
				break;
			case 5:
				menu.ShowSubMenu();
				opsub = controle.LerOpcaoMenu();
				
				switch (opsub) {
					case 1:
						//Listar alimento 
						break;
					case 2:
						//Listar combinações
						break;
					case 3:
						//Listar receitas
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
