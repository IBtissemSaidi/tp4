<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<jsp:useBean id="authent" class="Modele.AuthentBean" scope="session"></jsp:useBean>
<h2>Prenom:<jsp:getProperty property="prenom" name="authent"/></h2>
<h2>nom:<jsp:getProperty property="nom" name="authent"/></h2>
<% String prenom = (String) session.getAttribute("prenom");
  String nom = (String) session.getAttribute("nom");

if (prenom != null && !prenom.isEmpty() && nom != null && !nom.isEmpty()) {
    out.println("Bonjour " + prenom + " " + nom);
} else {
    out.println("Aucun utilisateur enregistré. Voici le nom et prénom de la première personne enregistrée :");
    // Obtenir les valeurs par défaut (première personne enregistrée)
    //AuthentBean autbean = new AuthentBean();
    authent.setPrenom("John");
    authent.setNom("Doe");//oudkhel li chat gbt la7dha
    out.println(authent.getPrenom() + " " + authent.getNom());
} %>
</body>
</html>