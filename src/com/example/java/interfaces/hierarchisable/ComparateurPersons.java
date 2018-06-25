package com.example.java.interfaces.hierarchisable;

public class ComparateurPersons {

	public static void main(String[] args) {

		Personne p1 = new Personne("Tom", "Tiller");
		Personne p2 = new Personne("Bimm", "Biller");

		String[] personnes = {"",""};


		if (p1.estPlusGrandQue(p2)) {
			personnes[0] = p1.getNom()+" "+p1.getPrenom();
			personnes[1] = p2.getNom()+" "+p2.getPrenom();
		} else {
			personnes[0] = p2.getNom()+" "+p2.getPrenom();
			personnes[1] = p1.getNom()+" "+p1.getPrenom();
		}

		for (String string : personnes) {
			System.out.println(string);
		}

	}


}
