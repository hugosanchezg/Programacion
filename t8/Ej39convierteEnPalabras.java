package Ejercicios;
import java.util.Scanner;

public class Ej39convierteEnPalabras {
	
	public static void main(String[] args) {
		
		int[] numeros = {123, 234, 34543};
		
		for (int numero : numeros) {
			
			System.out.print("\nEl número " + numero +  " es: " + convierteEnPalabras(numero));
			
		}
		
		
		
	}
		
	public static String convierteEnPalabras(int n) {
		
		String[] palabras = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		String resultado = "";
		
		int i;
		//123
		for(i = 0; i < Ej1al14.digitos(n) - 1; i++) {
			
			resultado = resultado + palabras[Ej1al14.digitoN(n, i)] + ", ";
			
		}
		
		//Por si queremos añadir el último sin comas
		//Sumamos el último dígito de como se ha quedado la i porque no va con comas
		resultado += palabras[Ej1al14.digitoN(n, i)];
		
		return resultado;
		
	}
	
	
}