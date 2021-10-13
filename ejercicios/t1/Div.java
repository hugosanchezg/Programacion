public class Div {
  public static void main(String[] args) {
  int a,b;
  float resultado;
  
  System.out.println("Demostración de que java no sabe dividir \"bien\"");
  System.out.print("Introduzca dividendo: ");
  a = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca divisor: ");
  b = Integer.parseInt(System.console().readLine());
  resultado = a/(float)b;
  System.out.println("El resultado es: "+resultado);
  
  
  
}
}
