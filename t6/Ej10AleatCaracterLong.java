/*10 líneas formadas por caracteres. El carácter con el que se pinta cada línea 
se elige de forma aleatoria entre: *, -, =, ., |, @. 
Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.*/
public class Ej10AleatCaracterLong{
public static void main(String[]args){
  int caracter;
  int linea;
  String relleno="";
  
  for(int i=1; i<=10; i++){
    linea=(int)(Math.random()*40)+1;
    caracter=(int)(Math.random()*6)+1;
    
    switch(caracter){
      case 1:
        relleno="*";
      break;
      case 2:
        relleno="-";
      break;
      case 3:
        relleno="=";
      break;
      case 4:
        relleno=".";
      break;
      case 5:
        relleno="|";
      break;
      case 6:
        relleno="@";
      default:
        }
    for(int k=1; k<=linea; k++){
      System.out.print(relleno);
    }
  }System.out.println();
}}

