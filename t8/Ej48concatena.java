package Ejercicios;

public class Ej48concatena {

	public static void main(String[] args) {
		
		int[] array1 = {1, 2, 3, 4};
		
		int[] array2 = {4, 3, 2, 1};
		
		System.out.println("Los arrays concatenados son: " + concatena(array1,array2));

	}
	
	public static int[] concatena(int[] array1, int[] array2) {
		
		//creamos la variable resultado con los huecos de las dos longitudes de los array
		int[] resultado = new int[array1.length + array2.length];
		
		//metemos los valores del array 1 al resultado
		for (int i = 0; i < array1.length; i++) {
			
			resultado[i] = array1[i];
			
		}
		
		//añadimos los valores del array 2 al resultado
		for (int i = 0; i < array2.length; i++) {
		
			resultado[i + array1.length] = array2[i];
		
		}
		
		return resultado;
		
	}

}
