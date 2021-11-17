public class Ej04ArrayAleatCuadradoCubo{
public static void main(String[]args){
  
  int[]numero=new int[20];
  int[]cuadrado=new int[20];
  int[]cubo=new int[20];
  int i=0;
  
  System.out.println("┌──────┬──────┬────────┐");
  System.out.println("│  Nº  │  ^2  │   ^3   │");
  System.out.println("├──────┼──────┼────────┤");
  
  for(i=0; i<20; i++){
    numero[i]=(int)(Math.random()*101);
    
    cubo[i]=numero[i]*numero[i]*numero[i];
    cuadrado[i]=numero[i]*numero[i];
    
    //PARA AJUSTAR LOS ESPACIOS
    System.out.printf("│%5d │%5d │%7d │\n",numero[i],cuadrado[i],cubo[i]);
  }
  System.out.println("└──────┴──────┴────────┘");
}}
