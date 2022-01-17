package Ejercicios;


public class Ej35Palotes {
	
	public static void main(String[] args) {

		int[] numeros = {321};
		
		for (int numero : numeros) {
			
			System.out.print("El " + numero + " es el " + convierteEnPalotes(numero) + " en el sistema de palotes.");
			
		}
		
	}
		
	public static String convierteEnPalotes(int n) {
		
		String resultado = "";
		
		
		for(int i = 0; i <= Ej1al14.digitos(n); i++) {
			
			for (int j = 0; j < Ej1al14.digitoN(n, i); j++) {
				
				resultado += "|";
				
			}
			
			if (i < Ej1al14.digitos(n) && i != 0) {
				
				resultado += " - ";
				
			}
			
		}
		
		return resultado;
		
	}
	
	
}