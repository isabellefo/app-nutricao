package nutri;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Combinacao  implements Ingrediente {
	private List<Alimento> alimentos;
	private String nomeCombinacao;
	
	public Combinacao(String nomeCombinacao) {
		this.alimentos = new ArrayList<>();
		this.nomeCombinacao = nomeCombinacao;
	}
	
	public TabelaNutricional getTabela() {
		return TabelaNutricional.somarTabelas(
				alimentos.stream()
					.map(a -> a.getTabela())
					.collect(Collectors.toList())
				);
	}
	
	public String getNome() {
		return nomeCombinacao;
	}
	
	public void setNome(String nome) {
		this.nomeCombinacao = nome;
	}
	
	public int getAlimentosSize() {
		return alimentos.size();
	}
	public List<Alimento> getAlimentos() {
		return alimentos;
	}
	
	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	
	public void addAlimento(Alimento alimento) {
		this.alimentos.add(alimento);
	}

}
