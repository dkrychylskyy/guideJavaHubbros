package com.example.java.interfaces.salutation;

public class SalutationMain {

	public static void main(String[] args) {
		Salutation francais = new Bonjour();
		System.out.println(francais.salut()); //Doit afficher Bonjour

		System.out.println("---------------------------------------");

		Salutation [] salutations = new Salutation [] {
				new Bonjour() , //Français
				new Hello() , //Anglais
				new BuenosDias(),  //Espagnol
				new GutenTag() //Allemand
		};
		for (int i = 0; i < salutations.length; i++){
			System.out.println(salutations[i].salut());
		}

	}

}
