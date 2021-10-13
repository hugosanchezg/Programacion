public class Ej5{
public static void main(String[]args){
System.out.println("Vamos a resolver ax + b = 0");
  System.out.print("Introduzca el valor de a: ");
  Double a = Double.parseDouble(System.console().readLine());
  System.out.print("Introduzca el valor de b: ");
  Double b = Double.parseDouble(System.console().readLine());
  
  if(a==0){
    System.out.println("No tiene solución para a=0.");
  } else {
    System.out.println("x = "+(-b/a));
    }



}}
