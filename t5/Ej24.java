public class Ej24{
public static void main(String[]args){
  
  System.out.print("Introduzca la altura de la pirámide: ");
    int altura=Integer.parseInt(System.console().readLine());

//EJ. SI LA ALTURA ES 4:
//p1    1     4 huecos
//p2   123    3 huecos, 2 carácteres más
//p3  12312   2 huecos, 2 caráceteres más
//p4 1234123  1 huecos, 2 carácteres más

//Por lo tanto, la planta se va sumando de abajo a arriba, y los huecos restándose
 
  int planta=1;
  int i=0;
  int huecos=altura-1;
  

  while(planta<=altura){
    
    for(i=1; i<=huecos; i++){
      System.out.print(" ");
    }
    //lado izquierdo de la pirámide
    for(i=1; i<=planta; i++){
      System.out.print(i);
    }
    //lado derecho de la pirámide
    for(i=planta-1; i>0; i--){
      System.out.print(i);
    }
    
    System.out.println();
    
    planta++;
    huecos--;
    
  }
}}
