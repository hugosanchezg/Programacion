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
		
		//25% -> 1 de 4
		if(posibilidad == 0) {
			
			this.estado = "[X]";
		
		//el valor trucado sería la C, con su 75% de probabilidad (3 de 4)
		}else if (posibilidad > 0){
			
			this.estado = "[C]";
			
		}
		
		return this.estado;
		
	}
	
	//el estado es para ver si es cara o cruz
	public String getEstado() {
		
		return this.estado;
		
	}
	
}
