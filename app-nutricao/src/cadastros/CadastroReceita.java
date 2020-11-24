package cadastros;

import java.util.List;

import controle.Controlador;
import database.Database;
import nutri.Alimento;
import nutri.Receita;
import nutri.ReceitaBuilder;

public class CadastroReceita extends Cadastro<Receita> {
	private ReceitaBuilder receitaBuilder;
	private List<Receita> receitas;
	private Alimento[] alimentos;
	private Controlador ctrl;
	
	public CadastroReceita() {
		this.ctrl = Controlador.obterControlador();
		this.receitaBuilder = new ReceitaBuilder();
		this.receitas = Database.getDatabase().getReceitas();
		this.alimentos = Database.getDatabase().getAlimentosArray();
	}
	
	private void lerNome() {
		receitaBuilder.nome(ctrl.lerString("Nome: "));
	}
	
	private void lerTempoPreparo() {
		receitaBuilder.tempoPreparo(ctrl.lerString("Tempo de preparo: "));
	}
	
	private void lerModoPreparo() {
		receitaBuilder.tempoPreparo(ctrl.lerString("Modo de preparo: "));
	}
	
	private Alimento[] getAlimentos() {
		return Database.getDatabase().getAlimentosArray();
	}
	
	private Alimento escolherAlimento() {
		String[] opcoes =  new String[] {
				"Escolher Alimento",
				"Fim"
		};
		String opcao = ctrl.lerOpcao("", opcoes);
		if ("Fim".equals(opcao)) {
			return null;
		}
		
		return ctrl.lerOpcao("Escolha um alimento: ", getAlimentos());
	}
	
	private void lerIngredientes() {
		
		Alimento alimento = ctrl.lerOpcao("Alimentos: ", alimentos);
		while(alimento != null ) {
			int q = ctrl.lerInt("Quantidade");
			receitaBuilder.ingrediente(alimento, q);
			alimento = escolherAlimento();
			q = ctrl.lerInt("Quantidade");
		}
		receitaBuilder.tempoPreparo(ctrl.lerString("Tempo de preparo: "));
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
