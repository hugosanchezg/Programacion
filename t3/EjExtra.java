public class EjExtra{
  public static void main(String[] args) {
  String frase;
  System.out.print("Introduzca una frase:" );
  frase = System.console().readLine();
  System.out.print("La frase que recuerdo es:" +frase+ " -introduzca otra: ");
  frase = frase + (System.console().readLine());
  System.out.print("Las frases que recuerdo son: " +frase+ " -introduzca otra más: ");
  frase = frase + (System.console().readLine());
  System.out.print("Las frases que recuerdo son: " +frase + " -introduzca otra más: ");
  frase = frase + (System.console().readLine());
  System.out.print("Las frases que recuerdo son: " +frase + " -introduzca otra más: ");
  frase = frase + (System.console().readLine());
  }
}
