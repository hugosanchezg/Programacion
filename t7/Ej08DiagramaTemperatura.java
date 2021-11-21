public class Ej08DiagramaTemperatura{
public static void main(String[]args){
  
  int[]temperatura=new int[13];
  int i=0;
  int mes=1;
  
  System.out.println("Vas a introducir la temperatura media de cada mes.");
  
  //PIDE LOS MESES
  for(i=1; i<13; i++){
    System.out.print("Temperatura del mes "+i+": ");
    temperatura[i]=Integer.parseInt(System.console().readLine());
  }
  
  System.out.println();
    
  //PINTA LOS MESES
  for(i=1; i<13; i++){
    if(mes<10){
      System.out.print("Mes "+mes+"  ");
    }else{
        System.out.print("Mes "+mes+" ");
      }
      
    for(int j=0; j<temperatura[i]; j++){
        System.out.print("#");
    }
    
    ++mes;
    System.out.println();
  }
  System.out.print("----------------temperatura");
}}
