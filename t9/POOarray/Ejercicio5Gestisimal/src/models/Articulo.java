package models;

public class Articulo {
	
	private String codigo = "vacio";
	private String descripcion;
	private double precioDeCompra;
	private double precioDeVenta;
	private int stock;
	
	public String getCodigo() {
		
		return codigo;
		
	}
	
	public void setCodigo(String code) {
		
		this.codigo = code;
		
	}
	
	public String getDescripcion() {
		
		return descripcion;
		
	}
	
	public void setDescripcion(String description) {
		
		this.descripcion = description;
		
	}
	
	public double getPrecioDeCompra() {
		
		return precioDeCompra;
		
	}
	
	public void setPrecioDeCompra(double precioCompra) {
		
		this.precioDeCompra = precioCompra;
		
	}
	
	public double getPrecioDeVenta() {
		
		return precioDeVenta;
		
	}
	
	public void setPrecioDeVenta(double precioVenta) {
		
		this.precioDeVenta = precioVenta;
		
	}
	
	public int getStock() {
		
		return stock;
		
	}
	
	public void setStock(int existencias) {
		
		this.stock = existencias;
		
	}
	
	public String toString() {
		
		String resultado = "";
		resultado += "\nCódigo: " + this.codigo;
		resultado += "\nDescripción: " + this.descripcion;
		resultado += "\nPrecio de compra: " + this.precioDeCompra;
		resultado += "\nPrecio de venta: " + this.precioDeVenta;
		resultado += "\nStock: " + this.stock + " unidades";
		return resultado;
		
	}
	
	
	
}
