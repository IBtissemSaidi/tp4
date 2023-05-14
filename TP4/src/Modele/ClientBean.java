package Modele;

public class ClientBean {
private String nom;
private String prenom;
private String adresseliv;
private String tel;
private String email;

public ClientBean() {
	
}
public ClientBean(String nom,String prenom,String adresseliv, int tel,String email) {
	setNom("");
	setPrenom("");
	setAdresseliv("");
	setTel("");
	setEmail("");
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getAdresseliv() {
	return adresseliv;
}

public void setAdresseliv(String adresseliv) {
	this.adresseliv = adresseliv;
}

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}



}
