public class Ej4{
  public static void main(String[]args){
    System.out.print("Introduzca horas trabajadas: ");
    int horas = Integer.parseInt(System.console().readLine());
    if(horas<=40){
      System.out.println("El salario sería: "+(horas*12)+" €");
    }
    if(horas>=41){
      System.out.println("El salario sería: "+(horas*16)+" €");
    }
}}
