package nutri;

import java.util.List;

public class Receita {
	
	private String nome;
	private List<Alimento>ingredientes;
	private String tempo;
	private String preparo;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Alimento> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Alimento> ingredientes) {
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
