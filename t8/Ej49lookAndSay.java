package Ejercicios;
import java.util.Scanner;

public class Ej49lookAndSay {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Cu�ntos t�rminos de la sucesi�n look and say quiere calcular? ");
		int n = Integer.parseInt(sc.nextLine());
		
		int[] array = {1};
		
		//Mostramos cada n�mero del array
		for (int i = 1; i <= n; i++) {
			
			System.out.print(Ej47ArrayEnString.convierteArrayEnString(array));
			
			//Vemos si ponemos la coma dps del nro o no
			if (i < n) {
				
				System.out.print(", ");
				
			} else {
				
				System.out.println();
			
			}
			
			int[] resultado = {};
			
			//creamos el resto de los n�meros de la sucesi�n 
			while (array.length > 0) {
				
				int[] aux = new int[2];
				aux[0] = repeticionesDelPrimero(array);
				aux[1] = array[0];
				array = cola(array);
				resultado = Ej48concatena.concatena(resultado, aux);
				
			}
			
			//y los a�adimos al resultado
			array = resultado.clone();
		
		}
		
	}
	
	public static int repeticionesDelPrimero(int[] a) {
		
		int repeticiones = 0;
		int i = 0;
		
		//hacemos las repeticiones de 1
		while ((i < a.length) && (a[0] == a[i])) {
			
			repeticiones++;
			i++;
			
		}
		
		return repeticiones;
		
	}
	
	public static int[] cola(int[] a) {
		
		// Si el array est� vac�o, se devuelve un array vac�o
		if (a.length == 0) {
		
			int[] aux = {};
			return aux;
			
		}
		
		int r = repeticionesDelPrimero(a);
		int[] c = new int[a.length - r];
		
		for (int i = r; i < a.length; i++) {
			
			c[i - r] = a[i];
			
		}
		
		return c;
		
	}

	
}
