package main;

import java.util.Scanner;

import models.Zona;

public class Main {

	public static void main(String[] args) {
		
		Zona salaPrincipal = new Zona(1000);
		Zona compraventa = new Zona(200);
		Zona vip = new Zona(25);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Elige una opción: ");
		
		boolean salir = false;
		
		do {
			
			System.out.println("1. Mostrar número de entradas libres");
			System.out.println("2. Vender entradas");
			System.out.println("3. Salir");
			int opcion = sc.nextInt();
			
			switch (opcion) {
				
				case 1:
					
					System.out.println("\nEn la zona principal hay " + salaPrincipal.getEntradasPorVender());
					System.out.println("En la zona de compra venta hay " + compraventa.getEntradasPorVender());
					System.out.println("En la zona vip hay " + vip.getEntradasPorVender());
				
				break;
				case 2:
					
					System.out.println("¿De qué zona quieres quieres comprar? (1-Sala Principal, 2-Compra venta, 3-VIP)");
					int opcion2 = sc.nextInt();
					
					System.out.println("¿cuántas quieres?");
					int entradas = sc.nextInt();
					
					switch (opcion2) {
					
					case 1:
						
						salaPrincipal.vender(entradas);
					
					break;
					case 2:
						
						compraventa.vender(entradas);
						
					break;
					case 3:
						
						vip.vender(entradas);
						
					default:
						
					}
					
				break;
				case 3:
					
					salir = true;
					
				default:
					
			}
			
		}while(!salir);
		
		
		
		

	}

}
