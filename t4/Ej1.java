public class Ej1{
  public static void main(String[] args){
    String dia;
    System.out.print("Introduzca el día para saber la 1ª asignatura: ");
    dia=(System.console().readLine());
    switch (dia) {
    case "lunes":
    System.out.println("Informatica");
    break;
    case "martes":
    System.out.println("Informatica");
    break;
    case "miercoles":
    System.out.println("Informatica");
    break;
    case "jueves":
    System.out.println("Informatica");
    break;
    case "viernes":
    System.out.println("Informatica");
    break;
    case "sabado":
    System.out.println("No hay clase");
    break;
    case "domingo":
    System.out.println("No hay clase");
    break;
    default:
    System.out.println("No conozco el día, escibe en minús. y sin tildes");
    
    
  }}}
