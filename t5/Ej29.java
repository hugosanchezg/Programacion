public class Ej29{
public static void main(String[]args){

/*Escribe un programa que muestre por pantalla todos los números enteros
positivos menores a uno leído por teclado que no sean divisibles entre otro
también leído de igual forma.*/

  System.out.println("Te mostraré todos los números menores a uno introducido\ny que no sean divisibles entre otro nº introducido");
  System.out.print("Introduzca el número1: ");
    int numero1=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el número2: ");
    int numero2=Integer.parseInt(System.console().readLine());
  
  System.out.println("Los números menores que "+numero1+" y NO divisibles entre "+numero2+" son:");

//números menores desde el 1 hasta el número introducido
  for(int i=1; i<=numero1; i++){
  //Si el número no es divisible entre numero2 se muestra
    if((i%numero2)!=0){
      System.out.print(i+" ");
    }
  }
  
}}
