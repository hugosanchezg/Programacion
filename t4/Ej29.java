//1. ¿Palmera (1.40€), donut (1€) o pitufo?
//2. Pitufo, ¿con aceite (1.20€) o tortilla (1.60€)? 
//3. Zumo (1.50€) o café (1.20€)  
public class Ej29{
public static void main(String[]args){
  String eleccion;
  double precio = 0;
  double zumo = 1.50;
  double cafe = 1.20;

  System.out.println("¿Tomaste palmera, donut o pitufo? ");
    eleccion = System.console().readLine();
  
  switch(eleccion){
    case "pitufo":
      System.out.println("¿Pitufo con aceite o tortilla? ");
      String eleccion2=(System.console().readLine());
        if(eleccion2.equals("aceite")){
        precio=1.20;
        }
        if(eleccion2.equals("tortilla")){
        precio=1.60;
        }
      break;
    case "donut":
      precio=1;
      break;
    case "palmera":
      precio=1.40;
      break;
  }
  System.out.println("¿Quieres zumo o cafe? ");
    String eleccion3 = System.console().readLine();
  switch(eleccion3){
    case "zumo":
        precio=precio+1.50;
      break;
    case "cafe":
      precio=precio+1.20;
      break;
  }
  System.out.println("Te costaría "+precio+" euros");
}}
