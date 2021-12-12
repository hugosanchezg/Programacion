public class B2Romboide {
  public static void main(String[] args) {
    int altura;
    boolean error;

    do {
      System.out.print("Introduzca la altura del romboide (4-20): ");
      altura = Integer.parseInt(System.console().readLine());

      error = altura < 4 || altura > 20;

      if (error) System.out.print("Valor incorrecto. ");
    } while (error);

    for (int i = altura; i > 0; i--) {
      for (int j = 1; j < altura + i; j++) {
        if (j >= i && j <= altura + i) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
