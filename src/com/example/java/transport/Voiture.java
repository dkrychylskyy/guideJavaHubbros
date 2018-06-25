package com.example.java.transport;

import com.example.java.voyage.Trousse;

public class Voiture extends Trousse{
	/*
	 * Le constructeur de Trousse est visible que dans son paquet.
	 * Donc on ne peut pas l'utuliser pour cree nouveau instance de la classe Trousse
	 */
	Trousse trousse = new Trousse();

	int entier;
	String chaine;

	Voiture(){
		chaine = trousse.publique;
		entier = trousse.getProtege();
		entier = trousse.getDefaut();
		//		entier = trousse.defaut;
		//		entier = trousse.prive ;
		entier = trousse.getPrive();
	}
}
