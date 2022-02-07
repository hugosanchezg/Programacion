package models;

public class Tiempo {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo(int h, int m, int s) {
		
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
		
		
	}
	
	public Tiempo suma(int h, int m, int s) {
		
		Tiempo resultado;
		
		resultado = new Tiempo(hora + h, minuto + m, segundo + s);
		
		return resultado;
		
	}
	
	public Tiempo resta(int h, int m, int s) {
		
		Tiempo resultado;
		
		resultado = new Tiempo(hora - h, minuto - m, segundo - s);
		
		return resultado;
		
	}
	
	@Override
	public String toString() {
		
		return "Tiempo: " + hora + "h  " + minuto + "m  " + segundo + "s";
		
	}
	
	
	
}
