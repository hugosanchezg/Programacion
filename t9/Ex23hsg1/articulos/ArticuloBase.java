package articulos;

public abstract class ArticuloBase {
	
	protected static String nombre;
	protected static int cantidad;
	
	public ArticuloBase(String n, int c) {
		
		this.nombre = n;
		this.cantidad = c;
		
	}
	
	//preguntar el nombre
	public static String getNombre() {
		
		return nombre;
		
	}
	
	//preguntar la cantidad, pero s�lo desde art�culos
	static int getCantidad() {
		
		return cantidad;
		
	}
	
	//cambiar la cantidad, pero s�lo desde art�culos
	void setCantidad(int newCantidad) {
		
		this.cantidad = newCantidad;
		
	}

	@Override
	public String toString() {
		
		String resultado = "";
		
		resultado = ( nombre + " -> Cantidad: " + cantidad);
		
		return resultado;
		
	}
	
	
	
	
	
}
