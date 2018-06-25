package com.example.java.interfaces;

public class Imprimante implements InterfaceReseau, InterfaceUSB {
	// Ici on utilise une constante d�finie dans l'interface
	int vitesse = VITESSE_RESEAU_100MB;
	private String nom;

	public Imprimante(int vitesse, String nom) {
		super();
		this.vitesse = vitesse;
		this.nom = nom;
	}

	@Override
	public void communiquerParPortUSB(byte[] information) {
		System.out.println("Donn�es re�ues par PortUSB("+nom+")");
		System.out.println("USB:"+new String(information));
		System.out.println("Fin de la r�ception");

	}

	@Override
	public void communiquerParReseauFilaire(byte[] information) throws IllegalStateException {
		System.out.println("Donn�es re�ues par ReseauFilaire("+nom+")");
		System.out.println("RES: "+new String(information));
		for (int i = 0; i < information.length; i++) {
			System.out.println(information[i]);
		}
		System.out.println("Fin de la r�ception");

	}

	@Override
	public void affecterAdresseReseau(byte[] adresse) {
		System.out.println("Adresse reseau est affecte("+nom+")");
		System.out.println(new String(adresse));
		for (int i = 0; i < adresse.length; i++) {
			System.out.println(adresse[i]);
		}
		System.out.println("Fin de la r�xception");

	}

}
