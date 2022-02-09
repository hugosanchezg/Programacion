package moneda;

public class Moneda {
	
	private String estado = "X";
	
	public Moneda () {
		
		int posibilidad;
		posibilidad = (int)(Math.random()*4);
		
		if(posibilidad == 0) {
			
			this.estado = "[X]";
			
		}else if (posibilidad > 0){
			
			this.estado = "[C]";
			
		}
		
	}
	
	public String tirar() {
		
		int posibilidad;
		posibilidad = (int)(Math.random()*4);
		
		if(posibilidad == 0) {
			
			this.estado = "[X]";
			
		}else if (posibilidad > 0){
			
			this.estado = "[C]";
			
		}
		
		return this.estado;
		
	}
	
	public String getEstado() {
		
		return this.estado;
		
	}
	
}
