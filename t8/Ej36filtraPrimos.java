package Ejercicios;


public class Ej36filtraPrimos {
	
	public static void main(String[] args) {
		
		//generamos un array (long, min, max)
		int[] numeros = Ej20al28.generaArrayInt(20,1,100);
		
		System.out.print("El array original es: ");
		Ej20al28.muestraArrayInt(numeros);
		System.out.print("\nLos primos del array son: ");
		Ej20al28.muestraArrayInt(filtraPrimos(numeros));
		
	}
		
	public static int[] filtraPrimos(int x[]) {
		
		int[] primos = new int[x.length];
		int cuentaPrimos = 0;
		
		
		for (int numero : x) {
			
			if (Ej1al14.esPrimo(numero)) {
				
				primos[cuentaPrimos++] = numero;
				
			}
			
		}
		
		int[] resultado = new int[cuentaPrimos];
		
		for (int i = 0; i < cuentaPrimos; i++) {
			
			resultado[i] = primos[i];
			
		}
		
		return resultado;
		
	}
	
	
}