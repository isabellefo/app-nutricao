package calculo;

import java.text.DecimalFormat;

import controle.Controlador;

public class IMC {
	
	public void calculaImc(){
		Controlador ctrl = new Controlador();
		
		 
		DecimalFormat df = new DecimalFormat("####.00");
		double altura = ctrl.lerDouble("Altura para o calculo: ");
		double peso = ctrl.lerDouble("Peso para o calculo: ");;
		
		double indice = peso / (altura*altura);
		
		System.out.println("Indice de massa corporal = " + df.format(indice));
	}

}
