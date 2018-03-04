<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<style type="text/css">
.header {
background-color: white
;
padding: 30px;
margin-right: -10px;
margin-left: -10px;
margin-top: -20px;
text-align: center;
color : #87CEFF;
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
    color:#87CEFF;
    font-size:30px;
    
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
.form{
margin: auto;
width: 20%;
padding: 40px;
height: 545px;

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

    
}




</style>
<title>Cadastrar Nota</title>
</head>
<body>

	<c:import url="../cabeçalho.jsp" />
	<form action="/SisOrg/notas" method="post">
		
		<div class="center">
		
		<div>
			<label>Nome: </label> <input type="text" name="nome"  placeholder=" name.."/>
		</div>

	<label>Caderno: </label> <select name="caderno.id">
				
				<c:forEach var="caderno" items="${cadernos}">
					<option value="${caderno.id}">${caderno.nome}</option>
				</c:forEach>
			</select>
		<div>
			<label>Conteudo: </label> <textarea name="conteudo" style="width: 600px; height: 200px;"></textarea>
		</div>
		<div>
			<br> <input type="submit" value="Adicionar">
		</div>
		</div>

	</form>
		<c:import url="../rodape.jsp" />
</body>
</html>