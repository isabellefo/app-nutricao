package cadastros;

import java.util.List;

import controle.Controlador;
import database.Database;
import nutri.Ingrediente;
import nutri.Receita;
import nutri.ReceitaBuilder;

public class CadastroReceita extends Cadastro<Receita> {
	private ReceitaBuilder receitaBuilder;
	private List<Receita> receitas;
	private Controlador ctrl;
	
	public CadastroReceita() {
		this.ctrl = Controlador.obterControlador();
		this.receitaBuilder = new ReceitaBuilder();
		this.receitas = Database.getDatabase().getReceitas();
	}
	
	private void lerNome() {
		receitaBuilder.nome(ctrl.lerString("Nome: "));
	}
	
	private void lerTempoPreparo() {
		receitaBuilder.tempoPreparo(ctrl.lerString("Tempo de preparo: "));
	}
	
	private void lerModoPreparo() {
		receitaBuilder.modoPreparo(ctrl.lerString("Modo de preparo: "));
	}
	
	private Ingrediente[] getIngredientes() {
		return Database.getDatabase().getIngredientesArray();
	}
	
	private Ingrediente escolherIngredientes() {
		String[] opcoes =  new String[] {
				"Escolher ingrediente",
				"Fim"
		};
		String opcao = ctrl.lerOpcao("", opcoes);
		if ("Fim".equals(opcao)) {
			return null;
		}
		
		return ctrl.lerOpcao("Escolha um alimento: ", getIngredientes());
	}
	
	private void lerIngredientes() {
		Ingrediente ingrediente = ctrl.lerOpcao("Ingredientes: ", getIngredientes());
		while(ingrediente != null ) {
			int q = ctrl.lerInt("Quantidade: ");
			receitaBuilder.ingrediente(ingrediente, q);
			ingrediente = escolherIngredientes();
		}
	}
	
	@Override
	public Receita cadastrar() {
		lerNome();
		lerIngredientes();
		lerTempoPreparo();
		lerModoPreparo();
		Receita receita = receitaBuilder.obterReceita();
		receitas.add(receita);
		return receita;
	}

}
