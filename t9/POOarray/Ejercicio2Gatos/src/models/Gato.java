package models;

public class Gato {
	
	private String nombre, color, raza;
	
	public Gato (String n, String c, String r) {
		
		this.nombre = n;
		this.color = c;
		this.raza = r;
		
	}
	
	public void setNombre(String contenidonombre) {
		
		this.nombre = contenidonombre;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	
	public String getColor() {
		
		return color;
		
	}
	
	public void setRaza(String raza) {
		
		this.raza = raza;
		
	}
	
	public String getRaza() {
		
		return raza;
		
	}
	
}
