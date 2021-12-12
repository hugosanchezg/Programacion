public class A3PiramideDeLadoHueca {
  public static void main(String[] args) {
    int altura;
    int asteriscos = 0;
    boolean error;

    do {
      System.out.print("Introduzca la altura de la pirámide (3-30): ");
      altura = Integer.parseInt(System.console().readLine());

      error = altura < 3 || altura > 30;

      if (error) System.out.print("Valor incorrecto. ");
    } while (error);

    for (int i = 0; i < altura * 2 - 1; i++) {
      asteriscos += i < altura ? 1 : -1;
      for (int j = 0; j < asteriscos; j++) {
        if (j == 0 || j == asteriscos - 1) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
