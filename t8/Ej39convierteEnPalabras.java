package Ejercicios;
import java.util.Scanner;

public class Ej39convierteEnPalabras {
	
	public static void main(String[] args) {
		
		int[] numeros = {123, 234, 34543};
		
		for (int numero : numeros) {
			
			System.out.print("\nEl n�mero " + numero +  " es: " + convierteEnPalabras(numero));
			
		}
		
		
		
	}
		
	public static String convierteEnPalabras(int n) {
		
		String[] palabras = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
		String resultado = "";
		
		int i;
		//123
		for(i = 1; i < Ej1al14.digitos(n); i++) {
			
			resultado = resultado + palabras[Ej1al14.digitoN(n, i)] + ", ";
			
		}
		
		//Sumamos el �ltimo d�gito de como se ha quedado la i porque no va con comas
		resultado += palabras[Ej1al14.digitoN(n, i)];
		
		return resultado;
		
	}
	
	
}