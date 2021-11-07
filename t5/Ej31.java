/*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. 
El programa pedirá la altura. El palo horizontal de la L tendrá una longitud de 
la mitad (división entera entre 2) de la altura más uno.*/
public class Ej31{
public static void main(String[]args){
  
  System.out.print("Introduzca la altura de la L: ");
    int altura=Integer.parseInt(System.console().readLine());

//*        ej: altura = 4
//*
//*
//* * * -> altura/2 +1
  
  int calculo=(altura/2)+1;

  for(int i=1; i<=altura-1; i++){
      System.out.println("*");
  }
    
  for(int i=0; i<calculo; i++){
      System.out.print("* ");
  }
    
}}
