package funciones;

public class Ej52aleatorioDeArray {
	
	public static void main (String args[]) {
		
		int[] array = {11,22,33,44,55,66,77,88,99};
		
		System.out.print("Se va a mostrar un valor aleatorio del siguiente array: ");
		Ej20al28.muestraArrayInt(array);
		
		System.out.print("\nEl número aleatorio es: ");
		System.out.println(aleatorioDeArray(array));
		
			
		
		
	}
	
	public static int aleatorioDeArray(int[] array) {
		
		//Devolvemos el array con un valor aleatorio del mismo
		return array[(int)(Math.random() * array.length)];
		
	}
	
	
}