package database;

import java.util.ArrayList;
import java.util.List;

import nutri.Alimento;
import nutri.Combinacao;
import nutri.Receita;

public class Database {
	private static Database db;
	
	private List<Alimento> alimentos;
	private List<Receita> receitas;
	private List<Combinacao> combinacoes;
	
	private Database() {
		this.alimentos  = new ArrayList<Alimento>();
		this.receitas = new ArrayList<Receita>();
		this.combinacoes = new ArrayList<Combinacao>();
	}
	

	public static Database getDatabase() {
		if(db == null) {
			db = new Database();
		}
		return db;
	}

	public List<Alimento> getAlimentos() {
		return alimentos;
	}
	
	public Alimento[]  getAlimentosArray() {
		System.out.println(alimentos.size());
		System.out.println(alimentos);
		Alimento[] alimentos = new Alimento[this.alimentos.size()];
		alimentos = this.alimentos.toArray(alimentos);
		return alimentos;
	}

	public List<Receita> getReceitas() {
		return receitas;
	}

	public List<Combinacao> getCombinacoes() {
		return combinacoes;
	}

}
