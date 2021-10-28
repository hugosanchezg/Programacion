//Escribe un programa que diga si un número introducido por teclado es o no primo.
//Un número primo es aquel que sólo es divisible entre él mismo y la unidad.
public class Ej16{
public static void main(String[]args){

  boolean primo=true;
  
  System.out.println("Te voy a decir si un número es primo");
  System.out.print("Introduzca el número: ");
  int numero=Math.abs(Integer.parseInt(System.console().readLine()));
  
  for(int i=2; i<numero; i++){
    if((numero%i)==0){
      primo=false;
    } 
  }
  if(primo==true){
    System.out.println("El número introducido es primo.");
  }else{
    System.out.println("El número introducido no es primo.");
    }
}}
