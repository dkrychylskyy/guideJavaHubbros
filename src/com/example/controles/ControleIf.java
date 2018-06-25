package com.example.controles;

public class ControleIf extends Controle {

	@Override
	public Object lancer(String[] args) {
		Object returnedValue = null;
		if(args.length <= 0) {
			returnedValue = null;
		}
		if(args.length <= 1) {
			returnedValue = args[0];
		}
		if(args.length == 2) {
			returnedValue = args[1];
		}
		if(args.length >= 3) {
			returnedValue = args[2];
		}
		return returnedValue;
	}

}
