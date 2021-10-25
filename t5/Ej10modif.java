//Escribe un programa que calcule la media de un conjunto de números positivos
//introducidos por teclado. El usuario indicará cuántos nº va a introducir.

public class Ej10modif{
public static void main(String[]args){
  double suma=0;
  double resultado=0;
  
  System.out.print("¿Cuántos números vas a introducir?: ");
  double numerosdados=Double.parseDouble(System.console().readLine());

  for(int i=0; i<numerosdados; i++){
    System.out.print("¿De cuál número quieres hacer la media?: ");
    double numeros=Double.parseDouble(System.console().readLine());
    suma=numeros+suma;
  }
  
  resultado=suma/numerosdados;
  System.out.println("La media de las notas es: "+(resultado));
  
}}
