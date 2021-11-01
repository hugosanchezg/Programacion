public class Ej17{
public static void main(String[]args){
  
  int resultado=0;
  
  System.out.print("Introduzca el número: ");
  int numero=Math.abs(Integer.parseInt(System.console().readLine()));
  //Aplicamos "Math.abs()" para segurarnos (como se nos pide) de que el total salga positivo
  
  for(int i=numero; i<=numero+99; i++){
    resultado=resultado+i;
  }
  System.out.println("El resultado es "+resultado);
}}
