package permanencia;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.*;

public class LeitorArquivo<T> {

	private FileReader reader;
	private final Gson gson;
	private final Type type;
	
	public LeitorArquivo(Class<T[]> type) {
		this.type = type;
		gson = new Gson();
	}
	
	public LeitorArquivo(String nome_arquivo, Class<T[]> type) throws FileNotFoundException {
		this(type);
		setReader(nome_arquivo);
	}
	
	public void setReader(String nome_arquivo) throws FileNotFoundException {
		reader = new FileReader(nome_arquivo);
	}
	
	public void importarPara(List<T> lista) throws Exception {
		if(lista == null) {
			throw new Exception("Lista não pode ser null!");
		}
		
		lista.addAll(Arrays.asList(gson.fromJson(reader, type)));
	}
	
}
