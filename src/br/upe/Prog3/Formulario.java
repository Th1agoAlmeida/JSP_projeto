package br.upe.Prog3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Formulario")
public class Formulario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse response) {
		String tituloArtigo = req.getParameter("nomeArtigo");
		String autor = req.getParameter("nomeAutor");
		String eventoJournal = req.getParameter("evento");
		String ano = req.getParameter("ano");
		String paginas = req.getParameter("paginas");
		String doi = req.getParameter("doi");
		String issn = req.getParameter("issn"); 

		Artigo artigo = new Artigo(tituloArtigo, autor, eventoJournal, ano, paginas, doi, issn);
		adicionarArquivo a = new adicionarArquivo();
		a.gravar(artigo); 


	}

}
