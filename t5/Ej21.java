public class Ej21{
public static void main(String[]args){
  
  int numero;
  int suma=0;
  int media=0;
  int pargrande=0;
  int numerosimpares=0;
  
  System.out.println("-Este programa te va a pedir números y finalizará cuando se \nintroduzca un número negativo.");
  System.out.println("-Después, dirá la media de los impares y mostrará el mayor \nde los pares.");
  
  do{
  
  System.out.print("Introduzca los números: ");
    numero=Integer.parseInt(System.console().readLine());

//si el número es par
    if((numero%2)==0){
      if(numero>pargrande){
        pargrande=numero;
      }
//si el número es impar
    }else{
      suma=numero+suma;
      numerosimpares++;
      media=suma/numerosimpares;
      }
      
  }while(numero>=0);
  
  System.out.println("La media de los números impares es: "+media);
  System.out.println("El par introducido más grande es: "+pargrande);
  
}}
