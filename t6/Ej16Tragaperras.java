public class Ej16Tragaperras{
public static void main(String[]args){
  
  String figura1="";
  String figura2="";
  String figura3="";
  System.out.println("TRAGAPERRAS");
  
  int figuraAleat1=(int)(Math.random()*5);
  
  switch(figuraAleat1){
    case 0:
      figura1="corazón";
    break;
    case 1:
      figura1="diamante";
    break;
    case 2:
      figura1="herradura";
    break;
    case 3:
      figura1="campana";
    break;
    case 4:
      figura1="limón";
    break;
    default:
  }
    System.out.print(figura1);
    
  int figuraAleat2=(int)(Math.random()*5);
  
  switch(figuraAleat2){
    case 0:
      figura2="corazón";
    break;
    case 1:
      figura2="diamante";
    break;
    case 2:
      figura2="herradura";
    break;
    case 3:
      figura2="campana";
    break;
    case 4:
      figura2="limón";
    break;
    default:
  }
    System.out.print(" / "+figura2);
    
  int figuraAleat3=(int)(Math.random()*5);
  
  switch(figuraAleat3){
    case 0:
      figura3="corazón";
    break;
    case 1:
      figura3="diamante";
    break;
    case 2:
      figura3="herradura";
    break;
    case 3:
      figura3="campana";
    break;
    case 4:
      figura3="limón";
    break;
    default:
  }
    System.out.print(" / "+figura3);
    
  //Si todos son diferentes
  if(figura1!=figura2 && figura2!=figura3 && figura1!=figura3){
    System.out.println("\nLo siento, ha perdido.");
  }
  //Si todos son iguales
  if(figura1==figura2 && figura2==figura3){
    System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
  }
  //Si hay dos iguales
  if(figura1==figura2 && figura2!=figura3 || figura2==figura3 && figura1!=figura2 || figura1==figura3 && figura1!=figura2){
    System.out.println("\nBien, ha recuperado su moneda.");
  }
}}
