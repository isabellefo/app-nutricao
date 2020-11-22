package nutri;

public class TabelaNutricionalBuilder {
	private TabelaNutricional tabela;
	
	public TabelaNutricionalBuilder() {
		reset();
	}
	
	private TabelaNutricional reset() {
		TabelaNutricional tabela  = this.tabela;
		this.tabela = new TabelaNutricional();
		return tabela;
	}
	
	public TabelaNutricionalBuilder setCarboidratos(double carboidratos) {
		tabela.setCarboidratos(carboidratos);
		return this;
	}
	
	public TabelaNutricionalBuilder setProteinas(double proteinas) {
		tabela.setProteinas(proteinas);
		return this;
	}
	
	public TabelaNutricionalBuilder setGordurasTotais(double gordurasTotais) {
		tabela.setGordurasTotais(gordurasTotais);
		return this;
	}
	
	public TabelaNutricionalBuilder setGordurasSaturadas(double gordurasSaturadas) {
		tabela.setGordurasSaturadas(gordurasSaturadas);
		return this;
	}
	
	public TabelaNutricionalBuilder setFibraAlimentar(double fibraAlimentar) {
		tabela.setFibraAlimentar(fibraAlimentar);
		return this;
	}
	
	public TabelaNutricionalBuilder setSodio(double sodio) {
		tabela.setSodio(sodio);
		return this;
	}
	
	public TabelaNutricional getTabela() {
		return reset();
	}
}
