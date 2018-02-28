<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="CSS/style.css" />


<style type="text/css">
ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #CAE1FF;
	margin-right: -40px;
	margin-left: -40px;
	margin-top: -40px;
}

li {
	float: left;
}

li a, .dropbtn {
	display: inline-block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
	background-color: #87CEFF;
}

li.dropdown {
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: white;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: silver;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
	text-align: left;
}

.dropdown-content a:hover {
	background-color: #87CEFF
}

.dropdown:hover .dropdown-content {
	display: block;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Navegação</title>
</head>
<body>

	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

          <c:import url="cabeçalho.jsp" />

	<div class="center">

	<div class = "ul">
	<div class = "li">
		<ul>
			<li><a href="#home">Home</a></li>
			<li class="dropdown"><a href="javascript:void(0)"
				class="dropbtn">New</a>
				<div class="dropdown-content">
					<a href="#">Caderno</a> <a href="#">Nota</a> <a href="#">Link 3</a>
				</div></li>
			<li><a href="#news">Cadernos</a></li>
			<li style="float: right"><a href="#about">Conta</a></li>


		</ul>
	</div>
	</div>
	</div>

	<c:import url="rodape.jsp" />
</body>
</html>