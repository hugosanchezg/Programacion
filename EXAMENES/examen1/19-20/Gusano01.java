public class Gusano01 {
  public static void main(String[] args) {
    char entrada = 'k';
    int espacios = 0;

    System.out.println("Este programa dibuja un gusano en la pantalla.");
    System.out.println("Controles: j=abajo-izquierda // k=abajo // l=abajo-derecha (seguido de ENTER)");
    System.out.println("Para salir, introduzca 's'");

    do {
      switch (entrada) {
        case 'l':
          if (espacios < 10) espacios++;
          break;
        case 'j':
          if (espacios > 0) espacios--;
          break;
        default:
      }

      for (int i = 0; i < espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("*");

      for (int i = espacios; i <= 20; i++) {
        System.out.print(" ");
      }
      
      System.out.print("¿j,k,l,s?: ");
      entrada = System.console().readLine().charAt(0);

    } while (entrada != 's');
  }
}
