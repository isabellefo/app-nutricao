package cadastros;

import java.util.List;

import controle.Controlador;
import nutri.Alimento;
import nutri.Grupo;
import nutri.TabelaNutricional;

public class CadastroAlimento {
	private CadastroTabela cadastrotabela = new CadastroTabela();
	private Controlador ctrl = new Controlador();
	
	public CadastroAlimento() {
		this.ctrl = Controlador.obterControlador();
	}
	
	public void cadastrarAlimento(List<Alimento> alimentos) {
		String nome = ctrl.lerString("Nome do alimento: ");
		Grupo grupo = ctrl.lerOpcao("Grupo: ", Grupo.getGrupo());
		TabelaNutricional tabela = cadastrotabela.cadastrarTabela();
		Alimento alimento= new Alimento(nome, grupo,tabela);
		alimentos.add(alimento);
	}
	
	
}
