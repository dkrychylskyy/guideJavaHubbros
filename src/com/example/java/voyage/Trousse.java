package com.example.java.voyage;

public class Trousse {
	public String publique ; /* Est visible partout où sa classe est visible*/
	protected int protege ; /* Est visible dans son paquete ou depuis les classes qui extendent la classe Trousse */

	int defaut; /* Est visible que dans son paquet */
	private int prive; /* Est visible que dans cette classe */

	public Trousse(String valPub, int valProt, int valDef, int valPriv){
		publique = valPub;
		protege = valProt;
		defaut = valDef;
		prive = valPriv;
	}

	public Trousse(){
		/* Est visible que dans son paquet */
	}

	/** Accesseur public */
	public int getProtege(){
		return protege;
	}
	/** Accesseur public */
	public int getPrive(){
		return prive;
	}

	public int getDefaut() {
		return defaut;
	}
}
