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
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="dao" class="SisOrg.daos.CadernosDAO" />
<table>
		<tr>
			<th>ID</th>
			<th>Nome</th>
		</tr>

		<c:forEach var="caderno" items="${cadernos}">

			<tr>
				<td>${caderno.id}</td>
				<td>${caderno.nome }</td>
			
	<td><a href="/SisOrg/removercadernos?id=${caderno.id}"> Remover</a>
			</td>

			
			</tr>
			</c:forEach>
		
	</table>
</body>
</html>