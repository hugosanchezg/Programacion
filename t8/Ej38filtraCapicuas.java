package Ejercicios;


public class Ej38filtraCapicuas {
	
	public static void main(String[] args) {
		
		//generamos un array (long, min, max)
		int[] numeros = Ej20al28.generaArrayInt(20,1,100);
		
		System.out.print("El array original es: ");
		Ej20al28.muestraArrayInt(numeros);
		System.out.print("\nLos capicuas del array son: ");
		Ej20al28.muestraArrayInt(filtraPrimos(numeros));
		
	}
		
	public static int[] filtraPrimos(int x[]) {
		
		int[] capicuas = new int[x.length];
		int cuentaCapicuas = 0;
		
		
		for (int numero : x) {
			
			if (Ej1al14.esCapicua(numero)) {
				
				capicuas[cuentaCapicuas++] = numero;
				
			}
			
		}
		
		int[] resultado = new int[cuentaCapicuas];
		
		for (int i = 0; i < cuentaCapicuas; i++) {
			
			resultado[i] = capicuas[i];
			
		}
		
		return resultado;
		
	}
	
	
}