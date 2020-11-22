package menu;


import cadastros.CadastroAlimento;
import database.Database;

import cadastros.ReceitaBuilder;

import nutri.Alimento;

public class App {

	static Database db = Database.getDatabase();
	static CadastroAlimento cadastro = new CadastroAlimento(db.getAlimentos());
	
	public static void main(String[] args) {

		var receita_builder = new ReceitaBuilder();

		var cenoura = new Alimento("Cenoura");

		var receita = receita_builder
			.nome("Bolo de Cenoura")
			.ingrediente(cenoura, 1)
			.ingrediente(cenoura, 1)
			.ingrediente(cenoura, 1)
			.ingrediente(new Alimento("Ovo"), 4)
			.ingrediente(new Alimento("Óleo"), 180) // ml
			.ingrediente(new Alimento("Açúcar"), 360) // g
			.ingrediente(new Alimento("Fermento em pó"), 20) // g
			.ingrediente(new Alimento("Leite Condensado"), 395) // g
			.ingrediente(new Alimento("Manteiga"), 20) // g
			.ingrediente(new Alimento("Chocolate em pó"), 180) // g
			.ingrediente(new Alimento("Chocolate granulado"), 180) // g
			.tempoPreparo("40 minutos")
			.modoPreparo(
				"Massa:\n" +
				"1  Retire a casca das cenouras, corte-as em pedaços, lave-as e cozinhe-as cobertas com\n" +
				"   água. Escorra a água, e deixe que as cenouras esfriem um pouco.\n" +
				"2  Em um liquidificador, bata as cenouras cozidas, os ovos e o óleo.\n" +
				"3  Despeje a mistura em um recipiente e misture o açúcar e a farinha de trigo peneirada\n" +
				"   com o fermento.\n" +
				"4  Coloque em uma fôrma retangular (20 x 30 cm) untada, e leve ao forno médio (180°C),\n" +
				"   preaquecido, por 40 minutos. Enquanto isso, prepare a cobertura de brigadeiro.\n" +
				"Cobertura:\n" +
				"5  Em uma panela coloque o Leite MOÇA®, o Chocolate em Pó DOIS FRADES e a manteiga e leve\n" +
				"   ao fogo baixo, mexendo sempre, até começar a desprender da panela.\n" +
				"6  Despeje ainda quente sobre o bolo, distribua o chocolate granulado e deixe esfriar.\n")
			.obterReceita();

		System.out.println(receita);
	}

}
