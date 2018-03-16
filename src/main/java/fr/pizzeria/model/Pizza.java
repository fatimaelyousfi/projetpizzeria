package fr.pizzeria.model;

import fr.pizzeria.utils.ToString;

/**
 * classe possèdent les attributs, identifiant, code, libelle, prix et de la
 * catégorie de la pizza
 */

public class Pizza {
	@ToString
	int id;
	@ToString
	String code;
	@ToString
	String libelle;
	@ToString
	double prix;
	static int compteur = 0;
	CategoriePizza categorie; // creation de l'attribut categorie de type CategoriePizza de la classe
								// CategoriePizza

	/**
	 * Constructor
	 * 
	 * @param code
	 * @param libelle
	 * @param prix
	 * @param categorie
	 */
	public Pizza(String code, String libelle, double prix, CategoriePizza categorie) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.categorie = categorie;
		compteur++;
		id = compteur;

	}

	/**
	 * Constructor
	 * 
	 * @param id
	 * @param code
	 * @param libelle
	 * @param prix
	 * @param categorie
	 */
	public Pizza(int id, String code, String libelle, double prix, CategoriePizza categorie) {
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
		this.id = id;
		this.categorie = categorie;
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter
	 * 
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter
	 * 
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Setter
	 * 
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * Getter
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Setter
	 * 
	 * @param libelle
	 *            the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	/**
	 * Getter
	 * 
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}

	/**
	 * Setter
	 * 
	 * @param prix
	 *            the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * Getter
	 * 
	 * @return the compteur
	 */
	public static int getCompteur() {
		return compteur;
	}

	/**
	 * Setter
	 * 
	 * @param compteur
	 *            the compteur to set
	 */
	public static void setCompteur(int compteur) {
		Pizza.compteur = compteur;
	}

	/**
	 * Getter
	 * 
	 * @return the categorie
	 */
	public CategoriePizza getCategorie() {
		return categorie;
	}

	/**
	 * Setter
	 * 
	 * @param categorie
	 *            the categorie to set
	 */
	public void setCategorie(CategoriePizza categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return code + " -> " + libelle + " ( " + prix + "Euro )" + categorie.toString();// ajout de la categorie de
																						// Pizza
	}

}
