package nutri;

import java.util.List;
import java.util.stream.Collectors;

public class Receita {
	private String nome;
	private List<Ingrediente> ingredientes;
	private String tempo;
	private String preparo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public TabelaNutricional getTabela() {
		return TabelaNutricional.somarTabelas(
				ingredientes.stream()
					.map(a -> a.getTabela())
					.collect(Collectors.toList())
				);
	}
	
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public String getTempo() {
		return tempo;
	}
	
	public void setTempo(String tempo) {
		this.tempo = tempo;
	}
	
	public String getPreparo() {
		return preparo;
	}
	
	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}


}
