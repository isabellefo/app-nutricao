package calculo;

public class IMC {
	
	public double calculaImc(){
		
		double altura = 0;
		double peso = 0;
		
		double indice = peso / (altura*altura);
		
		return indice;
	}

}
