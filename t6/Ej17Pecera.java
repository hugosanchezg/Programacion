/*Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.*/

public class Ej17Pecera{
public static void main(String[]args){
  
  System.out.print("Introduce la altura del rectangulo (mín 4): ");
    int altura=Integer.parseInt(System.console().readLine());
  System.out.print("Introduce la anchura del rectangulo (mín 4): ");
    int ancho=Integer.parseInt(System.console().readLine());
  
  int pez=(int)(Math.random()*(altura-2)*(ancho-2));
  int posicion=0;
  
  if((altura>=4)&&(ancho>=4)){
    
   //1. Parte de arriba ("tapa")
    for(int i=0; i<ancho; i++){
      System.out.print("* ");
    }
  
    System.out.println();
    
   //2. Paredes
    for(int j=2; j<altura; j++){
      System.out.print("* ");
      
      //-Huecos de dentro
      for(int i=2; i<ancho; i++){
        
        if(posicion==pez){
          System.out.print("& ");
        }else{
          System.out.print("  ");
          }
        posicion++;
      }
      System.out.println("*");
    }
      
   //3. Base
    for(int i=0; i<ancho; i++){
      System.out.print("* ");
    }
    
  }else{
    System.out.println("Datos erróneos, reinicia el programa.");
    }

}}
