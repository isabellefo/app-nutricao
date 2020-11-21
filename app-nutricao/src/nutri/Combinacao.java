package nutri;

import java.util.Arrays;
import java.util.List;

public class Combinacao{
	private List<Alimento>alimentos;
	
	public Combinacao(Alimento ...alimentos) {
		this.alimentos = Arrays.asList(alimentos);
	}
	private String nomeCombinacao;
	
	public String getNome() {
		return nomeCombinacao;
	}
	public void setNome(String nome) {
		this.nomeCombinacao = nome;
	}
	public List<Alimento> getAlimento() {
		return alimentos;
	}
	public void setAlimento(List<Alimento> alimento) {
		this.alimentos = alimento;
	}

}
