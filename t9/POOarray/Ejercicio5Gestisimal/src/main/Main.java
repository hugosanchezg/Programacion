/*
Crea el programa GESTISIMAL (GESTI�n SIMplificada de Almac�n) para llevar el control de los art�culos de un almac�n. 
De cada art�culo se debe saber el c�digo, la descripci�n, el precio de compra, el precio de venta y el stock (nro de uds). 
El men� del programa debe tener, al menos, las siguientes opciones:
1. Listado
2. Alta
3. Baja
4. Modificaci�n
5. Entrada de mercanc�a
6. Salida de mercanc�a
7. Salir
La entrada y salida de mercanc�a supone respectivamente el incremento y decremento de stock de un determinado art�culo. 
Hay que controlar que no se pueda sacar m�s mercanc�a de la que hay en el almac�n.
 */
package main;
import java.util.Scanner;
import models.Articulo;


public class Main {
	
	static int nroArticulos = 10;
	
	public static void main (String[] args) {
		
		boolean salir = false;
		Scanner sc = new Scanner(System.in);
		
		Articulo[] articulo = new Articulo[nroArticulos];
		
		//creamos los art�culos
		for(int i = 0; i < nroArticulos; i++) {
			
			articulo[i] = new Articulo();
			
		}
		
		String codigo;
		
		do {
			
			System.out.println("\n1. Listado");
			System.out.println("2. Alta");
			System.out.println("3. Baja");
			System.out.println("4. Modificaci�n");
			System.out.println("5. Entrada de mercanc�a");
			System.out.println("6. Salida de mercanc�a");
			System.out.println("7. Salir");
			System.out.print("Elige una opci�n: ");
			int opcion = sc.nextInt();
			
			switch (opcion) {
				
				case 1:
					
					System.out.println("El listado de art�culos es:");
					for(int i = 0; i < nroArticulos; i++) {
						
						System.out.println("\n-ART�CULO N�"+ (i+1) + articulo[i]);
						
					}
					
				break;
				case 2:
					
					String descripcionIntroducida;
					double precioDeCompraIntroducido;
					double precioDeVentaIntroducido;
					int stockIntroducido;
					int huecoVacio = 0;
					String codigoIntroducido = "";
					
					//asignamos el primer hueco que est� vac�o para dar de alta el art�culo en ese hueco
					codigo = articulo[huecoVacio].getCodigo();
					
					//vamos buscando los siguientes huecos vacios
					while ((huecoVacio < nroArticulos) && (!(codigo.equals("vacio")))) {
						
						huecoVacio++;
						
						if (huecoVacio < nroArticulos) {
							
							codigo = articulo[huecoVacio].getCodigo();
							
						}
						
					}
					
					//si est� lleno mandamos un mensaje, y si no est� lleno registramos los datos
					if(huecoVacio == nroArticulos) {
						
						System.out.println("Est� todo lleno");
						
					}else {
						
						System.out.print("C�digo: ");
						
						//comprobamos si el c�digo existe
						boolean existecodigo = true;
						
						while(existecodigo) {
							
							existecodigo = false;
							codigoIntroducido = sc.next();
							
							for (int i = 0; i < nroArticulos; i++) {
								
								if (codigoIntroducido.equals(articulo[i].getCodigo())) {
									
									existecodigo = true;
									
								}
								
							}
							
							if (existecodigo) {
								System.out.println("Ese c�digo ya existe en la base de datos.");
								System.out.print("Introduzca otro c�digo: ");
							}
								
						}
						
						articulo[huecoVacio].setCodigo(codigoIntroducido);
							
						}
						
	
						System.out.print("Descripcion: ");
						descripcionIntroducida = sc.next();
						articulo[huecoVacio].setDescripcion(descripcionIntroducida);
						
						System.out.print("Precio de compra: ");
						precioDeCompraIntroducido = sc.nextDouble();
						articulo[huecoVacio].setPrecioDeCompra(precioDeCompraIntroducido);
						
						System.out.print("Precio de venta: ");
						precioDeVentaIntroducido = sc.nextDouble();
						articulo[huecoVacio].setPrecioDeVenta(precioDeVentaIntroducido);
						
						System.out.print("Stock: ");
						stockIntroducido = sc.nextInt();
						articulo[huecoVacio].setStock(stockIntroducido);
						
				break;
					
				case 3:
					
					System.out.print("Por favor, introduzca el c�digo del art�culo que desea dar de baja: ");
					
					for(int i = 0; i < nroArticulos; i++) {
						
						codigoIntroducido = sc.next();
						if(codigoIntroducido.equals(articulo[i].getCodigo())) {
							
							System.out.println("Articulo borrado.");
							articulo[i].setCodigo(null);
							articulo[i].setDescripcion(null);
							articulo[i].setPrecioDeCompra(0);
							articulo[i].setPrecioDeVenta(0);
							articulo[i].setStock(0);
							
						}else {
							
							System.out.println("C�digo no encontrado.");
							break;
							
						}
						
					}
				
					break;
					
				case 4:
					
					System.out.print("�Qu� art�culo (por c�digo) quieres cambiar? ");
					
					boolean acabar = false;
					
					do {
						
						int i = 0;
						codigo = "";
						codigo = sc.next();
						
						if(codigo.equals(articulo[i].getCodigo())) {
							
							System.out.println("Introduzca los datos de nuevo: ");
							System.out.print("C�digo: ");
							codigoIntroducido = sc.next();
							articulo[i].setCodigo(codigoIntroducido);
							
							System.out.print("Nueva descripci�n: ");
							descripcionIntroducida = sc.next();
							articulo[i].setDescripcion(descripcionIntroducida);
							
							System.out.print("Nuevo precio de compra: ");
							precioDeCompraIntroducido = sc.nextDouble();
							articulo[i].setPrecioDeCompra(precioDeCompraIntroducido);
							
							System.out.print("Nuevo precio de venta: ");
							precioDeVentaIntroducido = sc.nextDouble();
							articulo[i].setPrecioDeVenta(precioDeVentaIntroducido);
							
							System.out.print("Nuevo stock: ");
							stockIntroducido = sc.nextInt();
							articulo[i].setStock(stockIntroducido);
					
							acabar = true;
							
						}else {
							
							System.out.println("C�digo no encontrado.");
							acabar = true;
							
						}
						
						i++;
						
					}while(!acabar);
					
				break;
				
				case 5:
					
					System.out.print("�De qu� producto (por c�digo) vas a a�adir stock? ");
					
					do {
						
						codigoIntroducido = "";
						codigoIntroducido = sc.next();
						int i = 0;
						
						if(codigoIntroducido.equals(articulo[i].getCodigo())) {
							
							System.out.print("Introduzca cu�nto stock vas a a�adir: ");
							stockIntroducido = sc.nextInt();
							
							//a�adimos el stock introducido al stock anterior
							articulo[i].setStock(stockIntroducido+articulo[i].getStock());
							
							System.out.println("El stock total del producto con c�digo "+ codigoIntroducido + " actual es: " + articulo[i].getStock());
							acabar = true;
							
						}else {
							
							System.out.println("C�digo no encontrado.");
							acabar = true;
							
						}
						
						i++;
						
					}while(!acabar);
					
				break;
					
				case 6:
					
					System.out.print("�De qu� producto (por c�digo) vas a quitar stock? ");
					
					do {
						
						codigoIntroducido = "";
						codigoIntroducido = sc.next();
						int i = 0;
						
						if(codigoIntroducido.equals(articulo[i].getCodigo())) {
							
							System.out.print("Introduzca cu�nto stock vas a quitar: ");
							stockIntroducido = sc.nextInt();
							
							//a�adimos el stock introducido al stock anterior
							articulo[i].setStock(articulo[i].getStock()-stockIntroducido);
							
							System.out.println("El stock total del producto con c�digo "+ codigoIntroducido + " actual es: " + articulo[i].getStock());
							acabar = true;
							
						}else {
							
							System.out.println("C�digo no encontrado.");
							acabar = true;
							
						}
						
						i++;
						
					}while(!acabar);
				
				break;
				
				case 7:
					
					System.out.println("C�digo no encontrado.");
					salir = true;
					
				default:
			
			}
				

			
		}while(!salir);
		






		
		
		
		
		
		
		
	}
	
	
	
	

}
