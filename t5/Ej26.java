public class Ej26{
public static void main(String[]args){
  
//Si meto 98125734 y digo el dígito 6 me diría que en la posicion 7
  System.out.print("Introduzca un número de los dígitos que quieras: ");
    int numero=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca un dígito para averiguar su posición: ");
    int digito=Integer.parseInt(System.console().readLine());
  
  System.out.print("El "+digito+" aparece en la(s) posicion(es): ");

//Para contarlo de izquierda a derecha, tenemos que hacer un volteado

  int volteado=0;
  int longitud=0;
  int posicion=1;
  
  if(numero==0){
    longitud=1;
  }
//Hacemos el volteado del número
  while(numero>0){
    volteado=(volteado*10)+(numero%10);
    numero/=10;
    longitud++;
  }
//Y averiguamos en la posición en la que está
  while(volteado>0){
    //Si el resto del volteado es igual al dígito, sabemos que lo ha encontrado
    if((volteado%10)==digito){
    System.out.print(posicion+"-");
  }
  
  volteado/=10;
  posicion++;
  
  }
  System.out.println();
  
}}
