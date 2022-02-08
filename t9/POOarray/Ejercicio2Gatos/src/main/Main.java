package main;

import java.util.Scanner;

import models.Gato;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Gato[] gato = new Gato[4];
		
		/*
		gato[1].setNombre("Juan");
		gato[1].getNombre();
		
		gato[2].setColor("marrón");
		gato[2].getColor();
		*/
		
		gato[0] = new Gato("Juan", "naranja", "macho");
		gato[1] = new Gato("Marisa", "blanco", "hembra");
		gato[2] = new Gato("Garfield", "naranja", "macho");
		gato[3] = new Gato("Tom", "gris", "macho");
		
		System.out.println("\nDatos de los gatos:");
		for (int i = 0; i < 4; i++) {
		
			System.out.println("\nGato nº" + (i + 1));
			System.out.println("Nombre: " + gato[i].getNombre());
			System.out.println("Color: " + gato[i].getColor());
			System.out.println("Raza: " + gato[i].getRaza());
			
		}
		
	}

}
