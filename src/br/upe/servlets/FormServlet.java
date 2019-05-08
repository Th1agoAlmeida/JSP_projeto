package br.upe.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/Form")
public class FormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String tituloArtigo = req.getParameter("nomeArtigo");
		String autor = req.getParameter("autor");
		String eventoJornal = req.getParameter("evento");
		String ano = req.getParameter("ano");
		String paginas = req.getParameter("paginas");
		String doi = req.getParameter("doi");
		String issn = req.getParameter("issn");
		PrintWriter p = resp.getWriter();

		if (tituloArtigo == "" || autor == "" || eventoJornal == "" || ano == "" || paginas == "" || doi == ""
				|| issn == "") {
			p.print("<h1>Existem campos em branco. Você deve preenche-los.</h1>");
		} else {
			Artigo artigo = new Artigo(tituloArtigo, autor, eventoJornal, ano, paginas, doi, issn);
			AdicionarArq a = new AdicionarArq();
			a.gravar(artigo);

			resp.sendRedirect("Teste2.jsp");
		}
	}

}
