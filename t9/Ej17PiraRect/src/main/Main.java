package main;

import models.Piramide;
import models.Rectangulo;

public class Main {

	public static void main(String[] args) {
		
		//creamos una pir�mide de 4 de altura
		Piramide p = new Piramide(4);
		
		//rect�ngulo de 4 de ancho y 3 de alto
		Rectangulo r1 = new Rectangulo(4, 3);
		
		//rect�ngulo de 5 de ancho y 2 de alto
		Rectangulo r2 = new Rectangulo(6, 2);
		
		//pintamos la primera piramide
		System.out.println(p);
		
		//pintamos el primer rect�ngulo
		System.out.println(r1);
		
		//pintamos el segundo rectangulo
		System.out.println(r2);
		
		//mostramos cuantas hemos hecho
		System.out.println("Pir�mides creadas: " + Piramide.getPiramidesCreadas());
		System.out.println("Rect�ngulos creados: " + Rectangulo.getRectangulosCreados());
		
	}

}
