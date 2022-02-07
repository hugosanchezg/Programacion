package models;

public class Ave extends Animal{

	public Ave(String s) {
		
		super(s);
		
	}
	
	public void ponHuevo() {
		
		if (this.getSexo().equals("MACHO")) {
			
			System.out.println("Soy macho, no puedo poner huevos");
		
		} else {
			
			System.out.println("Ahi va... un huevo");
			
		}
		
	}
	
	public void limpiate() {
		
		System.out.println("Me estoy limpiando las plumas");
		
	}
	
	public void vuela() {
		
		System.out.println("Estoy volando");
		
	}
	
	
}
