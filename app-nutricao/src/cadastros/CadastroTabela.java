package cadastros;

import controle.Controlador;
import nutri.TabelaNutricional;

public class CadastroTabela {
	
	private Controlador ctrl = new Controlador();
	
	
	public CadastroTabela() {
		this.ctrl = Controlador.obterControlador();
	}
	
	public TabelaNutricional cadastrarTabela() {
		double carboidratos = ctrl.lerDouble("Carboidratos: ");
		double proteinas = ctrl.lerDouble("Proteinas: ");
		double gordurasTotais = ctrl.lerDouble("Gorduras Totais: ");
		double gordurasSaturadas = ctrl.lerDouble("Gorduras Saturadas: ");
		double fibraAlimentar = ctrl.lerDouble("Fibra Alimentar: ");
		double sodio = ctrl.lerDouble("Sodio: ");
		
		TabelaNutricional tabelaNutri = new TabelaNutricional(carboidratos, proteinas,gordurasTotais,gordurasSaturadas,fibraAlimentar,sodio);
		return tabelaNutri;
	}

}
