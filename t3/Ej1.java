public class Ej1{
  public static void main(String[]args){
    int n1;
    int n2;
    String linea;
  System.out.print("Introduce el primer número: ");
  linea = System.console().readLine();
  n1 = Integer.parseInt(linea);
  System.out.print("Introduce el segundo número: ");
  linea = System.console().readLine();
  n2 = Integer.parseInt(linea);
  
System.out.println(n1 +"*" +n2 +"=" +(n1 * n2));
}
}
