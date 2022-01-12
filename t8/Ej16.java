package Ejercicios;

public class Ej16 {
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 99999; i++) {
			
			//Si es capicua pintamos el número
			if (Ej1al14.esCapicua(i)) {
				
				System.out.print(i + " ");
				
			}
			
		}
	}
}