package nutri;

import com.google.gson.annotations.SerializedName;

public class Alimento {
	
	protected String nome;
	protected Grupo grupo;

	@SerializedName("tabela_nutricional")
	protected TabelaNutricional tabela; 

	public Alimento(String nome, Grupo grupo, TabelaNutricional tabela) {
		this.nome = nome;
		this.grupo = grupo;
		this.tabela = tabela;
	}

	public Alimento(String nome) {
		this(nome, null, null);
	}

	public TabelaNutricional getTabela() {
		return tabela;
	}

	public void setTabela(TabelaNutricional tabela) {
		this.tabela = tabela;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	public String getDescricao() {
		return
			"Nome: "  + nome  + "\n" +
			"Grupo: " + grupo + "\n" +
			"Tabela nutricional:\n" + tabela;
	}

}