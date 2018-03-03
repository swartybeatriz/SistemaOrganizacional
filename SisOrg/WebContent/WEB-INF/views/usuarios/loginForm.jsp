<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">


<title>Insert title here</title>

<style>
input[type=submit] {
	width: 30%;
	background-color: #87CEFF;
	color: white;
	padding: 14px 20px;
	margin: 10px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=text]:focus {
	background-color: lightblue;
}

.form {
	margin: auto;
	width: 20%;
	padding: 40px;
	height: 545px;
}

h1 {
	font-size: 40px;
	color: lightblue;
	text-align: center;
	padding: 0px;
}

span.psw {
	display: block;
	float: none;
	font-size: 20px;
}

body {
	background-image:
		url("http://i285.photobucket.com/albums/ll53/ellee2012/Cute/0-75.png");
	background-repeat: repeat;
}

.center {
	background-color: white;
	margin: auto;
	width: 40%;
	border: 10px solid #87CEFF;
	padding: 40px;
	height: 518px;
	color: #87CEFF;
	font-size: 30px;
}

input[type=submit] {
	width: 30%;
	background-color: #87CEFF;
	color: white;
	padding: 14px 20px;
	margin: 10px 0;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=text], select {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type=text]:focus {
	background-color: lightblue;
}

input[type=password]:focus {
	background-color: lightblue;
}

h1 {
	font-size: 40px;
	color: lightblue;
	text-align: center;
	padding: 0px;
}

span.psw {
	display: block;
	float: none;
	font-size: 20px;
}
</style>
</head>
<body>
	<c:import url="cabeçalho.jsp" />

	<div class="center">

		<form action="efetuaLogin" method="post">
			<i class="fa fa-cloud"
				style="font-size: 40px; color: lightblue; margin-left: 325px;">
			</i>

			<h1>Entrar</h1>
			
			<label for="fname">Email</label> <input type="text" id="fname"
				name="email" placeholder="Your name.."> 
			<label for="lname">Senha</label> <input type="password" id="lname" name="senha"
				placeholder="Your password.."> 
				
				<input type="submit" value="Login"> 
				<span class="psw">Não possui conta ? <a
				href="usuarios/form-cadastro"> Cadastre-se aqui</a>
			</span>
		</form>

	</div>

	<c:import url="rodape.jsp" />


	</form>
</body>
</html>