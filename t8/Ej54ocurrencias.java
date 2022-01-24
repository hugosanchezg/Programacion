package funciones;

public class Ej54ocurrencias {
	
	public static void main(String[] args) {
		
		System.out.println("Ocurrencia (8, 4675):" + ocurrencias(8, 4672));
		
		System.out.println("Ocurrencia (2, 123456):" + ocurrencias(2, 123456));
		
		int[] array1 = {714, 81, 9, 11};
		System.out.println(ocurrencias(1, array1));
		
		int[] array2 = {42, 13, 12345, 4};
		System.out.println(ocurrencias(4, array2));
		
	}
	
	//Para los números
	public static int ocurrencias(int digito, int n) {
		
		int repetido = 0;
		
		while (n > 0) {
			
			if ((n % 10) == digito) {
				repetido++;
			}
			
			n = n/10;
			
		}
		
		return repetido;
		
	}
	
	//Para los array
	public static int ocurrencias(int digito, int[] a) {
		
		int repetido = 0;
		
		for (int n : a) {
			
			repetido += ocurrencias(digito, n);
			
		}
		
		return repetido;
	
	}

		
}






















