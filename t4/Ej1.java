public class Ej1{
  public static void main(String[] args){
    String dia;
    System.out.print("Introduzca el día para saber la 1ª asignatura: ");
    dia=(System.console().readLine());
    switch (dia) {
    case "lunes":
    System.out.println("LM");
    break;
    case "martes":
    System.out.println("EED");
    break;
    case "miercoles":
    System.out.println("LM");
    break;
    case "jueves":
    System.out.println("EED");
    break;
    case "viernes":
    System.out.println("FOL");
    break;
    case "sabado":
    System.out.println("No hay clase!!!");
    break;
    case "domingo":
    System.out.println("No hay clase!!!");
    break;
    default:
    System.out.println("Desconozco el día, por favor, escribe en minús. y sin tildes");
    
    
 }}}
