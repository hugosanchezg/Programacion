public class Ej20CubaLitro{
public static void main(String[]args){
  
  System.out.println("Se va a rellenar 'random litros' de una cubeta con una capacidad introducida");
  System.out.print("Introduce la capacidad de la cuba en litros: ");
    int altura=Integer.parseInt(System.console().readLine());
  System.out.println();
  
  int ancho=5;
  int litro=(int)(Math.random()*(altura+1));
  int posicion=altura;
  
  for(int i=0; i<altura; i++){
    
    if(i<(altura-litro)){
      System.out.println("*     *");
    }else{
        System.out.println("*=====*");
      }
  }
  System.out.println("*******");
}}
