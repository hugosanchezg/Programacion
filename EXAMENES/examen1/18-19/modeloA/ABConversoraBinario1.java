public class ABConversoraBinario1 {
  public static void main(String[] args) {
    int num;
    String numeroBooleano = "";
    boolean error;

    do {
      System.out.print("Introduzca un número (0-9999): ");
      num = Integer.parseInt(System.console().readLine());

      error = num < 0 || num > 9999;
      if (error) System.out.print("Valor incorrecto. ");

    } while (error);

    int aux = num;

    do {
      numeroBooleano = aux % 2 + numeroBooleano;

      aux /= 2;
    } while (aux != 0);

    System.out.printf("El número %d en binario es: %s\n", num, numeroBooleano);
  }
}
