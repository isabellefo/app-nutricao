package nutri;

import java.util.HashMap;
import java.util.Map;

public class ReceitaBuilder {
  
  private Receita receita;
  private Map<Ingrediente, Integer> ingredientes;

  public ReceitaBuilder() {
    receita = new Receita();
    ingredientes = new HashMap<Ingrediente, Integer>();
  }

  public ReceitaBuilder nome(String nome) {
    receita.setNome(nome);
    return this;
  }

  public ReceitaBuilder ingrediente(Ingrediente ingrediente, int quantidade) {
    if(ingredientes.containsKey(ingrediente))
      quantidade += ingredientes.get(ingrediente);

    ingredientes.put(ingrediente, quantidade);

    return this;
  }

  public ReceitaBuilder tempoPreparo(String tempo) {
    receita.setTempo(tempo);
    return this;
  }

  public ReceitaBuilder modoPreparo(String preparo) {
    receita.setPreparo(preparo);
    return this;
  }

  public ReceitaBuilder resetar() {
    receita = new Receita();
    ingredientes = new HashMap<Ingrediente, Integer>();
    return this;
  }
  
  public Receita obterReceita() {
    receita.setIngredientes(ingredientes);
    var receita_final = receita;
    this.resetar();

    return receita_final;
  }

}
