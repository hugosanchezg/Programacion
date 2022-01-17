package Ejercicios;


public class Ej37convierteEnMorse {
	
	public static void main(String[] args) {
		
		int [] numeros = {421};
		
		for(int numero : numeros) {
			
			System.out.println("El " + numero + " es" + convierteEnMorse(numero) + " en morse.");
			
		}
		
		
		
	}
		
	public static String convierteEnMorse(int numero) { 
		
		//metemos los nros en morse dentro de un array de strings
		String[] morse = { " _ _ _ _ _ ", " . _ _ _ _ ", " . . _ _ _ ", " . . . _ _ ", " . . . . _ ", " . . . . . ", " _ . . . . ", " _ _ . . . ", " _ _ _ . . ", " _ _ _ _ . "};
		String resultado = "";
		int i;
		
		//421
		for(i = 1; i <= Ej1al14.digitos(numero); i++) {
			
			resultado += morse[Ej1al14.digitoN(numero, i)];
			
		}
		
		return resultado;
		
	}
	
	
}