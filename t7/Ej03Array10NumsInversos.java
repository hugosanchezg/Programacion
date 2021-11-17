public class Ej03Array10NumsInversos{
public static void main(String[]args){
  
  int[]num=new int[10];
  int i=0;
  
  System.out.println("Array de 10 números introducidos en orden inverso.");
  System.out.println("Introduzca los 10 números:");
  
  for(i=0; i<10; i++){
    num[i]=Integer.parseInt(System.console().readLine());
  }
  
  System.out.println();
  
  for(i=9; i>=0; i--){
    System.out.println(num[i]);
  }
}}
