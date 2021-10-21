public class Ej26{
public static void main(String[]args){
  
System.out.print("¿Cuántas entradas quieres comprar? ");
  int entradas=Integer.parseInt(System.console().readLine());
  
  int entradasola=entradas;
  int entradasjueves=0;
  double precioentradasola=8;
  
  double costo=0;
  double descuento=0;
  double preciofinal=0;
  
System.out.println("¿Para qué día? ");
  String dia=System.console().readLine();

System.out.println("¿Tienes tarjeta de cine? si/no ");
  boolean tarjeta=(System.console().readLine().equals("si"));
  
  switch(dia){
    case "miercoles":
      precioentradasola=5;
    case "jueves":
      entradasjueves=entradas/2;
      entradasola=entradas%2;
      costo=11*entradasjueves;
    default:
  }
  costo=precioentradasola*entradas;
  
  if(entradasjueves>0){
    System.out.println("-Número de parejas/ticket de pareja: "+entradasjueves);
    System.out.println("-Precio por entrada un 'jueves de pareja': 11.0€");
  }
  
  if(entradasola>0){
    System.out.println("Entradas individuales: "+entradasola);
    System.out.println("Precio por entrada individual: "+precioentradasola);
  }
  
  if(tarjeta){
    descuento=costo*0.1;
  }
  
  preciofinal=costo-descuento;
  
  System.out.println("-----------------------------------------");
  System.out.println("Este es su ticket de compra de entradas:");
  System.out.println("Total: "+costo);
  System.out.println("Descuento: "+descuento);
  System.out.println("Precio Final: "+preciofinal);
  System.out.println("-----------------------------------------");
}}
