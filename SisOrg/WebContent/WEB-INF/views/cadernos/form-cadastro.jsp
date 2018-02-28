<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/cadastro.css" />
<title>Insert title here</title>
</head>
<body>


	<c:import url="cabeçalho.jsp" />
	<div class="center">
		<i class="fa fa-cloud"
			style="font-size: 40px; color: lightblue; margin-left: 325px;"> </i>
		<h1>Crie um novo caderno</h1>

		<form action="/SisOrg/cadernos" method="post">
			<label for="fname">Nome</label> <input type="text" id="fname"
				name="nome" placeholder=" name.."> <input type="submit"
				value="Salvar">
		</form>
	</div>
	<c:import url="rodape.jsp" />



</body>
</html>