package Ejercicios;
import java.util.Scanner;

public class Ej42trianguloHueco {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de la figura: ");
		int altura = Integer.parseInt(s.nextLine());
		
		//Pintamos la primera línea que mide lo mismo que la altura
		System.out.println(linea('*', altura));
		
		//hacemos un bucle dps de la primera línea
		for (int i = 1; i < altura; i++) {
			
			//Pintamos la línea con los huecos
			System.out.print("*" + linea(' ', altura - i - 2));
			
			//Pintamos los caracteres que hacen la figura
			if (i < altura - 1) {
				
				System.out.println("*");
				
			}
		}
		
	}
	
	public static String linea(char caracter, int repeticiones) {
	
		String resultado = "";
	
		for (int i = 0; i < repeticiones; i++) {
			
			resultado += caracter;
			
		}
		
		return resultado;
	}
	
}