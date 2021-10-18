public class Ej22{
public static void main(String[]args){
  System.out.print("Dime un día de lunes a viernes sin tildes ni mayús.: ");
  String dia=System.console().readLine();
  int ndia=0;
  
  switch(dia){
    case "lunes":
      ndia=0;
      break;
    case "martes":
      ndia=1;
      break;
    case "miercoles":
      ndia=2;
      break;
    case"jueves":
      ndia=3;
      break;
    case"viernes":
      ndia=4;
      break;
    default:
      System.out.print("No entiendo el día que escribió, reinicie el programa");
  }
  System.out.print("Dime la hora: ");
    int hora=Integer.parseInt(System.console().readLine());
  System.out.print("Dime los minutos: ");
    int minuto=Integer.parseInt(System.console().readLine());
    int totalminuto=(4*24*60)+(15*60);
    int actualminutos=(ndia*24*60)+(hora*60)+minuto;
    int minsfaltan=(totalminuto-actualminutos);
  System.out.print("Para el finde faltan: "+minsfaltan+" minutos.");
}}
