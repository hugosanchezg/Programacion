//g = 9.81 m/s2
public class Ej6{
  public static void main(String[]args){
    System.out.print("Introduzca la altura en metros: ");
    
    Double h = Double.parseDouble(System.console().readLine());
    double s = Math.sqrt(2*h/9.81);
    System.out.printf("El objeto tarda "+s+" segundos en caer ");

}}
