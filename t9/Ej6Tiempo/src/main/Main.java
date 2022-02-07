package main;

import models.Tiempo;

public class Main {

	public static void main(String[] args) {
		
		Tiempo t = new Tiempo(1, 20, 30);
		
		System.out.println(t);
		
		System.out.print("-Tiempo sumado: ");
		Tiempo sumado = t.suma(2,10,60);
		System.out.print(sumado);
		
		System.out.print("\n-Tiempo restado: ");
		Tiempo restado = t.resta(2,10,60);
		System.out.print(restado);
		
		

	}

}
