package cadastros;

import java.util.List;

import controle.Controlador;
import nutri.Alimento;
import nutri.Grupo;

public class CadastroAlimento {
	private Controlador ctrl = new Controlador();
	
	public CadastroAlimento() {
		this.ctrl = Controlador.obterControlador();
	}
	
	public void cadastrarAlimento(List<Alimento> alimentos) {
		String nome = ctrl.lerString("Nome do alimento: ");
		Grupo grupo = ctrl.lerOpcao("Grupo: ", Grupo.getGrupo());	
		Alimento alimento= new Alimento(nome, grupo);
		alimentos.add(alimento);
	}
	
	
}
