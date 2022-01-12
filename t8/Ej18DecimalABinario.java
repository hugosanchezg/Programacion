package Ejercicios;

import java.util.Scanner;

public class Ej18DecimalABinario {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int binario = 1;
		
		System.out.print("Introduzca un número decimal (en base 10): ");
		int decimalIntroducido = sc.nextInt();
		
		int decimal = decimalIntroducido;
		
		if (decimal == 0) {
			
			binario = 0;
			
		}
		
		while (decimal > 1) {
			binario = Ej1al14.pegaPorDetras(binario, decimal % 2);
			decimal = decimal / 2;
		}
		
		binario = Ej1al14.pegaPorDetras(binario, 1);
		binario = Ej1al14.voltea(binario);
		binario = Ej1al14.quitaPorDetras(binario, 1);
		
		System.out.println(decimalIntroducido + " convertido a binario es: " + binario);
		
	}
	
}