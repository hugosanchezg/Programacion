public class Ej33{
public static void main(String[]args){
  
  System.out.print("Introduzca la altura de la U: ");
    int altura=Integer.parseInt(System.console().readLine());

//*        ej: altura = 4
//*
//*
//* * * -> altura/2 +1
  
  int calculo=(altura/2)+1;

  for(int i=1; i<altura; i++){
      System.out.print("*");
    
    for (int k = 0; k < altura; k++){
      System.out.print(" ");
    }
      
    System.out.println(" *");
  }
    
  for(int i=0; i<calculo; i++){
      System.out.print(" *");
  }
    
}}
