package cadastros;

import java.util.List;

import database.Database;
import nutri.Alimento;
import nutri.Combinacao;

public class CadastroCombinacao extends Cadastro<Combinacao> {
	private List<Combinacao> combinacoes;
	private Alimento[] alimentos = Database.getDatabase().getAlimentosArray();
	
	public CadastroCombinacao() {
		super();
		this.combinacoes = Database.getDatabase().getCombinacoes();
	}
	
	private Alimento escolherIngrediente() {
		String[] opcoes =  new String[] {
				"Escolher Alimento",
				"Fim."
		};
		String opcao = ctrl.lerOpcao("", opcoes);
		if ("Fim".equals(opcao)) {
			return null;
		}
		
		return ctrl.lerOpcao("Escolha um alimento: ", alimentos);
	}
	
	@Override
	public Combinacao cadastrar() {
		String nome = ctrl.lerString("Nome da combinacao: ");
		Combinacao combinacao = new Combinacao(nome);
		Alimento alimento = null;
		while(true) {
			alimento = escolherIngrediente();
			if(alimento == null) {
				break;
			}
			combinacao.addAlimento(alimento);
		}
		if(combinacao.getAlimentosSize() > 0) {
			combinacoes.add(combinacao);
			return combinacao;
		}
		return null;
		
	}
	

}
