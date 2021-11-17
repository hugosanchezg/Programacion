public class Ej22Serpiente{
public static void main(String[]args){
  
  System.out.println("Se va a pintar una serpiente con un serpenteo random");
  System.out.print("Introduce la longitud de la serpiente (incluida la cabeza): ");
    int longitud=Integer.parseInt(System.console().readLine());
  System.out.println();
  
  System.out.println("            @");
  
  for(int i=0; i<longitud; i++){
    
    int posicionAleat=(int)(Math.random()*2);
    switch(posicionAleat){
      case 0:
        System.out.println("             *");
      break;
      case 1:
        System.out.println("            *");
      break;
      case 2:
        System.out.println("           *");
      break;
      default:
    }
  }
  
  
}}
