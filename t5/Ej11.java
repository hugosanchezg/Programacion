public class Ej11{
public static void main(String[]args){
  
  System.out.print("¿Desde cuál número quieres hacer el cuadrado y el cubo?: ");
    int numero=Integer.parseInt(System.console().readLine());
  System.out.println("   |nº:|  |e2:|  |e3:|    ");
  for(int i=numero; i<numero+5; i++){
    System.out.println("   | "+i+"|   |"+(i*i)+" |   | "+(i*i*i)+"|");
  }
}}
