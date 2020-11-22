package nutri;

import java.util.List;

public class TabelaNutricional {
	
	private double carboidratos;
	private double proteinas;
	private double gordurasTotais;
	private double gordurasSaturadas;
	private double fibraAlimentar;
	private double sodio;

	public TabelaNutricional() {
		this.carboidratos = 0;
		this.proteinas = 0;
		this.gordurasTotais = 0;
		this.gordurasSaturadas = 0;
		this.fibraAlimentar = 0;
		this.sodio = 0;
	}

	public double getCarboidratos() {
		return carboidratos;
	}
	
	public void setCarboidratos(double carboidratos) {
		this.carboidratos = carboidratos;
	}
	
	public double getProteinas() {
		return proteinas;
	}
	
	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}
	
	public double getGordurasTotais() {
		return gordurasTotais;
	}
	
	public void setGordurasTotais(double gordurasTotais) {
		this.gordurasTotais = gordurasTotais;
	}
	
	public double getGordurasSaturadas() {
		return gordurasSaturadas;
	}
	
	public void setGordurasSaturadas(double gordurasSaturadas) {
		this.gordurasSaturadas = gordurasSaturadas;
	}
	
	public double getFibraAlimentar() {
		return fibraAlimentar;
	}
	
	public void setFibraAlimentar(double fibraAlimentar) {
		this.fibraAlimentar = fibraAlimentar;
	}
	
	public double getSodio() {
		return sodio;
	}
	
	public void setSodio(double sodio) {
		this.sodio = sodio;
	}
	
	protected static TabelaNutricional somarTabelas(List<TabelaNutricional> tabelas) {
		double carboidratos = 0;
		double proteinas = 0;
		double gordurasTotais = 0;
		double gordurasSaturadas = 0;
		double fibraAlimentar = 0;
		double sodio = 0;
		
		for(TabelaNutricional tabela : tabelas) {
			carboidratos  += tabela.getCarboidratos();
			proteinas += tabela.getProteinas();
			gordurasTotais += tabela.getGordurasTotais();
			gordurasSaturadas += tabela.getGordurasSaturadas();
			fibraAlimentar += tabela.getFibraAlimentar();
		}
		
		return new TabelaNutricionalBuilder()
				.setCarboidratos(carboidratos)
				.setProteinas(proteinas)
				.setGordurasTotais(gordurasTotais)
				.setGordurasSaturadas(gordurasSaturadas)
				.setFibraAlimentar(fibraAlimentar)
				.setSodio(sodio)
				.getTabela();
	}
	public String toString() {
		return "Carboidratos:"+carboidratos + " g" + "\n" +
		"Proteinas:"+proteinas + " g" + "\n" +	
		"Gorduras Totais:"+gordurasTotais + " g" + "\n" +
		"Gorduras Saturadas:"+gordurasSaturadas + " g" + "\n" +
		"Fibra Alimentar:"+fibraAlimentar + " g" + "\n" +
		"Sodio:"+sodio + " mg" + "\n";
	}

}
