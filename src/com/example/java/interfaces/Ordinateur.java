package com.example.java.interfaces;

public class Ordinateur {
	public void envoyerDonneesUSB(InterfaceUSB iu, byte[] information) {
		iu.communiquerParPortUSB(information);
	};

	public void envoyerDonneesReseau(InterfaceReseau ir, byte[] information) {
		ir.communiquerParReseauFilaire(information);
	};

	public void affecter(InterfaceReseau ir, byte[] information) {
		ir.affecterAdresseReseau(information);
	}
}
