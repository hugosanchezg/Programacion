public class Ej30 {
public static void main(String[] args) {
    
    System.out.print("Introduzca el primer día que quieras, sabiendo que\nLunes sería 1, Martes 2, Domingo 7, etc): ");
    int dia1=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la hora del primer día (formato 24hrs): ");
    int hora1=Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca el segundo día que quieras (1-7): ");
    int dia2=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la hora del segundo día (formato 24hrs): ");
    int hora2=Integer.parseInt(System.console().readLine());

    int sumahoras=0;

    if (dia1<dia2 || hora1<=hora2) {
      for (int i = dia1; i < dia2; i++) {
        sumahoras=sumahoras+24;
      }
  
      for (int i = hora1; i < hora2; i++) {
        sumahoras=sumahoras+1;
      }
  
      System.out.println("-Entre las "+hora1+":00 del día "+dia1+" y\n las "+hora2+":00 del día "+dia2+" hay "+sumahoras+" horas.");

    }else System.out.println("Has introducido los datos mal!!!");
  }
}
