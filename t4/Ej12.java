public class Ej12{
public static void main(String[]args){
  int puntos=0;
  String respuesta;
    System.out.println("CUESTIONARIO DE 1º DAW");
  System.out.println("1. ¿Qué lenguaje utilizamos en Programación?");
    System.out.println("a) python b) java  c) float");
    System.out.print("¿Cuál? ");
      respuesta=System.console().readLine();
      if(respuesta.equals("b")){puntos++;}
  System.out.println("2. ¿Cuál es el lenguaje que utilizamos en base de datos?");
    System.out.println("a) XML  b) SELECT  c) SQL");
    System.out.print("=> ");
      respuesta=System.console().readLine();
      if(respuesta.equals("c")){puntos++;}
    System.out.println("3. En qué formato trabajamos en Visual Code");
    System.out.println("a) href  b) html  c) link");
    System.out.print("=> ");
      respuesta=System.console().readLine();
      if(respuesta.equals("b")){puntos++;}
    System.out.println("4. ¿Dónde tenemos almacenados nuestros repositorios?");
    System.out.println("a) Git Hub  b) Classroom c) Teams");
    System.out.print("=> ");
      respuesta=System.console().readLine();
      if(respuesta.equals("a")){puntos++;}
    System.out.println("HAS CONSEGUIDO "+puntos+" PUNTOS!!!");
  
  } 
}
