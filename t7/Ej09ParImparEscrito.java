public class Ej09ParImparEscrito{
public static void main(String[]args){
  
  int[]numero=new int[8];
  
  System.out.println("Introduce los 8 números:");
  
  for(int i=0; i<8; i++){
    numero[i]=Integer.parseInt(System.console().readLine());
  }
  
  for(int i=0; i<8; i++){
    System.out.print("\n"+numero[i]);
    
    if(numero[i]%2==0){
      System.out.print(" par");
    }else{
        System.out.print(" impar");
      }
    
  }
  
}}
