public class Ej01Array3F6C{
public static void main(String[]args){

  int[][] numero = new int[3][6]; // array de 3 filas por 6 columnas
  numero[0][0]=0;
  numero[0][1]=30;
  numero[0][2]=2;
  numero[0][5]=7;
  numero[1][0]=75;
  numero[1][4]=0;
  numero[2][2]=-2;
  numero[2][3]=9;
  numero[2][5]=11;
  int fila;
  int columna;
  
  for(columna = 0; columna <= 6; columna++){
    System.out.print("  Columna "+columna);
  }
  
  for(fila = 0; fila < 3; fila++){
    System.out.print("\nFila "+fila);
    
    for(columna = 0; columna < 6; columna++){
      System.out.printf("%9d   ",numero[fila][columna]);
    }
  }
}}
