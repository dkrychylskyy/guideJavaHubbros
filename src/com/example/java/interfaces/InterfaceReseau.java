package com.example.java.interfaces;

public interface InterfaceReseau {
	public static final int VITESSE_RESEAU_1GB = 2^1000;
	public static final int VITESSE_RESEAU_100MB = 2^100;
	public static final int VITESSE_RESEAU_10MB = 2^10;

	/**
	 * Permet de traiter les informations donn�es en param�tre
	 * Cette m�thode ne peut a priori �tre appel�e qu'une fois
	 * que l'adresse r�seau de l'imprimante a �t� affect�e
	 * @param information l'information � traiter
	 * @throws IllegalAccessException si l'adresse r�seau n'est pas configur�e pour cet �quipement
	 */
	public void communiquerParReseauFilaire(byte[] information) throws IllegalStateException;

	/**
	 * Affecte l'adresse r�seau � cet �quipement.
	 *
	 * Cette m�thode modifie l'�tat interne de l'instance
	 * pour permettre l'appel des autres m�thodes de la classe
	 * @param adresse l'adresse � affecter sous forme d'un
	 * tableau de byte (pour prendre en charge IPv4 et IPv6)
	 */
	public void affecterAdresseReseau(byte[] adresse);
}
