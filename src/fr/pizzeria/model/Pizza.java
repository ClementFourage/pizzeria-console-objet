package fr.pizzeria.model;

public class Pizza {

	public int id;
	public String code;
	public String libelle;
	public double prix;

	public Pizza (String nvCode, String nvLibelle, double nvPrix){
		code = nvCode;
		libelle = nvLibelle;
		prix = nvPrix;
	}
	
	public Pizza(int nvId, String nvCode, String nvLibelle, double nvPrix) {
		id = nvId;
		code = nvCode;
		libelle = nvLibelle;
		prix = nvPrix;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}


}
