//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
public class Ej12{
public static void main(String[]args){
  System.out.println("Serie de Fibonacci:");
  
  int n=1;
  int nAnterior=0;
  int nIntroducido=0;
  
  System.out.print("Introduce el nº de primeros términos que quieres saber: ");
    nIntroducido=Integer.parseInt(System.console().readLine());

  if(nIntroducido>0){
    System.out.print(" 0 ");
  }
    
  if(nIntroducido==2){
    System.out.print(" 1 ");
  }
    
  if(nIntroducido>2){
    for (int i=1; i<nIntroducido; i++) {
      System.out.print(" "+n+" ");
      n=n+nAnterior;
      nAnterior=n-nAnterior;
    }
  }
}}
