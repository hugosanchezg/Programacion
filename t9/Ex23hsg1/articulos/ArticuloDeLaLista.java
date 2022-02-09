package articulos;

public class ArticuloDeLaLista extends ArticuloBase{

	public ArticuloDeLaLista(String n, int c) {
		
		super(n, c);
		
		
	}
	
	//preguntar la cantidad, pero sólo desde artículos
	public static int getCantidadLista() {
		
		return cantidad;
		
	}
	
	public static String pintar() {
		
		String resultado = "";
		
		resultado += ("- " + nombre + " -> Cantidad: " + ArticuloDeLaLista.getCantidadLista() );
		
		return resultado;
		
	}
	
	
	
	
}
