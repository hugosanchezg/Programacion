package funciones;

public class Ej51AleatPrimoCapicua {
	
	public static void main (String args[]) {
		
		int[] array = Ej20al28.generaArrayInt(10, 2, 1000);
		
		System.out.print("El array generado aleatoriamente es: ");
		Ej20al28.muestraArrayInt(array);
		System.out.println();
		
		for (int numero : array) {
			
			if (Ej1al14.esPrimo(numero)) {
				
				System.out.print("-El " + numero + " es primo");
				
			} else {
				
				System.out.print("-El " + numero + " no es primo");
				
			}
			
			if (Ej1al14.esCapicua(numero)) {
				
				System.out.println(" y capicúa");
				
			} else {
				
				System.out.println(" y no capicúa");
				
			}
			
		}
		
	}
	
}
