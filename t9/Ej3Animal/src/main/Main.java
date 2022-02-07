package main;

import models.Animal;
import models.Ave;
import models.Lagarto;
import models.Perro;

public class Main {

	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.dormir();
		
		Lagarto lagarto1 = new Lagarto("asdf");
		lagarto1.dormir();
		
		
		Perro perro1 = new Perro("");
		perro1.dormir();
	}
	
	
}
