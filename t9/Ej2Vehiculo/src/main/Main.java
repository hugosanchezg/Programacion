package main;
import models.Bicicleta;
import models.Coche;
import models.Vehiculo;
import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		int km;
		
		//creamos un coche y una bicicleta
		Bicicleta bicicleta1 = new Bicicleta(9);
		Coche coche1 = new Coche(5);
		
		//pedimos las opciones
		while (opcion != 8) {
			
			System.out.println("\n-OPCIONES:");
			System.out.println("1. Anda con la bicicleta");
			System.out.println("2. Haz el caballito con la bicicleta");
			System.out.println("3. Anda con el coche");
			System.out.println("4. Quema rueda con el coche");
			System.out.println("5. Ver kilometraje de la bicicleta");
			System.out.println("6. Ver kilometraje del coche");
			System.out.println("7. Ver kilometraje total");
			System.out.println("8. Salir");
			System.out.print("Elige una opción (1-8): ");
			opcion = sc.nextInt();
			
			switch (opcion) {
			
				case 1:
					System.out.print("\n¿Cuántos kilómetros quiere recorrer? ");
					km = sc.nextInt();
					bicicleta1.andar(km);
				break;
				case 2:
					bicicleta1.hazCaballito();
				break;
				case 3:
					System.out.print("\n¿Cuántos kilómetros quiere recorrer? ");
					km = sc.nextInt();
					coche1.andar(km);
				break;
				case 4:
					coche1.quemarRueda();
				break;
				case 5:
					System.out.print("\nLa bicicleta lleva recorridos ");
					System.out.println(bicicleta1.getKilometrosRecorridos() + " Km");
				break;
				case 6:
					System.out.print("\nEl coche lleva recorridos ");
					System.out.print(coche1.getKilometrosRecorridos() + " Km");
				break;
				case 7:
					System.out.print("\nLos vehículos llevan recorridos ");
					System.out.println(Vehiculo.getKilometrosTotales() + " Km");
				default:
					
			}
			
		}
	
	}	
	
}
