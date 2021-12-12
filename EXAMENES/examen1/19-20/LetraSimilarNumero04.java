public class LetraSimilarNumero04 {
  public static void main(String[] args) {
    long entrada;
    int cifra;
    char letra = 'x';
    String cadena;

    System.out.println("Este programa codifica números en \"letras similares\"");

    do {
      System.out.print("Introduzca un número entero (0 para salir): ");
      entrada = Long.parseLong(System.console().readLine());

      cadena = "";
      
      if (entrada != 0) {
        for (long i = entrada; i > 0; i /= 10) {
          cifra = (int) (i % 10);
          switch (cifra) {
            case 0: 
              letra = 'O';
              break;
            case 1: 
              letra = 'l';
              break;
            case 2: 
              letra = 'Z';
              break;
            case 3: 
              letra = 'E';
              break;
            case 4: 
              letra = 'A';
              break;
            case 5: 
              letra = 'S';
              break;
            case 6: 
              letra = 'b';
              break;
            case 7: 
              letra = 'J';
              break;
            case 8: 
              letra = 'B';
              break;
            case 9: 
              letra = 'g';
              break;
            default:
          }
  
          cadena = letra + cadena;
        }
        System.out.println("El valor codificado es: " + cadena);
      }
    } while (entrada != 0);
  }
}
