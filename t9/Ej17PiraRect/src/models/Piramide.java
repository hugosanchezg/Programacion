package models;

public class Piramide {
	
	private static int PiramidesCreadas;
	private int altura;
	
	public static int getPiramidesCreadas() {
		
		return PiramidesCreadas;
		
	}

	public Piramide(int a) {
		
		this.altura = a;
		PiramidesCreadas++;
		
	}
	
	public String toString() {
		
		String cadena = "";
		int planta = 1;
		int longitudDeLinea = 1;
		int espacios = altura - 1;
		
		while (planta <= altura) {
			
			// inserta espacios
			for (int i = 1; i <= espacios; i++) {
				
				cadena += ' ';
				
			}
			
			// pinta la línea
			for (int i = 1; i <= longitudDeLinea; i++) {
				
				cadena += '*';
				
			}
			
			cadena += '\n';
			planta++;
			espacios--;
			longitudDeLinea += 2;
		
		}
		
		return cadena;
	
	}
	
	
}
