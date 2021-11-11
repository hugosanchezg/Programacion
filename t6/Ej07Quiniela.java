/*Escribe un programa que muestre tres apuestas de la quiniela en tres 
columnas para los 14 partidos y el pleno al quince (15 filas).*/
//tres apuestas por cada enfrentamiento, 15 filas.
public class Ej07Quiniela{
public static void main(String[]args){
  
  int columna=3;
  int resultado;
  int enfrentamiento=0;
//insertamos las 15 filas
  System.out.println("Nº ENFRENTAMIENTO:   |  APUESTA  |");
  
  for(int fila=1; fila<=15; fila++){
    
    enfrentamiento++;
    if(enfrentamiento>9){
      System.out.printf("Enfrentamiento "+enfrentamiento+"    |");
      }else{
        System.out.printf("Enfrentamiento "+enfrentamiento+"     |");
        }
    
    for(int apuesta=1; apuesta<=columna; apuesta++){
      resultado=(int)(Math.random()*3)+1;
      switch(resultado){
        case 1:
          System.out.print("1  |");
        break;
        case 2:
          System.out.print("  2|");
        break;
        case 3:
          System.out.print(" X |");
        default:
      }
    }
    System.out.println();
  }
}}
