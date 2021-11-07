public class Ej38{
public static void main(String[] args){

  int huecos=0;
  int relleno=0;

  System.out.print("Introduce la altura del reloj de arena: ");
  int altura=Integer.parseInt(System.console().readLine());

  if (((altura%2)!= 0) && (altura>=3)){
    relleno=altura;
    
    for (int i=0; i<altura; i++) {
      for (int j=0; j<huecos; j++) {
        System.out.print(" ");
      }
      
      for (int j=0; j<relleno; j++) {
        System.out.print("*");
      }
      
      System.out.println();
      
      if (i<(altura/2)) {
      huecos++;
      relleno=relleno-2;
      }else{
        huecos--;
        relleno=relleno+2;
        }
    }
  }else{
      System.out.println("Error, datos incorrectos para formarlo");
      System.out.println("Debe ser impar y mayor que 3");
    }
}}
