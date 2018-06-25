package com.example.java.interfaces;

public class Telephone implements InterfaceUSB {
	private String nom ;
	public Telephone(String nom) {
		this.nom = nom;
	}

	@Override
	public void communiquerParPortUSB(byte[] information) {
		System.out.println("Donn�es re�ues par Telephone("+nom+")");
		System.out.println(new String(information));
		System.out.println("Fin de la r�ception");
	}


}
