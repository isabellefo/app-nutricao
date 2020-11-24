package nutri;

import com.google.gson.annotations.SerializedName;

public class TabelaNutricional {

	private double carboidratos;
	private double proteinas;
	private double sodio;

	@SerializedName("gorduras_totais")
	private double gordurasTotais;

	@SerializedName("gorduras_saturadas")
	private double gordurasSaturadas;

	@SerializedName("fibra_alimentar")
	private double fibraAlimentar;

	public TabelaNutricional(double carboidratos, double proteinas, double gordurasTotais, double gordurasSaturadas,
			double fibraAlimentar, double sodio) {
		super();
		this.carboidratos = carboidratos;
		this.proteinas = proteinas;
		this.gordurasTotais = gordurasTotais;
		this.gordurasSaturadas = gordurasSaturadas;
		this.fibraAlimentar = fibraAlimentar;
		this.sodio = sodio;
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
	
	public String toString() {
		return
		"Carboidratos: "       + carboidratos      + "g" + "\n" +
		"Proteinas: "          + proteinas         + "g" + "\n" +
		"Gorduras Totais: "    + gordurasTotais    + "g" + "\n" +
		"Gorduras Saturadas: " + gordurasSaturadas + "g" + "\n" +
		"Fibra Alimentar: "    + fibraAlimentar    + "g" + "\n" +
		"Sodio: "              + sodio             + "mg" + "\n";
	}

}
