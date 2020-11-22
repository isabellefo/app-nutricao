package cadastros;

import controle.Controlador;

public abstract class Cadastro<T> {
	protected Controlador ctrl = new Controlador();
	
	protected Cadastro() {
		this.ctrl = Controlador.obterControlador();
	}
	
	public abstract T cadastrar();

}
