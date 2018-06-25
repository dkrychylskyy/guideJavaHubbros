package com.example.java.interfaces.hierarchisable;

public class Personne implements Hierarchisable{
	private String nom;
	private String prenom;

	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 *
	 * @return String
	 */
	public String getNom() {
		return nom;
	}

	/**
	 *
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 *
	 * @return String
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 *
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public boolean estPlusGrandQue(Object O) throws IllegalArgumentException{
		Class oClasse = O.getClass();
		if (!oClasse.isInstance(this)) {
			throw new IllegalArgumentException();
		}

		String oNom = ((Personne) O).getNom();
		if (this.nom.compareTo(oNom) < 0) {
			return true;
		}
		return false;
	}

}
