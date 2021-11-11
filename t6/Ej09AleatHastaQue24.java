public class Ej09AleatHastaQue24{
public static void main(String[]args){
  int numero=0;
  int contadornumeros=0;
/*Realiza un programa que vaya generando pares entre 0 y 100 y termine si sale el 24. 
El programa deberá decir al final cuántos números se han generado*/
  do{
    numero=(int)(Math.random()*101);
    
    if(numero%2==0){
      System.out.print(numero+" ");
      contadornumeros++;
    }
    
  }while(numero!=24);
  
  System.out.println("\nSe han generado "+contadornumeros+" números.");
}}
