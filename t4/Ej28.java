import java.util.Scanner;
public class Ej28{
public static void main(String[]args){
  Scanner s = new Scanner(System.in);
  System.out.print("Jugador 1: ¿piedra, papel o tijera? ");
    String turno1 = s.nextLine();
  System.out.print("Jugador 2: ¿piedra, papel o tijera? ");
    String turno2 = s.nextLine();
  
  if(turno1.equals(turno2)){
    System.out.println("¡Habéis empatado!");
  }else{
    int resultado=2;
    switch(turno1){
    case"piedra":
      if(turno2.equals("tijera")){
        resultado=1;
        }
    break;
    case"papel":
      if(turno2.equals("piedra")){
        resultado=1;
        }
    break;
    case"tijera":
      if(turno2.equals("papel")){
        resultado=1;
        }
    break;
    default:
    }
  System.out.println("Gana el jugador número "+resultado+", enhorabuena!!!");
  }
}}
