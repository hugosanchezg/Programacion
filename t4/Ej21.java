public class Ej21{
public static void main(String[]args){
  System.out.print("¿Cuál es la nota del primer examen? ");
    double n1=Double.parseDouble(System.console().readLine());
  System.out.print("¿Cuál es la nota del segundo examen? ");
  double n2=Double.parseDouble(System.console().readLine());
  double nmedia=(n1+n2)/2;

//En caso de haber suspendido, preguntará si es apto o no en la recup.
  if(nmedia<5){
    System.out.print("¿Apto/no apto en la recuperación? ");
      String recuperacion=System.console().readLine();
    if(recuperacion.equals("apto")){
      nmedia=5;
      }
  }else{  //En el caso no haber suspendido, dará un mensaje de felicidades
    System.out.print("Muy bien!! Aprobaste!! ");
  }
  System.out.print("Okay!! Tu nota media es de un "+nmedia);
}}

