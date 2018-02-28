<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/SisOrg/notas" method="post">
		<div>
			<label>Nome: </label> <input type="text" name="nome" />
		</div>

		<div>
			<label>Caderno: </label> 
			<select name="caderno.id">
				<c:forEach var="caderno" items="${cadernos}">
					<option value="${caderno.id}">${caderno.nome}</option>
				</c:forEach>
			</select>
		</div>

		<div>
			<label>Conteudo: </label> <input type="text" name="conteudo" />
		</div>
<div>
		<button type="submit">Adicionar</button>
		</div>

	</form>
</body>
</html>