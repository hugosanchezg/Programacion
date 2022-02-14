package monedas;

public class Moneda {
	
	private String estado = "X";
	
	public Moneda () {
		
		int posibilidad;
		//las creamos con la misma posibilidad
		posibilidad = (int)(Math.random()*2);
		
		if(posibilidad == 0) {
			
			this.estado = "[X]";
			
		}else if (posibilidad == 1){
			
			this.estado = "[C]";
			
		}
		
	}
	
	public String tirar() {
		
		int posibilidad;
		//50% X y 50% C
		posibilidad = (int)(Math.random()*2);
		
		if(posibilidad == 0) {
			
			this.estado = "[X]";
			
		}else if (posibilidad == 1){
			
			this.estado = "[C]";
			
		}
		
		return this.estado;
		
	}
	
	public String getEstado() {
		
		return this.estado;
		
	}
	
	/*
	@Override
	public String toString() {
		
		return "[" + estado + "]";
		
	}
	*/
	
	
	
	
	
}
