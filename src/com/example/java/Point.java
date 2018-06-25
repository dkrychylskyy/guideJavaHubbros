package com.example.java;

public class Point {
	private String nom;
	private int abscisse;
	private int ordonnee;

	public Point(String nom, int abscisse, int ordonnee) {
		super();
		this.nom = nom;
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	public double distance(Point autrePoint) {

		return Math.sqrt(Math.pow((abscisse - autrePoint.abscisse), 2) +
				Math.pow((ordonnee - autrePoint.ordonnee),2));
	}

	public void translater(int deplacementHorizontal, int deplacementVertical) {
		abscisse += deplacementHorizontal;
		ordonnee += deplacementVertical;
	}

	@Override
	public String toString() {
		return "Point("+nom+")["+abscisse+", "+ordonnee+"]";
	}

	public String getNom() {
		return nom;
	}

	public int getAbscisse() {
		return abscisse;
	}

	public int getOrdonnee() {
		return ordonnee;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


}
