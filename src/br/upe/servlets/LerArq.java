package br.upe.servlets;

import java.io.IOException; 
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LerArq {

	private ObjectInputStream input;
	private Path local = Paths.get("C:\\Users\\Asus\\eclipse-workspace\\JSP_projeto\\Arquivo.ser");

	public void abrirL() {

		try {
			input = new ObjectInputStream(Files.newInputStream(Paths.get("C:\\Users\\Asus\\eclipse-workspace\\JSP_projeto\\Arquivo.ser")));
		} catch (IOException io) {
			System.out.println("Erro ao abrir arquivo. Terminando.");
		}
	}

	public ArrayList<Artigo> lerL() {
		ArrayList<Artigo> listaArtigo = null;
		try {
			listaArtigo = (ArrayList<Artigo>) input.readObject();
		} catch (ClassNotFoundException c) {
			System.out.println("Classe não encontrada.");
		} catch (IOException io) {
			System.out.println("Erro.");
		}

		return listaArtigo;

	}

	public void fecharL() {
		try {
			input.close();
		} catch (IOException io) {
			System.out.println("Erro ao fechar o arquivo. Terminando.");
		}
	}
	
	
}
