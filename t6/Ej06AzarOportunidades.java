/*Escribe un programa que piense un número al azar entre 0 y 100. 
El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
Después de cada intento fallido, el programa dirá cuántas oportunidades 
quedan y si el número introducido esmenor o mayor que el número secreto.*/
public class Ej06AzarOportunidades{
public static void main(String[]args){
  
  int nintentos=5;
  int numeroAAcertar=0;
  
  System.out.println("El problema va a pensar un número entre el 0 y el 100.");
  System.out.println("Tienes 5 intentos para adivinar el número.");
  
  numeroAAcertar=(int)(Math.random()*101);
  
  do{
    System.out.print("-Adivina el número del 1 al 100: ");
      int numero=Integer.parseInt(System.console().readLine());
      
      nintentos--;
      
    if(numero==numeroAAcertar){
      System.out.println(+numero+": Has acertado el número!!!");
    }else{
      System.out.println(+numero+" no es el número. "+nintentos+" intentos restantes.");
      }
    
    if(nintentos==0){
      System.out.println("Lo siento! El programa ha acabado.");
    }
  }while(nintentos>0);

}}
