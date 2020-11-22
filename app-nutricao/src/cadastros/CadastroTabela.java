package cadastros;

import controle.Controlador;
import nutri.TabelaNutricional;
import nutri.TabelaNutricionalBuilder;

public class CadastroTabela extends Cadastro<TabelaNutricional> {
	
	private Controlador ctrl = new Controlador();
	private TabelaNutricionalBuilder tabelaBuilder;
	
	public CadastroTabela() {
		super();
		this.tabelaBuilder = new TabelaNutricionalBuilder();
	}
	
	public TabelaNutricional cadastrar() {
		double carboidratos = ctrl.lerDouble("Carboidratos: ");
		double proteinas = ctrl.lerDouble("Proteinas: ");
		double gordurasTotais = ctrl.lerDouble("Gorduras Totais: ");
		double gordurasSaturadas = ctrl.lerDouble("Gorduras Saturadas: ");
		double fibraAlimentar = ctrl.lerDouble("Fibra Alimentar: ");
		double sodio = ctrl.lerDouble("Sodio: ");
		
		return tabelaBuilder
				.setCarboidratos(carboidratos)
				.setProteinas(proteinas)
				.setGordurasTotais(gordurasTotais)
				.setGordurasSaturadas(gordurasSaturadas)
				.setFibraAlimentar(fibraAlimentar)
				.setSodio(sodio)
				.getTabela();
	}

}
