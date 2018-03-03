<%@page import="SisOrg.models.Caderno"%>
<%@page import="java.util.List"%>
<%@page import="SisOrg.daos.CadernosDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


<meta name="viewport" content="width=device-width, initial-scale=1">

<style type="text/css">

body {
background-image:
url("http://i285.photobucket.com/albums/ll53/ellee2012/Cute/0-75.png");
background-repeat: repeat;
}

.center {
background-color: white;
    margin: auto;
    width: 60%;
    border: 10px solid #87CEFF;
    padding: 40px;
    height: 517px; 
    color:#87CEFF;
    font-size:30px;
    LINE-HEIGHT:40px
    
}

 span.psw {
       display: block;
       float: none;
       font-size : 20px;
    }
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
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index: 1;
}

 .dropdown-content a {
    color: silver;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}

.dropdown-content a:hover {background-color: #87CEFF}

.dropdown:hover .dropdown-content {
    display: block;
}
#customers {
    font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#customers td, #customers th {
    border: 1px solid #ddd;
    padding: 8px;
    color: silver;
   
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color:  #FFFAFA; }

#customers th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: left;
    background-color: silver;
    color: white;
}
    


</style>


</head>
<body>
	
	
	<c:import url="../cabeçalho.jsp" />




	<div class="center">

		<ul>
			<li><a href="SisOrg/">Home</a></li>
			<li class="dropdown"><a href="javascript:void(0)"
				class="dropbtn">New</a>
				<div class="dropdown-content">
					<a href="cadernos/form">Caderno</a> <a href="notas/form-cadastro">Nota</a>
				</div></li>
			<li><a href="cadernos">Cadernos</a></li>
			<li style="float: right"><a href="
			logout"> Logout</a></li>


		</ul>
		<table id="customers">

			<tr>

				<th>Nome</th>
				<th>Descrição</th>
				<th>Remover</th>
				<th>Alterar</th>
				<th>Notas</th>
			</tr>

			<jsp:useBean id="dao" class="SisOrg.daos.CadernosDAO" />

			<c:forEach var="caderno" items="${cadernos}">

				<tr>

					<td>${caderno.nome}</td>
					<td>${caderno.descricao }</td>
					<td><a href="/SisOrg/removercadernos?id=${caderno.id}"> X</a></td>



					<td><a href="/SisOrg/cadernos/selecionar?id=${caderno.id}">
							<i class="fa fa-bars"></i>
					</a></td>

					<td><a href="/SisOrg/listar"><i class="fa fa-file"></i></a></td>



				</tr>
			</c:forEach>

		</table>

	</div>
	<c:import url="../rodape.jsp" />
</body>
</html>