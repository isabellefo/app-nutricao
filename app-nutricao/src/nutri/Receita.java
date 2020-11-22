package nutri;

import java.util.Map;

public class Receita {
	
	private String nome;
	private Map<Alimento, Integer> ingredientes; // alimento e quantidade
	private String tempo;
	private String preparo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<Alimento, Integer> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(Map<Alimento, Integer> ingredientes) {
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

	public String toString() {
		String descricao = "";

		descricao += nome.toUpperCase() + "\n";
		descricao += "Tempo de preparo: " + tempo + "\n\n";
		descricao += "Ingredientes:\n";
		for (var entry: ingredientes.entrySet()) {
			descricao += String.format("  %d %s\n", entry.getValue(), entry.getKey().getNome());
		}

		descricao += "\nModo de preparo:\n" + preparo;

		return descricao;
	}

}
