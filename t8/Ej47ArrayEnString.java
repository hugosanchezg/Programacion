package Ejercicios;

public class Ej47ArrayEnString {

	public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4};
		System.out.println("El array de n�meros a String es: " + convierteArrayEnString(array));

	}
	
	public static String convierteArrayEnString(int[] array) {
		
		String resultado = "";
		
		//voy poniendo cada d�gito del array en el string resultado
		for (int digito : array) {
			
			resultado += digito;
			
		}
		
		return resultado;
		
	}
	

}
