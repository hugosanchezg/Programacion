package main;

import models.Caballo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//creamos un caballo
		Caballo caballo1 = new Caballo();
		
		//pedimos datos sobre el caballo
		System.out.println("Caballo número 1: ");
		
		System.out.print("-Nombre: ");
		caballo1.setNombre(sc.next());
		
		System.out.print("-Color: ");
		caballo1.setColor(sc.next());
		
		System.out.print("-Raza: ");
		caballo1.setRaza(sc.next());
		
		//mostramos los datos recibidos
		System.out.println("\nEstos son los datos del caballo:");
		System.out.println("-Nombre: " + caballo1.getNombre());
		System.out.println("-Color: " + caballo1.getColor());
		System.out.println("-Raza: " + caballo1.getRaza());
			
		
		
	}
	
}