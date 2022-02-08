package main;

import models.Piramide;
import models.Rectangulo;

public class Main {

	public static void main(String[] args) {
		
		//creamos una pirámide de 4 de altura
		Piramide p = new Piramide(4);
		
		//rectángulo de 4 de ancho y 3 de alto
		Rectangulo r1 = new Rectangulo(4, 3);
		
		//rectángulo de 5 de ancho y 2 de alto
		Rectangulo r2 = new Rectangulo(6, 2);
		
		//pintamos la primera piramide
		System.out.println(p);
		
		//pintamos el primer rectángulo
		System.out.println(r1);
		
		//pintamos el segundo rectangulo
		System.out.println(r2);
		
		//mostramos cuantas hemos hecho
		System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
		System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
		
	}

}
