package br.upe.servlets;

import java.io.Serializable;


public class Artigo implements Serializable {
	private String tituloArtigo;
	private String autor;
	private String eventoJornal;
	private String ano;
	private String paginas;
	private String doi;
	private String issn;
	
	public Artigo(String tituloArtigo,String autor, String eventoJornal, String ano,
			String paginas, String doi, String issn) {
		this.tituloArtigo = tituloArtigo;
		this.autor = autor;
		this.eventoJornal = eventoJornal;
		this.ano = ano;
		this.paginas = paginas;
		this.doi = doi;
		this.issn = issn;
	}

	public String getTituloArtigo() {
		return tituloArtigo;
	}

	public void setTituloArtigo(String tituloArtigo) {
		this.tituloArtigo = tituloArtigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEventoJornal() {
		return eventoJornal;
	}

	public void setEventoJornal(String eventoJornal) {
		this.eventoJornal = eventoJornal;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getPaginas() {
		return paginas;
	}

	public void setPaginas(String paginas) {
		this.paginas = paginas;
	}

	public String getDoi() {
		return doi;
	}

	public void setDoi(String doi) {
		this.doi = doi;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}
}
