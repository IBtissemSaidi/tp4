<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>random</title>
</head>
<body>
<jsp:useBean id="nombrealea" class="Modele.NumberBean" scope="session"></jsp:useBean>
<!--  <p>Random Number est:--><%//request.getAttribute("randomNumber") %>
<!--<h1>Nombre Aléatoire</h1>
    <p>Nombre aléatoire généré : ${randomNumberBean.randomNumber}</p>-->
    <h3>le nombre aleatoire est <%= request.getAttribute("x") %></h3>
    
</body>
</html>