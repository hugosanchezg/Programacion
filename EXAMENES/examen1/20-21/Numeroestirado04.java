public class NumeroEstirado04 {
  public static void main(String[] args) {
    int num, estiramiento, digito;
    String numEstirado = "";
    boolean error;

    do {
      System.out.print("Intruduzca el número positivo a ser estirado: ");
      num = Integer.parseInt(System.console().readLine());

      if (num < 0) {
        System.out.println("Ha introducido un valor negativo. Se considerará como positivo.");
        num *= -1;
      }

      error = num == 0;
      if (error) System.out.print("El número cero no vale. ");

    } while (error);

    do {
      System.out.print("Intruduzca el estiramiento: ");
      estiramiento = Integer.parseInt(System.console().readLine());

      error = estiramiento <= 0;

      if (error) System.out.print("No acepto estiramientos negativos ni nulos. ");

    } while (error);

    for (int i = num; i > 0; i /= 10) {
      digito = i % 10;
      for (int j = 0; j < estiramiento; j++) numEstirado = digito + numEstirado;
    }

    System.out.printf("El número %d estirado por %d es: %s \n", num, estiramiento, numEstirado);
  }
}
