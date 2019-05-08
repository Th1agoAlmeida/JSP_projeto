package br.upe.servlets;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class AdicionarArq {

	private ObjectOutputStream out;
	private ArrayList<Artigo> listaArtigo = new ArrayList<Artigo>();
	private Path local = Paths.get("C:\\Users\\Asus\\eclipse-workspace\\JSP_projeto\\Arquivo.ser");

	public void abrir() {
		try {
			out = new ObjectOutputStream(Files.newOutputStream(Paths.get("C:\\Users\\Asus\\eclipse-workspace\\JSP_projeto\\Arquivo.ser")));
		} catch (IOException io) {
			System.out.println("Erro ao abrir Arquivo. Terminando.");
		}
	}

	public void gravar(Artigo artigo) {
		try {
			if (Files.size(local) > 0) {
				LerArq ler = new LerArq();
				ler.abrirL();// Abrindo leitura
				listaArtigo = ler.lerL();
				ler.fecharL();// Fechando leitura
				
				listaArtigo.add(artigo);// adiciona o novo artigo ao ArrayList
				
				abrir();// Abrindo gravação
				out.writeObject(listaArtigo);
				fechar();// Fechando gravação
			} else {
				abrir();
				listaArtigo.add(artigo);
				out.writeObject(listaArtigo);
				fechar();
			}
		} catch (IOException io) {
			System.out.println("Erro ao gravar no arquivo.");
		}
	}

	public void fechar() {
		try {
			out.close();
		} catch (IOException io) {
			System.out.println("Erro ao fechar o Arquivo.");
		}
	}
}
