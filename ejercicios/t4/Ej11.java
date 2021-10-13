public class Ej11{
  public static void main(String[]args){
    System.out.print("PROCEDE A INTRODUCIR UNA HORA DESEADA ");
    System.out.println("Primero se le pedirá la hora y luego los minutos.");
    System.out.print("hora: ");
      int hora=Integer.parseInt(System.console().readLine());
    System.out.print("minuto: ");
      int minuto=Integer.parseInt(System.console().readLine());
      int segundosTranscurridos=(hora*3600)+(minuto*60);
      int segundosHastaMedianoche=(24*3600)-segundosTranscurridos;
    System.out.println("Desde las " + hora + " " + minuto + " hasta la medianoche faltan " +segundosHastaMedianoche+" segundos.");
}}
