package models;

public  class Animal {
	
	private String sexo;
	
	public Animal () {
		
		this.sexo = "MACHO";
		
	}
	
	public Animal (String s) {
		
		this.sexo = s;
		
	}
	
	public String getSexo() {
		
		return this.sexo;
		
	}
	
	public void dormir() {
		
		System.out.println("Zzzzzzz");
		
	}
	
	public void comer(String comida) {
		
		System.out.println("Estoy comiendo " + comida);
		
	}
	
	public void hacerSonido() {
		System.out.println("????");
	}
}
