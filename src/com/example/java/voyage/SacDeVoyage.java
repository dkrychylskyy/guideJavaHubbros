package com.example.java.voyage;

public class SacDeVoyage {
	Trousse trousse = new Trousse();
	int entier;
	String chaine;

	SacDeVoyage(){
		chaine = trousse.publique;
		entier = trousse.protege;
		entier = trousse.getProtege();
		entier = trousse.defaut;
		//		entier = trousse.prive ; L'attribut est prive�, donc l'acces que par accesseurs
		entier = trousse.getPrive();
	}
}
