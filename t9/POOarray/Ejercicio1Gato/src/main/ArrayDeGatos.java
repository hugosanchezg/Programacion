package main;

import models.Gato;

import java.util.Scanner;

public class ArrayDeGatos {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Gato[] gato = new Gato[4];
		
		gato[1].setNombre("Juan");
		gato[1].getNombre();
		
		
		System.out.println("\nIntroduzca los datos de los gatos:");
		for (int i = 0; i < 4; i++) {
			
			gato[i] = new Gato();
			
			System.out.println(" \nGato nº " + (i + 1));
			System.out.print("Nombre: ");
			gato[i].setNombre(sc.next());
			System.out.print("Color: ");
			gato[i].setColor(sc.next());
			System.out.print("Raza: ");
			gato[i].setRaza(sc.next());
			
		}
		
		System.out.println("\nDatos de los gatos:");
		for (int i = 0; i < 4; i++) {
		
			System.out.println("\nGato nº" + (i + 1));
			System.out.println("Nombre: " + gato[i].getNombre());
			System.out.println("Color: " + gato[i].getColor());
			System.out.println("Raza: " + gato[i].getRaza());
			
		}
		
	}
	
}