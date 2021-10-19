//1. De qué sabor quiere la tarta: manzana, fresa o chocolate. 
//2. La tarta de manzana vale 18 euros y la de fresa 16. 
//3. Si se escoge chocolate debe preguntar si el chocolate es negro o blanco 
//  -Negro vale 14 euros y Blanco 15. 
//4. Por último se pregunta si se añade nata y si se personaliza con un nombre; 
//  -La nata suma 2.50 y la escritura del nombre 2.75.
public class Ej27{
public static void main(String[]args){
  String sabor;
  double precio = 0;
  double nata = 2.5;
  double nombre = 2.75;

  System.out.println("¿De qué sabor quieres la tarta: manzana, fresa o chocolate? ");
    sabor = System.console().readLine();
  
  switch(sabor){
    case "chocolate":
      System.out.println("¿Qué tipo de chocolate (blanco/negro)? ");
      String chocolate=(System.console().readLine());
      if(chocolate.equals("blanco")){
        precio=15;
      }
      if(chocolate.equals("negro")){
        precio=14;
      }
      break;
    case "fresa":
      precio=16;
      break;
    case "manzana":
      precio=18;
      break;
  }
  System.out.println("¿Quieres nata?(si/no) ");
  if(System.console().readLine().equals("si")){
    precio=precio+nata;
  }
  System.out.println("¿Quieres que escriba un nombre?(si/no) ");
  if(System.console().readLine().equals("si")){
    precio=precio+nombre;
  }
  System.out.println("Te costaría "+precio+" euros");
}}
