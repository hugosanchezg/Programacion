public class Ej15{
public static void main(String[]args){
  System.out.print("Introduzca un carácter para la pirámide: ");
    String caract = System.console().readLine();
  System.out.println("Escriba el número de pirámide que desea");
  System.out.println("1: Con el vértice hacia arriba");
  System.out.println("2: Con el vértice hacia abajo");
  System.out.println("3: Con el vértice hacia la izquierda");
  System.out.println("4: Con el vértice hacia la derecha");
    int opcion =  Integer.parseInt(System.console().readLine());
  
  switch(opcion){
    case 1:
      System.out.println("  "+ caract);
      System.out.println(" "+ caract + caract + caract);
      System.out.println(caract + caract + caract + caract + caract);
      break;
    case 2:
      System.out.println(caract + caract + caract + caract + caract);
      System.out.println(" "+ caract + caract + caract );
      System.out.println("  "+ caract);
      break;
    case 3:
      System.out.println("    "+ caract);
      System.out.println("  "+ caract +" "+ caract);
      System.out.println(caract +" "+ caract +" "+ caract);
      System.out.println("  "+ caract +" "+ caract);
      System.out.println("    "+ caract);
      break;
    case 4:
      System.out.println(caract);
      System.out.println(caract +" "+ caract);
      System.out.println(caract +" "+ caract +" "+ caract);
      System.out.println(caract +" "+ caract);
      System.out.println(caract);
      break;
    default:
    }
  }
}
