public class Ej15{
public static void main(String[]args){
  
  System.out.print("Introduzca la base de la potencia: ");
    double base=Double.parseDouble(System.console().readLine());
    
  System.out.print("Introduzca el exponente final de la potencia: ");
    int exponentefinal=Integer.parseInt(System.console().readLine());

    double resultado;
    int exponente;
    
//Hacemos un for en el que el exponente parta de 1 hasta el exponente introducido
  for(int i=1; i<=exponentefinal; i++){
    exponente=i;
    resultado=1;
  //Hacemos un for dentro para que vaya realizando las multiplicaciones
    for(int k=0; k<exponente; k++){
      resultado=resultado*base;
    }
  System.out.println(base+" ^ "+i+" = "+resultado);
  }
}}
