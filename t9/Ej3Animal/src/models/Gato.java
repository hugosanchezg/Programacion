package models;

import interfaces.Vacunable;

public class Gato extends Mamifero implements Vacunable{

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarMesesVacunacionObligatoria() {

		System.out.println("Quedan 12 meses");
		
	}

	
	
	
	
	
}
