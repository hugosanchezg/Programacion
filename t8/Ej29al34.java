package Ejercicios;

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
		
		for(int i = 0; i < 5; i++) {
			
			for(int j = 0; j < 5; j++) {
				
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
			
			for (int columna = 0; columna < array[0].length; columna++) {
				
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

	
	
}