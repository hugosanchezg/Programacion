package main;

import models.Fraccion;

public class Main {

	public static void main(String[] args) {
		
		Fraccion fraccion1 = new Fraccion(2,10);
		
		System.out.print("\nInvertimos la fracción " + fraccion1 + ": ");
		Fraccion invertida = fraccion1.invierte();
		System.out.print(invertida);
		
		System.out.print("\nSimplificamos la fracción " + fraccion1 + ": ");
		Fraccion simplificada = fraccion1.simplifica();
		System.out.print(simplificada);
		
		Fraccion fraccion2 = new Fraccion(2,10);
		
		System.out.print("\nMultiplicamos la fracción " + fraccion2 + ": ");
		Fraccion multiplicada = fraccion2.multiplica(2,10);
		System.out.print(multiplicada);
		
		System.out.print("\nDividimos la fracción " + fraccion2 + ": ");
		Fraccion dividida = fraccion2.divide(2,10);
		System.out.print(dividida);
		
		
		
	}

}
