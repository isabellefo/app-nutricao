package nutri;

public class Alimento {
	
	protected String nome;
	protected Grupo grupo;
	
	public Alimento(String nome, Grupo grupo) {
		this.nome = nome;
		this.grupo = grupo;
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

}
