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
<link rel="stylesheet" type="text/css" href="/cadastro.css" />
<title>Insert title here</title>
</head>
<body>
	<c:import url="cabeçalho.jsp" />

	<div class="center">
		<form>
			<i class="fa fa-cloud"
				style="font-size: 40px; color: lightblue; margin-left: 325px;">
			</i>

			<h1>Entrar</h1>
			<label for="fname">Email</label> <input type="text" id="fname"
				name="firstname" placeholder="Your name.."> <label
				for="lname">Senha</label> <input type="password" id="lname"
				name="lastname" placeholder="Your password.."> <input
				type="submit" value="Login"> <span class="psw">Não
				possui conta ? <a href="#"> Cadastre-se aqui</a>
			</span>
		</form>

	</div>
	<c:import url="rodape.jsp" />
</body>
</html>