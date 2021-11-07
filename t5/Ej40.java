public class Ej40{
public static void main(String[] args){

  int huecosexteriores=0;
  int huecosinteriores=-1;
  
  System.out.print("Vamos a construir un rombo");
  System.out.print("Introduce la altura (numero impar mayor que 3): ");
  int altura=Integer.parseInt(System.console().readLine());

  huecosexteriores=altura/2;
    for(int i=1; i<=altura; i++){
      for(int j=0; j<huecosexteriores; j++){
        System.out.print(" ");
      }
      
      System.out.print("*");

      for(int j=1; j<=huecosinteriores; j++){
        System.out.print(" ");
      }

      if ((i!=1)&&(i!=altura)){
        System.out.print("*");
      }

      System.out.println();

      if (i<((altura / 2)+1)){   
        huecosexteriores--;
        huecosinteriores=huecosinteriores+2;
      }else{
        huecosexteriores++;
        huecosinteriores=huecosinteriores-2;
      }
    }
}}
