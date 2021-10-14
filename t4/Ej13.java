public class Ej13{
public static void main(String[]args){
  int aux;
  System.out.println("Introduce los 3 números: ");
  int a=Integer.parseInt(System.console().readLine());
  int b=Integer.parseInt(System.console().readLine());
  int c=Integer.parseInt(System.console().readLine());
//dos primeros números
  if(a>b){aux=a;a=b;b=aux;}
//dos últimos números
  if(b>c){aux=b;b=c;c=aux;}
// se vuelven a ordenar los dos primeros
  if(a>b){aux=a;a=b;b=aux;}
  System.out.println("Los números introducidos ordenados de menor a mayor son "+a+", "+b+" y "+c+".");
  
}}
