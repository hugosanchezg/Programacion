package Ejercicios;

import java.util.Scanner;
/*
public class Ej19Conversor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String resultado = "";
		int opcion = 0;
		
		System.out.println("-1: Binario a Octal");
		System.out.println("-2: Binario a Decimal");
		System.out.println("-3: Binario a Hexadecimal");
		System.out.println("-4: Octal a Binario");
		System.out.println("-5: Octal a Decimal");
		System.out.println("-6: Octal a Hexadecimal");
		System.out.println("-7: Decimal a Binario");
		System.out.println("-8: Decimal a Octal");
		System.out.println("-9: Decimal a Hexadecimal");
		System.out.println("-10: Hexadecimal a Binario");
		System.out.println("-11: Hexadecimal a Octal");
		System.out.println("-12: Hexadecimal a Decimal");
		
		//Pedimos la opción
		System.out.println("¿Qué conversión deseas realizar?");
		opcion = sc.nextInt();
			
		//Pedimos el número a convertir
		System.out.print("¿Qué número es el que quieres convertir? ");
		String numeroIntroducidoString = sc.next();
		
		long numeroIntroducido = 0;
		//Convertimos a long las 9 primeras opciones
		if (opcion <= 9) {
			
			numeroIntroducido = Long.parseLong(numeroIntroducidoString);
			
		}
		
		//Llamamos a la función deseada según la opción elegida
		switch (opcion) {
			case 1:
				resultado = Long.toString(binarioAOctal(numeroIntroducido));
			break;
			case 2:
				resultado = Long.toString(binarioADecimal(numeroIntroducido));
			break;
			case 3:
				resultado = binarioAHexadecimal(numeroIntroducido);
			break;
			case 4:
				resultado = Long.toString(octalABinario(numeroIntroducido));
			break;
			case 5:
				resultado = Long.toString(binarioADecimal(octalABinario(numeroIntroducido)));
			break;
			case 6:
				resultado = binarioAHexadecimal(octalABinario(numeroIntroducido));
			break;
			case 7:
				resultado = Long.toString(decimalABinario(numeroIntroducido));
			break;
			case 8:
				resultado = Long.toString(binarioAOctal(decimalABinario(numeroIntroducido)));
			break;
			case 9:
				resultado = binarioAHexadecimal(decimalABinario(numeroIntroducido));
			break;
			case 10:
				resultado = Long.toString(hexadecimalABinario(numeroIntroducidoString));
			break;
			case 11:
				resultado = Long.toString(binarioAOctal(hexadecimalABinario(numeroIntroducidoString)));
			break;
			case 12:
				resultado = Long.toString(binarioADecimal(hexadecimalABinario(numeroIntroducidoString)));
			break;
		}
		
		System.out.println("El resultado convertido es: " + resultado);
		
	}
	
	//BINARIO A OCTAL
	public static int binarioAOctal(int binario) {
		int octal = 1;
		
		while (binario > 0) {
			
			octal = octal * 10 + (binarioADecimal(binario % 1000));
			binario = binario / 1000;
			
		}
		
		octal = Ej1al14.pegaPorDetras(octal, 1);
		octal = Ej1al14.voltea(octal);
		octal = Ej1al14.quitaPorDetras(octal, 1);
		octal = Ej1al14.quitaPorDelante(octal, 1);
		return octal;
		
	}
	
	//BINARIO A DECIMAL
	public static int binarioADecimal(int binario) {
		
		int decimal = 0;
		int bits = Ej1al14.digitos(binario);
		
		for(int i = 0; i < bits; i++) {
			
			decimal += Ej1al14.digitoN(binario, bits - i - 1) * Ej1al14.potencia(2, i);
			
		}
		
		return decimal;
		
	}
	
	//BINARIO A HEXADECIMAL
	public static String binarioAHexadecimal(int binario) {
		
		String hexadecimal = "";
		String digitosHexa = "0123456789ABCDEF";
		
		while (binario > 0) {
			
			hexadecimal = digitosHexa.charAt((int)binarioADecimal(binario % 10000)) + hexadecimal;
			binario = binario / 10000;
			
		}
		
		return hexadecimal;
			
	}
	
	//OCTAL A BINARIO
	public static int octalABinario(int octal) {
		
		int binario = 0;
		
		for (int i = 0; i < Ej1al14.digitos(octal); i++) {
			
			binario = binario * 1000 + decimalABinario(Ej1al14.digitoN(octal, i));
			
		}
		
		return binario;
		
	}
	
	//DECIMAL A BINARIO
	public static int decimalABinario(int decimal) {
		
		if (decimal == 0) {
			
			return 0;
			
		}
		
		int binario = 1;
		
		while (decimal > 1) {
			
			binario = Ej1al14.pegaPorDetras(binario, decimal % 2);
			decimal = decimal / 2;
			
		}
		
		binario = Ej1al14.pegaPorDetras(binario, 1);
		binario = Ej1al14.voltea(binario);
		binario = Ej1al14.quitaPorDetras(binario, 1);
		
		return binario;
		
	}
	
	//HEXADECIMAL A BINARIO
	public static long hexadecimalABinario(String hexadecimal) {
		
		String digitosHexa = "0123456789ABCDEF";
		long binario = 0;
		
		for (int i = 0; i < hexadecimal.length(); i++) {
			
			binario = binario * 10000 + decimalABinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
		
		}
		
		return binario;
		
	}

}
*/
