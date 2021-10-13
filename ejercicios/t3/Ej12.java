public class Ej12{
  public static void main(String[]args){
  System.out.print("Introduce la nota del primer examen: ");
  double n1 = Double.parseDouble(System.console().readLine());
  System.out.print("Introduce la media deseada: ");
  double m = Double.parseDouble(System.console().readLine());
  double z = ((m-(n1*0.4))/0.6);
  
System.out.println("Para tener un " + m + " en el trimestre necesitas sacar un " + z + " en el segundo examen.");
}
}
