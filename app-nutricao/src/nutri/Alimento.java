package nutri;

public class Alimento implements Ingrediente {
	
	protected String nome;
	protected Grupo grupo;
	protected TabelaNutricional tabela; 

	
	public Alimento(String nome, Grupo grupo, TabelaNutricional tabela) {
		this.nome = nome;
		this.grupo = grupo;
		this.tabela = tabela;
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
	
	public String toString() {
		return "Nome:"+nome+"\n"+
				"Grupo de alimento:"+grupo+ "\n";
	}

}
