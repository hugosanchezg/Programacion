package models;

public abstract class Vehiculo {
	
	//declaramos los atributos
	private static int kilometrosTotales, vehiculosCreados;
	
	private int kilometrosRecorridos;
	
	public Vehiculo () {
		
		this.kilometrosRecorridos = 0;
		
	}
	
	//hacemos los getter de los kilómetros
	public int getKilometrosRecorridos() {
		
		return this.kilometrosRecorridos;
		
	}
	
	public static int getKilometrosTotales() {
		
		return Vehiculo.kilometrosTotales;
		
	}
	
	//la funcion para recorrer kilometros
	public void andar(int km) {
		
		this.kilometrosRecorridos = kilometrosRecorridos + km;
		Vehiculo.kilometrosTotales = kilometrosTotales + km;
		
	}
	

		
		
		
		
		
		
		


}
