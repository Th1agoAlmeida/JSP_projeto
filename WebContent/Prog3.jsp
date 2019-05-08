<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="utf-8">
		<title>Formulário de cadastro de artigos</title>
		<link rel="stylesheet" href="NewFile.css">
	</head>
	
	<body>
		<section>
			<form action="Form" method="Post">
				<label>Título do Artigo:</label><input type="text" name="nomeArtigo" style="width: 440px"/>
				<label>Nome dos Autores:</label><input type="text" name="autores" style="width: 440px"/>
				<label>Evento/Jornal:</label><input type="text" name="evento" style="width: 440px"/>
				<label>Ano:</label><input type="text" name="ano" style="width: 440px"/>
				<label>Localização das páginas:</label><input type="text" name="paginas" style="width: 440px"/>
				<label>DOI:</label><input type="text" name="doi" style="width: 440px"/>
				<label>ISSN:</label><input type="text" name="issn" style="width: 440px"/>
				<input type="submit" value="Enviar" class="enviar" style="width: 150px; height: 30px"/>
			</form>
		</section>
	</body>
</html> 