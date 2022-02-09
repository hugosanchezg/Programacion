package main;

import monedas.Moneda;

import java.util.Scanner;

//HUGO S�NCHEZ GONZ�LEZ 

//OPCI�N B

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Cu�ntas monedas quieres crear? ");
		int cuantasMonedas = sc.nextInt();
		
		Moneda[] monedas = new Moneda[cuantasMonedas];
		
		//creamos los contadores
		int igualesX = 0;
		int igualesC = 0;
		
		//creamos las monedas
		for(int i = 0; i < cuantasMonedas; i++) {
			
			monedas[i] = new Moneda();
			
		}
		
		//el bucle seguir� hasta que iguales == monedas
		while( (igualesX < cuantasMonedas) && (igualesC < cuantasMonedas) ) {
			
			//reseteamos 
			igualesX = 0;
			igualesC = 0;
			
			//muestra las tiradas de las X monedas
			for(int i = 0; i < cuantasMonedas; i++) {
				
				monedas[i].tirar();
				System.out.print(monedas[i].getEstado() + "  ");
				
			}
			
			System.out.println();
			
			//comparamos las monedas
			for(int i = 0; i < cuantasMonedas; i++) {
				
				if(monedas[i].getEstado().equals("[X]")) {
					
					igualesX++;
					
				}
				
				if(monedas[i].getEstado().equals("[C]")) {
					
					igualesC++;
					
				}
				
			}
			
			
		}//while
		
		
		
		
		/*
		do {
			
		}while(moneda1.getEstado != moneda2.getEstado);
		*/
		
		
		
	}

}
