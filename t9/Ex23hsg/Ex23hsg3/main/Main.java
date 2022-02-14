package main;

import moneda.Moneda;

import java.util.Scanner;

//HUGO SÁNCHEZ GONZÁLEZ 

//OPCIÓN B

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("El lado trucado es la C con un 75% (3 de 4)");
		
		//pedimos las monedas
		System.out.print("¿Cuántas monedas quieres crear? ");
		int cuantasMonedas = sc.nextInt();
		
		//creamos el array con los huecos pedidos
		Moneda[] monedas = new Moneda[cuantasMonedas];
		
		//creamos los contadores
		int igualesX = 0;
		int igualesC = 0;
		
		//creamos las monedas
		for(int i = 0; i < cuantasMonedas; i++) {
			
			monedas[i] = new Moneda();
			
		}
		
		//el bucle seguirá hasta que iguales == monedas, es decir, cuando iguales == 4
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
		
		
	}

}
