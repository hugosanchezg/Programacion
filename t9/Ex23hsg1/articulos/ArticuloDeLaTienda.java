package articulos;

public class ArticuloDeLaTienda extends ArticuloBase{ 

	public ArticuloDeLaTienda(String n, int c) {
		
		super(n, c);
		
	}
	
	public int stock(ArticuloBase articulillo) {
		
		int resultado = 0;
		
		resultado = ArticuloBase.getCantidad();
		
		return resultado;
		
	}
	
	public boolean descontarStock(int c) {
		
		boolean resultado = false;
		
		if(cantidad >= c) {
			
			resultado = true;
			cantidad = cantidad - c;
			
		}
		
		return resultado;
		
		
	}
	
	public static String pintar() {
		
		String resultado = "";
		
		resultado += ("- " + nombre + " -> Cantidad: " + ArticuloDeLaLista.getCantidadLista() );
		
		return resultado;
		
	}

}
