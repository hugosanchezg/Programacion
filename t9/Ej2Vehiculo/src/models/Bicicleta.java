package models;

public class Bicicleta extends Vehiculo{
	
	int numeroPinones;
	
	public Bicicleta(int nroPinones) {
		
		super();
		this.numeroPinones = nroPinones;
		
	}
	
	public void hazCaballito () {
		
		System.out.println("Haciendo el caballito");
		
	}
	
	
}
