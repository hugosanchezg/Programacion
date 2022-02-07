package models;

import interfaces.Vacunable;

public class Perro extends Animal implements Vacunable {

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	
	

	public void ladrar() {
		
	}

	@Override
	public void mostrarMesesVacunacionObligatoria() {
		
		System.out.println("Quedan 10 meses");
		
	}
	
	
	
	
	
	
}
