package permanencia;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExportadorArquivo {
	private FileWriter writer;
	private final Gson gson;

	public ExportadorArquivo() {
		gson = new GsonBuilder().setPrettyPrinting().create();
	}
	
	public ExportadorArquivo(String nome_arquivo) throws IOException {
		this();
		setWriter(nome_arquivo);
	}
	
	public void setWriter(String nome_arquivo) throws IOException {
		writer = new FileWriter(nome_arquivo);
	}
	
	public void exportarDe(Object obj) throws IOException {
		writer.write(gson.toJson(obj));
		writer.flush();
	}

}
