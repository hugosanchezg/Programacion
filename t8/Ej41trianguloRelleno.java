package Ejercicios;
import java.util.Scanner;

public class Ej41trianguloRelleno {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Introduzca la altura de la figura: ");
		int altura = Integer.parseInt(s.nextLine());
		
		//Pintamos la piramide
		for (int i = altura; i > 0; i--) {
			
			//en cada paso ponemos una línea y le reducimos uno la longitud
			System.out.println(linea('*', i));
			
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