package com.example.java;

public class Calculer {
	public static void main(String[] args) {
		Calcul premierCalcul = new Multiplication();
        premierCalcul.calculer(3, 5); // appel de méthode
        System.out.println("Le résultat de 3 multiplié par 5:");
        System.out.println(premierCalcul.getResultat());
        
        
        Calcul calcul2 = new Addition();
		calcul2.calculer(3, 5); // appel de méthode
        System.out.println("Le résultat de 3 ajouté à 5:");
        System.out.println(calcul2.getResultat());
        
        Calcul calcul3 = new Soustraction();
		calcul3.calculer(3, 5); // appel de méthode
        System.out.println("Le résultat de 3 auquel on soustrait 5:");
        System.out.println(calcul3.getResultat());
        
        System.out.println(calcul3);
	}
}
