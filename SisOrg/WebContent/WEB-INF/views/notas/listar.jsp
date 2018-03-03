<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">




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
    height: 520px; 
    color:#87CEFF;
    font-size:30px;
    LINE-HEIGHT:40px
    
}
.footer {
position: fixed;
left: 0;
bottom: 0;
width: 100%;
background-color:white;
color: #87CEFF;
text-align: center;
font-size:20px;
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

h1{

font-size:40px;
color:lightblue;
text-align: center;
padding: 0px;

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

#customers tr:hover {background-color:  #87CEFF;}

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
	

		
	
	<div class = "center">
	
	<ul>
			<li><a href="SisOrg/">Home</a></li>
			<li class="dropdown"><a href="javascript:void(0)"
				class="dropbtn">New</a>
				<div class="dropdown-content">
					<a href="cadernos/form">Caderno</a> <a href="notas/form-cadastro">Nota</a>
				</div></li>
				<li class="dropdown"><a href="javascript:void(0)"
				class="dropbtn">List</a>
				<div class="dropdown-content">
					<a href="cadernos">Cadernos</a> <a href="notas">Notas</a>
				</div></li>
			<li style="float: right"><a href="
			logout"> Logout</a></li>


		</ul>
	
	
	
	
	<table id = "customers">

		<tr>

			<th>Nome</th>
			<th>Conteudo</th>
			<th>Remover</th>
			<th> Alterar </th>
			
		</tr>
		<jsp:useBean id="dao" class="SisOrg.daos.NotaDAO" />
	

		<c:forEach var="nota" items="${notas}">

			<tr>

				<td>${nota.nome }</td>
				<td> ${nota.conteudo}</td>
				
			    <td><a href="/SisOrg/removernotas?id=${nota.id}">X</a></td> 
						
					<td><a href="/SisOrg/notas/selecionar?id=${nota.id}">
							<i class="fa fa-bars"></i>
					</a></td>
						
	
						
							
						
			</tr>
		</c:forEach>

	</table>
	
	</div>
	<c:import url="../rodape.jsp" />

</body>
</html>