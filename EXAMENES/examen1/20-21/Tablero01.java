public class Tablero01 {
  public static void main(String[] args) {
    int filas, columnas;
    boolean error;

    do {
      System.out.print("Introduzca el número de filas (1-20): ");
      filas = Integer.parseInt(System.console().readLine());

      error = filas < 1 || filas > 20;
      if (error) System.out.print("Valor fuera de rango. ");
    } while(error);

    do {
      System.out.print("Introduzca el número de columnas (1-20): ");
      columnas = Integer.parseInt(System.console().readLine());

      error = columnas < 1 || columnas > 20;
      if (error) System.out.print("Valor fuera de rango. ");
    } while (error);

    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) System.out.print((i + j) % 2 == 0 ? "██" : "  ");
      System.out.println();
    }
  }
}
