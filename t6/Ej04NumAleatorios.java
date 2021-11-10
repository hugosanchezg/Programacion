//20 nºs aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
public class Ej04NumAleatorios{
public static void main(String[]args){
  
  int numero;

  System.out.println("Vamos a mostrar 20 nros aleatorios entre 0 y 10: ");

  for(int i=0; i<20; i++){
    numero=(int)(Math.random()*11);
    System.out.print(numero+" ");
  }

}}
