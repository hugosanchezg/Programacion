public class Ej05ArrayMaxMin{
public static void main(String[]args){
  
  int[]num=new int[10];
  int i=0;
  int minimo=Integer.MAX_VALUE;
  int maximo=Integer.MIN_VALUE;
  
  System.out.println("Array de 10 números indicando el máximo y el mínimo.");
  System.out.println("Introduzca los 10 números:");
  
  for(i=0; i<10; i++){
    num[i]=Integer.parseInt(System.console().readLine());
    
    if(num[i]>maximo){
      maximo=num[i];
    }
    if(num[i]<minimo){
      minimo=num[i];
    }
  }
  
  System.out.println();
  
  for(i=0; i<10; i++){
    System.out.print("\n"+num[i]);
    
    if(num[i]==maximo){
      System.out.print(" maximo");
    }
    
    if(num[i]==minimo){
      System.out.print(" minimo");
    }
    
  }
  
}}
