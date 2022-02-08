package models;

public class Rectangulo {
	
	private int base;
	private int altura;
	private static int rectangulosCreados;
	
	public Rectangulo(int b, int a) {
		
		this.base = b;
		this.altura = a;
		rectangulosCreados++;
		
	}
	
	public static int getRectangulosCreados() {
		
		return rectangulosCreados;
		
	}
	
	@Override
	public String toString() {
		
		String cadena = "";
		
		for (int i = 0; i < altura; i++) {
			
			for (int j = 0; j < base; j++) {
				
				cadena += '*';
				
			}
			
			cadena += '\n';
		}
		
		return cadena;
		
	}

	
}
