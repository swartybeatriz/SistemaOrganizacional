<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet" type="text/css" href="css/cadastro.css" />
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	  <c:import url="cabe�alho.jsp" />

	<div class="center">
		<i class="fa fa-cloud"
			style="font-size: 40px; color: lightblue; margin-left: 325px;"> </i>
		<h1>Cadastro</h1>

		<form action="">


			<label for="fname">Nome</label> <input type="text" id="fname"
				name="nome" placeholder="Your name.."> <label for="fname">Email</label>
			<input type="text" id="fname" name="email" placeholder="Your email..">

			<label for="lname">Senha</label> <input type="password" id="lname"
				name="senha" placeholder="Your password.."> <input
				type="submit" value="Cadastrar">

		</form>
	</div>
	<c:import url="rodape.jsp" />
</body>
</html>