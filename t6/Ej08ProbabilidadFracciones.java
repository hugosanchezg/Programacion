public class Ej08ProbabilidadFracciones{
public static void main(String[]args){
//Probabilidad de 1: 3/6, probabilidad de X: 2/6 y probabilidad de 2: 1/6. 
  int columna=3;
  int resultado;
  int enfrentamiento=0;

  System.out.println("Nº ENFRENTAMIENTO:   |  APUESTA  |");
  
  for(int fila=1; fila<=15; fila++){
    
    enfrentamiento++;
    if(enfrentamiento>9){
      System.out.printf("Enfrentamiento "+enfrentamiento+"    |");
      }else{
        System.out.printf("Enfrentamiento "+enfrentamiento+"     |");
        }
    
    for(int apuesta=1; apuesta<=columna; apuesta++){
      resultado=(int)(Math.random()*6)+1;
      switch(resultado){
        case 1:
        case 2:
        case 3:
          System.out.print("1  |");
        break;
        case 4:
        case 5:
          System.out.print(" X |");
        break;
        case 6:
          System.out.print("  2|");
        default:
      }
    }
    System.out.println();
  }
}}
