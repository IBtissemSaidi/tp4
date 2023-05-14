<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ma page de livraison</title>
</head>
<body>
<jsp:useBean id="client" class="Modele.ClientBean" scope="session"></jsp:useBean>
<h2>Nom:<jsp:getProperty property="nom" name="client"/></h2>
<h2>Prenom:<jsp:getProperty property="prenom" name="client"/></h2>
<h2>adresseliv:<jsp:getProperty property="adresseliv" name="client"/></h2>
<h2>tel:<jsp:getProperty property="tel" name="client"/></h2>
<h2>email:<jsp:getProperty property="email" name="client"/></h2>

</body>
</html>