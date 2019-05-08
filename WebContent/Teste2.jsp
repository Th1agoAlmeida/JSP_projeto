<%@page import="br.upe.servlets.Artigo"%>
<%@page import="br.upe.servlets.LerArq"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collections"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
		<title>Tabela</title>
		<link rel="stylesheet" href="Teste1.css">
	</head>
	<body>
		<% LerArq l = new LerArq();
			ArrayList<Artigo> listaArtigo = new ArrayList<Artigo>();
			l.abrirL();
			listaArtigo = (ArrayList<Artigo>) l.lerL();
			l.fecharL();
			Collections.shuffle(listaArtigo);
			
		%>
		<div>
			<a href="Prog3.jsp">Para adicionar outro artigo clique aqui</a>
		</div>
		<div>
			
			<table>
			<tr>
				<th>Ordem</th>
				<th>Título de Artigo</th>
			</tr>
			<% 	
			for (int i = 0; i < listaArtigo.size(); i++) {	
			%>
			<tr>
				<td> <% out.print(i + 1); %> </td>
				<td><%  out.print(listaArtigo.get(i).getTituloArtigo()); %></td>	
			</tr>
			<% }%>
			</table>
		</div>	
	</body>
</html>