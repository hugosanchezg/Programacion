package Ejercicios;

import java.util.Scanner;

public class Ej20al28 {
	
	//MAIN
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int tamanio = 0;
		int minimo = 0;
		int maximo = 0;
		
		/*
		while (tamanio < 3) {
        	
            System.out.print("Introduce el tamaño del array (>= 3): ");
            tamanio = sc.nextInt();
    
		}
		
		System.out.print("Introduce el número mínimo del intervalo: ");
        minimo = sc.nextInt();
        
        System.out.print("Introduce el número máximo del intervalo: ");
        maximo = sc.nextInt();
        
        
		//EJ 20: GENERA ARRAY INT
		System.out.println("\nEJ 20. GENERA ARRAY INT:");
		//creamos el array
		int[] array = generaArrayInt(tamanio, minimo, maximo);
		
		//lo mostramos
		muestraArrayInt(array);
		
		System.out.println();
		
		//EJ 21: MÍNIMO ARRAY INT
		System.out.println("\nEJ 21. MINIMO ARRAY INT:");
		System.out.println("El mínimo del array es: " + minimoArrayInt(array));
		
		//EJ 22: MÁXIMO ARRAY INT
		System.out.println("\nEJ 22. MÁXIMO ARRAY INT:");
		System.out.println("El máximo del array es: " + maximoArrayInt(array));
		
		//EJ 23: MEDIA ARRAY INT
		System.out.println("\nEJ 23. MEDIA ARRAY INT:");
		System.out.println("La media del array es: " + mediaArrayInt(array));
		
		//EJ 24: ESTA EN ARRAY INT
		System.out.println("\nEJ 24. ESTA EN ARRAY INT:");
		System.out.print("¿Qué número quieres comprobar si está en el array? ");
        int n = sc.nextInt();
		System.out.println("¿El número " + n + " está en el array?: " + estaEnArrayInt(array, n));
		
		//EJ 25: POSICION EN ARRAY
		System.out.println("\nEJ 25. POSICION EN ARRAY:");
		System.out.print("¿Qué número del array quieres buscar? ");
        int numero = sc.nextInt();
		System.out.println("El número " + numero + " está en la posicion: " + posicionEnArray(array, numero));
		
		//EJ 26: VOLTEA EL ARRAY
		System.out.println("\nEJ 26. VOLTEA ARRAY:");
        muestraArrayInt(volteaArrayInt(array));
        System.out.println();
		
		//EJ 27: ROTA DERECHA ARRAY
      	System.out.println("\nEJ 27. ROTA DERECHA ARRAY:");
      	System.out.print("¿Cuántos pasos quieres rotar a la derecha? ");
        int nVeces = sc.nextInt();
      	muestraArrayInt(rotaDerechaArrayInt(array, nVeces));
		
		//EJ 28: ROTA IZQUIERDA ARRAY
      	System.out.println("\nEJ 28. ROTA IZQUIERDA ARRAY:");
      	System.out.print("¿Cuántos pasos quieres rotar a la izquierda? ");
        int nVecesI = sc.nextInt();
      	muestraArrayInt(rotaDerechaArrayInt(array, nVecesI));
      	*/
		
	}//main
	

	public static int[] generaArrayInt(int tamanio, int minimo, int maximo) {
		
		int[] arrayFinal = new int[tamanio];
		
		//generamos el array con los datos introducidos
		for(int i = 0; i < tamanio; i++) {
			
			arrayFinal[i] = (int)(Math.random()*(maximo - minimo + 1) + minimo);
			
		}
		
		return arrayFinal;
		
	}
	
	public static void muestraArrayInt(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " ");
			
		}
		
	}
	
	public static int minimoArrayInt(int[] array) {
		
		int min = Integer.MAX_VALUE;
		
		for (int n : array) {
			
			if (n < min) {
				
				min = n;
				
			}
		}
		
		return min;
		
	}
	
	public static int maximoArrayInt(int[] array) {
		
		int max = Integer.MIN_VALUE;
		
		for (int n : array) {
			
			if (n > max) {
				
				max = n;
				
			}
		}
		
		return max;
		
	}
	
	public static double mediaArrayInt(int[] array) {
		
		int suma = 0;
		
		for (int n : array) {
			
			suma += n;
			
		}
		
		return (double)suma / array.length;
	
	}
	
	public static boolean estaEnArrayInt(int[] array, int n) {
		
		for (int numero : array) {
			
			if (numero == n) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	public static int posicionEnArray(int[] array, int numero) {
		
		for(int i = 0; i < array.length; i++) {
			
			if (array[i] == numero) {
				
				return i;
				
			}
		}
		
		//Si no está devuelve -1
		return -1;
		
	}
	
	public static int[] volteaArrayInt(int[] array) {
		
		int[] volteada = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			
			volteada[array.length - i - 1] = array[i];
			
		}
		
		return volteada;
		
	}
	
	public static int[] rotaDerechaArrayInt(int[] array, int nVeces) {
		
		int[] arrayFinal = array.clone(); // clona en arrayFinal el contenido de array
		
		int aux;
		
		while (nVeces-- > 0) {
			
			aux = arrayFinal[arrayFinal.length - 1];
			
			for(int i = arrayFinal.length - 1; i > 0; i--) {
				
				arrayFinal[i] = arrayFinal[i - 1];
				
			}
			
			arrayFinal[0] = aux;
			
		}
		
		return arrayFinal;
		
	}
	
	public static int[] rotaIzquierdaArrayInt(int[] array, int nVecesI) {
		
		int[] arrayFinal = array.clone();
		int aux;
		
		while (nVecesI-- > 0) {
			aux = arrayFinal[0];
			
			for(int i = 0; i < arrayFinal.length - 1; i++) {
				arrayFinal[i] = arrayFinal[i + 1];
			}
		
			arrayFinal[arrayFinal.length - 1] = aux;
			
		}
		
		return arrayFinal;
		
	}
	
	
	
}