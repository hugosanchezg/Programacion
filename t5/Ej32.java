/*Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden,
de izquierda a derecha. Usa long en lugar para admitir números largos.*/
public class Ej32{
public static void main(String[]args){
  
  long digito;
  long alreves = 0;
  long suma = 0;
  
  System.out.print("Introduzca el número: ");
    long numero=Long.parseLong(System.console().readLine());
  System.out.print("Los digitos pares son ");

//Volteamos el nº para leerlo de "izquierda a derecha"
    while(numero>0){
      alreves=(alreves*10)+(numero%10);
      numero=numero/10;
    }

    while(alreves>0){
      digito=alreves%10;
      alreves=alreves/10;
      
      if (digito%2==0){
        System.out.print(digito+" ");
        suma=suma+digito;
      }
    }

    System.out.println();

    System.out.print("y entre ellos suman suman: "+suma);
  
}}
