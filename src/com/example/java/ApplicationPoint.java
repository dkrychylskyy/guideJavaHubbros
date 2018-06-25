package com.example.java;

public class ApplicationPoint {

	public static void main(String[] args) {
		Point aPoint = new Point("A",3,5);
		System.out.println(aPoint);

		aPoint.translater(4, -3);
		System.out.println(aPoint.toString());

		Point bPoint = new Point("B",3,5);
		double distanceEntreAetB = bPoint.distance(aPoint);
		System.out.println(distanceEntreAetB);
	}

}
