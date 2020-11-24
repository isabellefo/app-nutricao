package menu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import nutri.Alimento;
import nutri.Grupo;
import nutri.TabelaNutricional;
import permanencia.ExportadorArquivo;
import permanencia.LeitorArquivo;

public class App {

	public static void main(String[] args) throws Exception {

		/*
		
		var tabela = new TabelaNutricional(1, 2, 3,	4, 5,	6);
		
		List<Alimento> a = new ArrayList<>();
		a.add(new Alimento("Teste", Grupo.G1, tabela));
		a.add(new Alimento("Outro Alimento", Grupo.G2, tabela));
		a.add(new Alimento("Cenoura", Grupo.G3, tabela));
		
		var exportador = new ExportadorArquivo("alimentos.json");
		exportador.exportarDe(a);
		
		*/
		
		var alimentos = new ArrayList<Alimento>();
		var leitor = new LeitorArquivo<Alimento>("alimentos.json", Alimento[].class);
		leitor.importarPara(alimentos);
		
		alimentos.forEach(a -> System.out.println(a.getDescricao()));
		
	}

}
