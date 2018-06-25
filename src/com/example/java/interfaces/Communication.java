package com.example.java.interfaces;

public class Communication {
	public static void main(String[] args) {
		Ordinateur ordi = new Ordinateur();
		byte[] donnees = "Bonjour".getBytes();
		ordi.envoyerDonneesUSB(new Telephone("rouge"), donnees);
		Imprimante imprimante = new Imprimante(100, "Epson LX-300");

		donnees = "Page à imprimer".getBytes();
		byte[] adresse ="10.2.21.5".getBytes();


		InterfaceUSB imprimanteAnonyme = new InterfaceUSB() {
			@Override
			public void communiquerParPortUSB(byte[] information) {
				System.out.println("//Je suis une imprimante et j'imprime une page:");
				for (int i = 0; i < information.length; i++) {
					System.out.println(String.valueOf(information[i]));
				}
				System.out.println("//Fin de l'impression");
			}
		};

		ordi.envoyerDonneesUSB(imprimanteAnonyme, donnees);
		ordi.envoyerDonneesReseau(imprimante, donnees);
		ordi.affecter(imprimante, adresse);

	}
}
