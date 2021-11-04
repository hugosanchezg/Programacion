public class Ej20{
public static void main(String[]args){
  
  System.out.print("Introduzca la altura de la pirámide: ");
    int altura=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el carácter con el que formar la pirámide: ");
    String caracter=System.console().readLine();

//EJ. SI LA ALTURA ES 4:
//p1    *       4 huecos   1 carácter         0 huecos interiores
//p2   * *      3 huecos   2 carácteres       1 hueco interior
//p3  *   *     2 huecos   2 carácteres       3 huecos interiores
//p4 *******    1 huecos   7 carácteres       0 huecos interiores

//Por lo tanto, la planta se va sumando de arriba a abajo, y los huecos exteriores restándose
 
  int planta=1;
  int huecos=altura-1;
  int huecosinteriores=0;
  int i=0;
  
  while(planta<altura){
    
    for(i=1; i<=huecos; i++){
      System.out.print(" ");
    }
    
  //metemos las dos filas de carácteres
    System.out.print(caracter);
    for(i=1; i<huecosinteriores; i++){
      System.out.print(" ");
    }
    if(planta>1){
      System.out.print(caracter);
    }
    
    System.out.println();
    
    planta++;
    huecos--;
    huecosinteriores=huecosinteriores+2;
  
  }

//Bucle para construir la base de la pirámide 
  for(i=1; i<altura*2; i++){
    System.out.print(caracter);
  }
  
}}
