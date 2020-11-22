package controle;

import java.util.Scanner;

public class Controlador {
	private static Controlador ctrl = null;

	private Scanner scan;
	
	private Controlador() {
		this.scan = new Scanner(System.in);
	}
	
	public static Controlador obterControlador() {
		if(ctrl == null) {
			ctrl = new Controlador();
		}
		return ctrl;
	}
	
	public String lerString(String msg) {
		String entrada = "";
		System.out.print(msg);
		entrada = scan.nextLine().trim();
		return entrada.replaceAll(" +", " ");
	}
	
	public int lerInt(String msg) {
		int x = -1;
			System.out.print(msg);
			String entrada = scan.nextLine();
			try {
				x = Integer.parseInt(entrada);
			} catch (Exception e) {
				System.out.println("Por favor insira um numero");
			}
		
		return x;
	}
	
	private void listarOpcoes(Object[] opcoes) {
		int i = 0;
		for(Object opcao : opcoes) {
			System.out.println("\t" +  ++i + ". " + opcao);
		}
	}
	
	
	
	public <T> T lerOpcao(String msg, T[] opcoes) {
		int op = 0;
		System.out.println(msg);
		listarOpcoes(opcoes);
		op = ctrl.lerInt("Escolha uma opcao: ");
		return opcoes[op-1];
	}
	
	
	
	public double lerDouble(String msg) {
		double x = -1;
			System.out.print(msg);
			String entrada = scan.nextLine().trim();
			try {
				x = Double.parseDouble(entrada);
			} catch(Exception e) {
				System.out.println("Por favor insira um numero");
			}
		
		return x;
	}
	
	public String lerDoubleString(String msg) {
		double x = -1;
			System.out.print(msg);
			String entrada = scan.nextLine().trim();
			try {
				x = Double.parseDouble(entrada);
			} catch(Exception e) {
				System.out.println("Por favor insira um numero");
			}
		
		return x+"";
	}
	

}
