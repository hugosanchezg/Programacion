public class Ej23{
public static void main(String[]args){
  
  int numero;
  int suma=0;
  int totalnumeros=0;
  int media=0;
  
  
  System.out.println("Introduce una serie indeterminada de números");
  System.out.println("Si la suma de ellos supera el valor de 10000:");
  System.out.println("-El programa acabará.");
  System.out.println("-Se dirán el total de nº introducidos y su media.");
  System.out.println();
  
//Bucle para verificar que los números son distintos
  do{
    System.out.print("Introduzca un número: ");
    numero=Math.abs(Integer.parseInt(System.console().readLine()));
    suma=numero+suma;
    totalnumeros++;
    media=suma/totalnumeros;
  }while(suma<10000);

  System.out.println("Has introducido: "+totalnumeros+" números.");
  System.out.print("La media de los números es: "+media);
}}
