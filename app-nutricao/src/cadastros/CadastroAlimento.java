package cadastros;

import java.util.List;

import controle.Controlador;
import nutri.Alimento;
import nutri.Grupo;
import nutri.TabelaNutricional;

public class CadastroAlimento extends Cadastro<Alimento> {
	static CadastroTabela cadastrotabela = new CadastroTabela();
	private Controlador ctrl = Controlador.obterControlador();
	private List<Alimento> alimentos;
	
	public CadastroAlimento(List<Alimento> alimentos) {
		super();
		this.alimentos = alimentos;
	}
	
	public Alimento cadastrar() {
		String nome = ctrl.lerString("Nome do alimento: ");
		Grupo grupo = ctrl.lerOpcao("Grupo: ", Grupo.getGrupo());
		TabelaNutricional tabela = cadastrotabela.cadastrar();
		Alimento alimento= new Alimento(nome, grupo,tabela);
		alimentos.add(alimento);
		return alimento;
	}
	
	
}
