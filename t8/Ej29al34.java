package funciones;

import java.util.Scanner;

public class Ej29al34 {
	
	//MAIN
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int filas = 5;
		int columnas = 5;
		int minimo = 0;
		int maximo = 0;
		
		System.out.print("Introduce el número mínimo del intervalo: ");
        minimo = sc.nextInt();
        
        System.out.print("Introduce el número máximo del intervalo: ");
        maximo = sc.nextInt();
		
        //EJ 29: GENERA ARRAY BI INT
		System.out.println("\nEJ 29. GENERA ARRAY BI INT:");
		//creamos el array
		int[][] array = generaArrayBiInt(filas, columnas, minimo, maximo);
		
		//lo mostramos
		muestraArrayBiInt(array);
		/*
		//EJ 30: FILA DE ARRAY BI INT
		System.out.println("EJ 30. FILA DE ARRAY BI INT:");
		System.out.print("Introduce la fila que quieres sacar del array (0-4): ");
        int nfila = sc.nextInt();
        Ej20al28.muestraArrayInt(filaDeArrayBiInt(array, nfila));
        System.out.println();
        
        //EJ 31: COLUMNA DE ARRAY BI INT
		System.out.println("\nEJ 31. COLUMNA DE ARRAY BI INT:");
		System.out.print("Introduce la columna que quieres sacar del array (0-4): ");
	    int ncolumna = sc.nextInt();
	    Ej20al28.muestraArrayInt(columnaDeArrayBiInt(array, ncolumna));
	    System.out.println();
	    
	    //EJ 32: COOORDENADA EN ARRAY BI INT
  		System.out.println("\nEJ 32. COOORDENADA EN ARRAY BI INT:");
  		System.out.print("Introduce el número que quieres econtrar en el array: ");
  	    int numero = sc.nextInt();
  	    Ej20al28.muestraArrayInt(coordenadasEnArrayBiInt(array, numero));
  	    */
  	    //EJ 33: ES PUNTO DE SILLA
  	    System.out.println("\nEJ 33. ES PUNTO DE SILLA:");
		
  	    boolean siEs = false;
  	    for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				if (esPuntoDeSilla(array, i, j)) {
					
					System.out.println("fila " + i + ", columna " + j + " -> " + array[i][j]);
					siEs = true;
					
				}
				
			} // for j
			
		} // for i
		
		if(siEs == false) {
			
			System.out.println("No hay punto de silla");
			
		}
		
		//EJ 34: DIAGONAL
  	    System.out.println("\nEJ 34. DIAGONAL:");
  	    System.out.print("Fila: ");
			int fila = sc.nextInt();
		System.out.print("Columna: ");
			int columna = sc.nextInt();
		System.out.print("¿Qué dirección quieres (nose 'izq-dcha' y neso 'dcha-izq' )? ");
			String direccion = sc.next();
		System.out.print("\nLa diagonal es: ");
		Ej20al28.muestraArrayInt(diagonal(array, fila, columna, direccion));
		
		
	}//main
	
	public static int[][] generaArrayBiInt(int filas, int columnas, int minimo, int maximo) {
		
		int[][] array = new int[filas][columnas];
		
		for(int i = 0; i < filas; i++) {
			
			for(int j = 0; j < columnas; j++) {
				
				array[i][j] = (int)(Math.random()*(maximo - minimo) + minimo + 1);
				
			}
			
		}
		
		return array;
		
	}
	
	public static void muestraArrayBiInt(int[][] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array[0].length; j++) {
				
				System.out.print(array[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
	}

	public static int[] filaDeArrayBiInt(int[][] array, int nfila) {
		
		int[] filaSacada = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			
			filaSacada[i] = array[nfila][i];
			
		}
		
		return filaSacada;
		
	}
	
	public static int[] columnaDeArrayBiInt(int[][] array, int ncolumna) {
		
		int[] columnaSacada = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			
			columnaSacada[i] = array[i][ncolumna];
			
		}
		
		return columnaSacada;
		
	}
	
	public static int[] coordenadasEnArrayBiInt(int array[][], int numero) {
		
		for (int fila = 0; fila < array.length; fila++) {
			
			for (int columna = 0; columna < array.length; columna++) {
				
					if (array[fila][columna] == numero) {
						
						int[] coordenadas = {fila, columna};
						return coordenadas;
						
					}
					
			}
		}
		
		//si no se encuentra devolvemos lo siguiente:
		int[] coordenadas = {-1, -1};
		return coordenadas;
		
	}

	public static boolean esPuntoDeSilla(int array[][], int i, int j) {
		
		int[] fila = filaDeArrayBiInt(array, i);
		int[] columna = columnaDeArrayBiInt(array, j);
		return ((Ej20al28.minimoArrayInt(fila) == array[i][j]) && (Ej20al28.maximoArrayInt(columna) == array[i][j]));
	
	}
	
	public static int[] diagonal(int array[][], int fila, int columna, String direccion) {
		
		int elementos = 0, i, j;
		int[] diagonalAux = new int [1000];
		
		for (i = 0; i < array.length; i++) {
		
			for (j = 0; j < array[0].length; j++) {
				
				if ( (((columna - j) == (fila - i)) && (direccion.equals("nose"))) || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
					
					diagonalAux[elementos++] = array[i][j];
					
				}
				
			}
		
		}
		
		int[] diagonal = new int[elementos];
		
		for (j = 0; j < elementos; j++) {
			
			diagonal[j] = diagonalAux[j];
			
		}
		
		return diagonal;
		
	}
	


	
}