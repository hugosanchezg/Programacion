public class Ej03ArraySumaAleat{
public static void main(String[]args){
  
  
  int[][] numero = new int[4][5];
  int fila;
  int columna;
  int sumafila=0;
  int sumacolumna=0;
  int sumatotal=0;
  
  System.out.println("Introduce 20 números: ");
  
  //Pedimos los números
  for(fila = 0; fila < 4; fila++){
    for(columna = 0; columna < 5; columna++){
      numero[fila][columna]=(int)(Math.random()*1000)+100;
    }
  }
  
  //Sumamos las filas
  for(fila = 0; fila < 4; fila++){
    for(columna = 0; columna < 5; columna++){
      System.out.printf("%4d   ",numero[fila][columna]);
      sumafila+=numero[fila][columna];
    }
    System.out.printf("|%4d\n",sumafila);
  }
  
  //Sumamos las columnas
  for(columna = 0; columna < 5; columna++){
    System.out.print("_______");
  }
  
  System.out.println("|______");
  for(columna = 0; columna < 5; columna++){
    for(fila = 0; fila < 4; fila++){
      sumacolumna+=numero[fila][columna];
    }
    sumatotal+=sumacolumna;
    System.out.printf("%4d   ",sumacolumna);
  }
  System.out.printf("%4d",sumatotal);
}}
