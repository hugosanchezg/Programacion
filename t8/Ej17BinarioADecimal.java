package Ejercicios;

import java.util.Scanner;

public class Ej17BinarioADecimal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int decimal = 0;
		
		System.out.print("Introduzca un número binario: ");
		int binario = sc.nextInt();
		
		int bits = Ej1al14.digitos(binario);
		
		for(int i = 0; i < bits; i++) {
			
			decimal += Ej1al14.digitoN(binario, bits - i - 1) * Ej1al14.potencia(2, i);
			
		}
		
		System.out.println(binario + " convertido a decimal es: " + decimal);
		
	}
	
}