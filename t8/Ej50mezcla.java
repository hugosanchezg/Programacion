package Ejercicios;

public class Ej50mezcla {

	public static void main(String[] args) {
		
		int[] array1 = {1,2,3};
		int[] array2 = {1,2,3};
		
		System.out.print("Vamos a mezclar el array: ");
		
		for(int i = 0; i < array1.length; i++) {
			
			System.out.print(array1[i]+ " ");
			
		}
		
		System.out.print("\ncon el array: ");
		
		for(int i = 0; i < array2.length; i++) {
			
			System.out.print(array2[i] + " ");
			
		}
		
		System.out.print("\nEL RESULTADO ES ");
		//mostramos el resultado
		for (int n : mezcla(array1, array2)) {
			
			System.out.print(n + " ");
			
		}
		
	}

	public static int[] mezcla(int[] array1, int[] array2) {
		
		int[] mezclado = new int [array1.length + array2.length];
		int colocadoDeArray1 = 0;
		int colocadoDeArray2 = 0;
		
		for(int i = 0; i < array1.length + array2.length; i++) {
			
			if (colocadoDeArray1 < array1.length) {
				
				mezclado[i++] = array1[colocadoDeArray1++];
				
			}
			
			if (colocadoDeArray2 < array2.length) {
				
				mezclado[i] = array2[colocadoDeArray2++];
				
			}
			
		}
		
		return mezclado;
		
	}
	
}
