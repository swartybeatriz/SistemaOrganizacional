<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="CSS/style.css" />
<title>Insert title here</title>
</head>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

          <c:import url="cabeçalho.jsp" />
<div class = "center">
<i class="fa fa-cloud" style="font-size:40px;color:lightblue;margin-left: 210px; "> Nova anotação</i>
  
   <form >
    <label for="fname">Nome</label>
    <input type="text" id="fname" name="firstname" placeholder="Your name..">
    
    <label for="lname">Caderno</label>
    <input type="password" id="lname" name="lastname" placeholder="Your password..">

    <label for="lname">Conteúdo</label>
     <textarea name="message" style="width:600px; height:150px;"></textarea>
  <br>



  
    <input type="submit" value="Login">
    </form>
    </div>
    <c:import url="rodape.jsp" />
</body>
</html>