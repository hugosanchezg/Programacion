package funciones;

public class Ej55sinRepetir {
	
	public static void main(String[] args) {
		
		String[] array = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador", "sol", "CASA"};
		
		//mostramos la cadena de palabras pero sólo las no repetidas
		for (String cadena : sinRepetir(array)) {
			
			System.out.print(cadena + " ");
			
		}
		
	}
	
	public static String[] sinRepetir(String[] array) {
		
		String[] vacio = {};
		String[] resultado = new String[array.length];
		
		if (array.length == 0) {
			
			return vacio;
			
		}
		
		resultado[0] = array[0];
		
		int j = 1;
		
		//contamos las veces que está en el array
		for (int i = 1; i < array.length; i++) {
			
			if (!contiene(resultado, array[i])) {
				
				resultado[j++] = array[i];
				
			}
			
		}
		
		return compacta(resultado);
		
	}
	
	public static String[] compacta(String[] array) {
		
		int i = array.length - 1;
		
		while (array[i] == null) {
			
			i--;
		
		}
		
		String[] resultado = new String[i + 1];
		
		System.arraycopy(array, 0, resultado, 0, i + 1);
		
		return resultado;
		
	}
	
	public static boolean contiene(String[] lista, String cadena) {
		
		for (String elemento : lista) {
			
			if ((elemento != null) && (elemento.equals(cadena))) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}


	
}