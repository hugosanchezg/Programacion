package main;

import articulos.ArticuloDeLaLista;
import articulos.ArticuloDeLaTienda;
import listadelacompra.ListaDeLaCompra;
import tienda.Tienda;

//HUGO S�NCHEZ GONZ�LEZ 

//OPCI�N B

public class Main {

	public static void main(String[] args) {
		
		//creamos la tienda (V)
		Tienda miTienda = new Tienda ("Programadona",40);
		
		//a�adimos los art�culos (V)
		miTienda.almacenarArticulo(new ArticuloDeLaTienda("Huevo", 12));
		miTienda.almacenarArticulo(new ArticuloDeLaTienda("Patata", 20));
		miTienda.almacenarArticulo(new ArticuloDeLaTienda("Aceite", 1000));
		miTienda.almacenarArticulo(new ArticuloDeLaTienda("Tomate", 20));
		
		//mostramos el listado (V)
		System.out.println(miTienda.listadoAlmacen());
		
		
		//creamos una nueva lista de la compra (V)
		ListaDeLaCompra miListaDeLaCompra = new ListaDeLaCompra("Lista de la compra de �ltima hora",3);
		//a�adimos un comentario (V)
		miListaDeLaCompra.escribirComentario("Que los productos sean los m�s frescos. URGE.");
		
		//a�adimos art�culos a la lista (V)
		miListaDeLaCompra.aniadirArticulo(new ArticuloDeLaLista("Huevo",2));
		miListaDeLaCompra.aniadirArticulo(new ArticuloDeLaLista("Patata",3));
		miListaDeLaCompra.aniadirArticulo(new ArticuloDeLaLista("Aceite",50));

		//mostrar la lista de la compra (V)
		System.out.println(miListaDeLaCompra);
		
		//vender los art�culos ()
		System.out.println("Despu�s de vender los art�culos de la lista de la compra ...");
		miTienda.vender(miListaDeLaCompra);
		System.out.println(miTienda.listadoAlmacen());
		
		 
	}

}
