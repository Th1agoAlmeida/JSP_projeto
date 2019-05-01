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

	public Formulario() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<title>Formulário</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Formulário de Cadastro</h1>");
		String nome = (String) request.getParameter("nome");
		String sobrenome = (String) request.getParameter("sobrenome");

	}

}
