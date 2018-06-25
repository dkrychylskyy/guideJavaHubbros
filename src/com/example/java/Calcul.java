package com.example.java;

public abstract class Calcul {
	private int resultat ;
	public abstract void calculer(int a, int b);
	
	public int getResultat() {
		return resultat;
	}
	protected void setResultat(int r) {
		resultat = r;
	}
	
	public String toString() {
		return "Le résultat de l'opération "+getClass().getTypeName()+"";
	}
}

