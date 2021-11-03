public class Ej19{
public static void main(String[]args){
  
  System.out.print("Introduzca la altura de la pirámide: ");
    int altura=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el carácter con el que formar la pirámide: ");
    String caracter=System.console().readLine();

//EJ. SI LA ALTURA ES 4:
//p1    *     4 huecos
//p2   ***    3 huecos, 2 carácteres más
//p3  *****   2 huecos, 2 caráceteres más
//p4 *******  1 huecos, 2 carácteres más

//Por lo tanto, la planta se va sumando de abajo a arriba, y los huecos restándose
 
  int ancho=1;
  int planta=1;
  int huecos=altura-1;

  while(planta<=altura){
    
    for(int i=1; i<=huecos; i++){
      System.out.print(" ");
    }
    
    for(int i=1; i<=ancho; i++){
      System.out.print(caracter);
    }
    
    System.out.println();
    
    planta++;
    huecos--;
    ancho=ancho+2;
    
  }
}}
