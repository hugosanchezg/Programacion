package models;

public class Coche extends Vehiculo{
	
	int numeroPuertas;
	
	public Coche (int nroPuertas) {
		
		super();
		this.numeroPuertas = nroPuertas;
		
	}
	
	public void quemarRueda () {
		
		System.out.println("Quemando rueda");
		
	}
	
	
}
