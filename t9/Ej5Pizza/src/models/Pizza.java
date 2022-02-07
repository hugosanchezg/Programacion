package models;

public class Pizza {
	
	private String tamanio;
	private String tipo;
	private String estado = "pedida";
	private static int totalServidas;
	private static int totalPedidas;
	
	public Pizza (String ti, String ta) {
		
		this.tipo = ti;
		this.tamanio = ta;
		totalPedidas++;
		
	}
	
	public void sirve () {
		
		if (this.estado.equals("pedida")) {
			
			this.estado = "servida";
			totalServidas++;
		
		} else {
			
			System.out.println("esa pizza ya se ha servido");
			
		}
		
	}
	
	public static int getTotalPedidas() {
		
		return totalPedidas;
		
	}
	
	public static int getTotalServidas() {
		
		return totalServidas;
		
	}

	@Override
	public String toString() {
		
		return "Pizza " + tipo + " " + tamanio + ", " + estado;
		
	}
	
	
	
	
}
