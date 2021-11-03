public class Ej18{
public static void main(String[]args){
  
  int numero1, numero2, mayor, menor;
  
  System.out.println("A continuación vas a introducir dos números DISTINTOS,");
  System.out.println("(se te seguirán pidiendo si los introduces iguales).");

//Bucle para verificar que los números son distintos
  do{
    System.out.print("Introduzca el primer número: ");
    numero1=Math.abs(Integer.parseInt(System.console().readLine()));
  
    System.out.print("Introduzca el segundo número: ");
    numero2=Math.abs(Integer.parseInt(System.console().readLine()));
    
  }while(numero1==numero2);

  if(numero1>numero2){
    mayor=numero1;
    menor=numero2;
  }else{
    menor=numero1;
    mayor=numero2;
    }
  
  for(int i=menor; i<=mayor; i+=7){
    System.out.print(i+" ");
  }
  
}}
