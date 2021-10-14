public class Ej17{
public static void main(String[]args){
  System.out.print("Introduzca un número: ");
  int numero = Integer.parseInt(System.console().readLine());
  System.out.println("La última cifra del número es "+(numero%10));
}
}
