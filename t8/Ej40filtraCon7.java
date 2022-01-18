package Ejercicios;
import java.util.Scanner;

public class Ej40filtraCon7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//generamos el array de nros aleatoriamente
		int[] numeros = Ej20al28.generaArrayInt(20, 1, 1000);
		
		System.out.print("Array original: ");
		Ej20al28.muestraArrayInt(numeros);
		
		System.out.print("\nNúmeros que contienen el 7: ");
		Ej20al28.muestraArrayInt(filtraCon7(numeros));
		
	}
	
	public static int[] filtraCon7(int array[]) {
		
		int[] con7 = new int[array.length];
		int contadorCon7 = 0;
		
		//miramos si cada número del array contiene el 7
		for (int numero : array) {
			
			if (contieneEl7(numero)) {
				
				//si el nro contiene 7 lo añadimos al array
				con7[contadorCon7++] = numero;
				
			}
		}
		
		//creamos el resultado
		int[] resultado = new int[contadorCon7];
		
		//pasamos los datos a resultado, aunque lo podríamos hacer return de con7[] 
		for (int i = 0; i < contadorCon7; i++) {
			
			resultado[i] = con7[i];
			
		}
		
		return resultado;
		
	}
	
	//hacemos la funcion para ver si contiene el 7
	public static boolean contieneEl7(int n) {
		
		boolean loContiene = false;
		
		//Si la función no devuelve -1 es porque está
		if(Ej1al14.posicionDeDigito(n, 7) != -1) {
			
			loContiene = true;
			
		}
		
		return loContiene;
		
	}
	
}
