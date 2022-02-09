package tienda;

import articulos.ArticuloDeLaTienda;
import listadelacompra.ListaDeLaCompra;

public class Tienda {
	
	private String nombreDeLaTienda;
	private int totalDeArticulos;
	private ArticuloDeLaTienda[] articuloTienda;
	
	public Tienda (String nombreTienda, int maximo) {
		
		this.nombreDeLaTienda = nombreTienda;
		this.totalDeArticulos = 0;
		this.articuloTienda = new ArticuloDeLaTienda[maximo];
		
	}
	
	public boolean vender(ListaDeLaCompra productillo) {
		
		boolean resultado = false;
		
		
		
		return false;		
		
	}

	public void almacenarArticulo(ArticuloDeLaTienda aTienda) {
		
		this.articuloTienda[totalDeArticulos] = aTienda;
		
		totalDeArticulos++;
		
	}
	
	public String listadoAlmacen() {
		
		String resultado = "";
		resultado += "\nLista de artículos del almacén de la tienda: " + this.nombreDeLaTienda;
		
		for(int i = 0; i < totalDeArticulos; i++) {
			
			resultado +=  "\n" + articuloTienda[i];
			
		}
		
		return resultado;
		
	}
	

	
}
