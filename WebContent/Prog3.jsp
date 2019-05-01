<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
		<title>Formulário</title>
		<link rel="stylesheet" href="NewFile.css">
	</head>
	<body>
		<header>
			<h1>Formulário para Cadastro de Artigos</h1>
		</header>
		<section>
			<form action="Form" method="Post">
				<label>Título do Artigo:</label><input type="text" name="nomeArtigo" />
				<label>Nome dos Autores:</label><input type="text" name="autores" />
				<label>Evento/Jornal:</label><input type="text" name="evento" />
				<label>Ano:</label><input type="text" name="ano" />
				<label>Localização das páginas:</label><input type="text" name="paginas" />
				<label>DOI:</label><input type="text" name="doi" />
				<label>ISSN:</label><input type="text" name="issn" />
				<input type="submit" value="Enviar" class="enviar" style="width: 270px; height: 35px"/>
			</form>
		</section>
	</body>
</html> 