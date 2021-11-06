public class Ej27{
public static void main(String[]args){

  System.out.println("Te mostraré, contaré y sumaré los múltiplos de 3 que hay\n entre 1 y el número que desees.");
  System.out.print("Introduzca el número: ");
    int numero=Integer.parseInt(System.console().readLine());

  int cuantoshay=0;
  int sumatotal=0;
  
  for(int i=1; i<=numero;i++){
    //Para averiguar los múltiplos de 3
    if((i%3)==0){
      System.out.print(i+" ");
      cuantoshay++;
      sumatotal=sumatotal+i;
    }
  }
  
  System.out.println("\nDe 1 a "+numero+" hay "+cuantoshay+" múltiplos de 3");
  System.out.println("En total suman "+sumatotal);
}}
