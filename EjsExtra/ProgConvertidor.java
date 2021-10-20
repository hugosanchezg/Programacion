//Preguntas moneda y preguntas la cantidad
//Convierte estas cantidades de dinero en:
//euro
//dolar
//libra
//yen
//yuan
//A cuanto equivale la cantidad introducida en todas esas

public class ProgConvertidor{
public static void main(String[]args){
  String eleccion;
  double resultadoeuro=0;
  double resultadodolar=0;
  double resultadolibra=0;
  double resultadoyen=0;
  double resultadoyuan=0;
  System.out.println("¿Cuál divisa vas a introducir? euro/dolar/libra/yen/yuan ");
    eleccion = System.console().readLine();
  
  switch(eleccion){
    case "euro":
      System.out.println("¿Cuál es la cantidad de euros? ");
      double euro = Double.parseDouble(System.console().readLine());
      
      resultadodolar=euro*1.1597;
      resultadolibra=euro*0.84;
      resultadoyen=euro*133.9;
      resultadoyuan=euro*7.43;
      
      System.out.println("Su cantidad en "+eleccion+" convertido a dolar es: "+resultadodolar+" dólares");
      System.out.println("Su cantidad en "+eleccion+" convertido a libra es: "+resultadolibra+" libras");
      System.out.println("Su cantidad en "+eleccion+" convertido a yen es: "+resultadoyen+" yenes");
      System.out.println("Su cantidad en "+eleccion+" convertido a yuan es: "+resultadoyuan+" yuanes");
      break;
    case "dolar":
      System.out.println("¿Cuál es la cantidad de dólares? ");
      double dolar = Double.parseDouble(System.console().readLine());
      
      resultadoeuro=dolar*0.86;
      resultadolibra=resultadoeuro*0.84;
      resultadoyen=resultadoeuro*133.9;
      resultadoyuan=resultadoeuro*7.43;
      
      System.out.println("Su cantidad en "+eleccion+" convertido a euro es: "+resultadoeuro+" euros");
      System.out.println("Su cantidad en "+eleccion+" convertido a libra es: "+resultadolibra+" libras");
      System.out.println("Su cantidad en "+eleccion+" convertido a yen es: "+resultadoyen+" yenes");
      System.out.println("Su cantidad en "+eleccion+" convertido a yuan es: "+resultadoyuan+" yuanes");
      break;
    case "libra":
      System.out.println("¿Cuál es la cantidad de libras? ");
      double libra = Double.parseDouble(System.console().readLine());
      
      resultadoeuro=libra*1.18;
      resultadodolar=resultadoeuro*1.1597;
      resultadoyen=resultadoeuro*133.9;
      resultadoyuan=resultadoeuro*7.43;
      
      System.out.println("Su cantidad en "+eleccion+" convertido a euro es: "+resultadoeuro+" euros");
      System.out.println("Su cantidad en "+eleccion+" convertido a dolar es: "+resultadodolar+" dólares");
      System.out.println("Su cantidad en "+eleccion+" convertido a yen es: "+resultadoyen+" yenes");
      System.out.println("Su cantidad en "+eleccion+" convertido a yuan es: "+resultadoyuan+" yuanes");
      break;
    case "yen":
      System.out.println("¿Cuál es la cantidad de yenes? ");
      double yen = Double.parseDouble(System.console().readLine());
      
      resultadoeuro=yen*0.0075;
      resultadodolar=resultadoeuro*1.1597;
      resultadolibra=resultadoeuro*0.84;
      resultadoyuan=resultadoeuro*7.43;
      
      System.out.println("Su cantidad en "+eleccion+" convertido a euro es: "+resultadoeuro+" euros");
      System.out.println("Su cantidad en "+eleccion+" convertido a dolar es: "+resultadodolar+" dólares");
      System.out.println("Su cantidad en "+eleccion+" convertido a libra es: "+resultadolibra+" libras");
      System.out.println("Su cantidad en "+eleccion+" convertido a yuan es: "+resultadoyuan+" yuanes");
      break;
    case "yuan":
      System.out.println("¿Cuál es la cantidad de yuanes? ");
      double yuan = Double.parseDouble(System.console().readLine());
      
      resultadoeuro=yuan*0.13;
      resultadodolar=resultadoeuro*1.1597;
      resultadolibra=resultadoeuro*0.84;
      resultadoyen=resultadoeuro*133.9;
      
      System.out.println("Su cantidad en "+eleccion+" convertido a euro es: "+resultadoeuro+" euros");
      System.out.println("Su cantidad en "+eleccion+" convertido a dolar es: "+resultadodolar+" dólares");
      System.out.println("Su cantidad en "+eleccion+" convertido a libra es: "+resultadolibra+" libras");
      System.out.println("Su cantidad en "+eleccion+" convertido a yen es: "+resultadoyen+" yenes");
      break;
  }
  
}}

