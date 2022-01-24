package funciones;

public class Ej53nEsimo {
	
	public static void main (String args[]) {
		
		//creamos un array con un tamaño
		int[][] array = new int[4][6];
		
		//mostramos el array generado aleatoriamente
		for (int fila = 0; fila < array.length; fila++) {
			
			for (int columna = 0; columna < array[0].length; columna++) {
				
				array[fila][columna] = (int) (Math.random() * 201);
				System.out.printf("%5d ", array[fila][columna]);
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("\nnEsimo (array,3): " + nEsimo(array, 3));
		System.out.println("nEsimo (array,20): " + nEsimo(array, 20));
		System.out.println("nEsimo (array,23): " + nEsimo(array, 23));
		System.out.println("nEsimo (array,100): " + nEsimo(array, 100));
		
			
		
		
	}
	
	public static int nEsimo(int[][] array, int posicion) {
		
		int filas = array.length;
		int columnas = array[0].length;
		
		//si no está la posición seleccionada devuelve -1
		if ((posicion < 0) || (posicion > filas * columnas - 1)) {
			
			return -1;
			
		} else {
			
			return array [ posicion / columnas ] [ posicion % columnas ];
			
		}
		
	}
	
	
}
