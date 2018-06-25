package com.example.java.interfaces;

public interface InterfaceReseau {
	public static final int VITESSE_RESEAU_1GB = 2^1000;
	public static final int VITESSE_RESEAU_100MB = 2^100;
	public static final int VITESSE_RESEAU_10MB = 2^10;

	/**
	 * Permet de traiter les informations données en paramètre
	 * Cette méthode ne peut a priori être appelée qu'une fois
	 * que l'adresse réseau de l'imprimante a été affectée
	 * @param information l'information à traiter
	 * @throws IllegalAccessException si l'adresse réseau n'est pas configurée pour cet équipement
	 */
	public void communiquerParReseauFilaire(byte[] information) throws IllegalStateException;

	/**
	 * Affecte l'adresse réseau à cet équipement.
	 *
	 * Cette méthode modifie l'état interne de l'instance
	 * pour permettre l'appel des autres méthodes de la classe
	 * @param adresse l'adresse à affecter sous forme d'un
	 * tableau de byte (pour prendre en charge IPv4 et IPv6)
	 */
	public void affecterAdresseReseau(byte[] adresse);
}
