package com.example.java.voyage;

public class TrousseDeToilette extends Trousse{
	int autreEntier ;
	String autreChaine ;
	public TrousseDeToilette() {
		autreChaine = publique;
		autreEntier = protege ;
		autreEntier = defaut;
		/*
		 * La classe TrousseDeToilette extends la classe Trousse
		 * elle prend tous les attributs de son parrent avec ses modificateurs d'acces
		 * Pour avoir la valeur de "prive" il faut utiliser le methode getPrive()
		 */
		//		autreEntier = prive ;
		autreEntier = getPrive();
	}
}
