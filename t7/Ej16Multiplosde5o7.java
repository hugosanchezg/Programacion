public class Ej16Multiplosde5o7{
public static void main(String[]args){
  
  int[] numero=new int[20];
  int[] multiplo5=new int[20];
  int[] multiplo7=new int[20];
  int i=0;
  int contadormultiplos5=0;
  int contadormultiplos7=0;
  
  System.out.println("Se van a crear 20 nums aleatorios del 0 al 400: ");
  
  for(i=0; i<20; i++){
    numero[i]=(int)(Math.random()*400);
    System.out.print(numero[i]+" ");
  }
  
  System.out.println("\n¿Quieres resaltar los múltiplos de 5 (introduce 5) o los de 7 (introduce 7)? ");
    int opcion=Integer.parseInt(System.console().readLine());
    
    
  if(opcion!=7 && opcion!=5){
    System.out.println("Has seleccionado mal");
  }else{
      for(i=0; i<20; i++){
        if(numero[i]%opcion==0){
          System.out.print(numero[i]+" ");
        }
      }
    }
}}
