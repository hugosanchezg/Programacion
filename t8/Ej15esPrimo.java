package Ejercicios;

public class Ej15esPrimo {
	
	public static void main(String[] args) {
		
		for(int i = 1; i < 1001; i++) {
			
			//Si es primo pintamos el n�mero
			if (Ej1al14.esPrimo(i)) {
				
				System.out.print(i + " ");
				
			}
			
		}
	}
}