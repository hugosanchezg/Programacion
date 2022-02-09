package listadelacompra;

import articulos.ArticuloDeLaLista;
import articulos.ArticuloDeLaTienda;

public class ListaDeLaCompra{
	
	private String nombreLista;
	private int cantidadArticulos;
	private String comentario;
	private ArticuloDeLaLista[] articuloLista;
	
	public ListaDeLaCompra(String n, int c) {
		
		this.nombreLista = n;
		this.cantidadArticulos = 0;
		this.articuloLista = new ArticuloDeLaLista[c];
		
	}
	
	//para cuando pregunte el número de artículos de la lista
	public int getCantidadArticulos() {
		
		return cantidadArticulos;
		
	}
	
	public boolean aniadirArticulo(ArticuloDeLaLista articuloNuevo) {
		
		boolean resultado = true;
		
		//si está lleno devuelve false
		if(cantidadArticulos == ArticuloDeLaLista.getCantidadLista()) {
			
			resultado = false;
			
		}else {
			
			this.articuloLista[cantidadArticulos] = articuloNuevo;
		
			cantidadArticulos++;
			
		}
		
		return resultado;
		
	}
	
	//escribir comentario
	public void escribirComentario(String coment) {
		
		this.comentario = coment;
		
	}
	
	@Override
	public String toString() {
		
		String resultado = "";
		resultado += "\nLista: " + this.nombreLista;
		resultado += "\n--------------------";
		resultado += "\n*Artículos:";
		
		for(int i = 0; i < cantidadArticulos; i++) {
			
			resultado += "\n " + articuloLista[i];
			
		}
		
		resultado += "\n*Comentario:" + comentario;
		return resultado;
		
	}
	
	
	
	
	
	
}
