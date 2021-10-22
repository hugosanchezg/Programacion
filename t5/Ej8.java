public class Ej8{
public static void main(String[]args){
  System.out.println("Te diré la tabla de multiplicar del nº que quieras");
  System.out.print("¿Cuál número quieres?: ");
  int numero=Integer.parseInt(System.console().readLine());
//Hacemos un for del 0 al 10 para que vaya multiplicando a cada uno de los valores
  for(int i=0;i<=10;i++){
    System.out.println(numero+" * "+i+" = "+(numero*i));
  }
}}
