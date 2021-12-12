import java.util.Scanner;

public class VueltasNumero03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long num;
    int nCifras = 0;
    int desplazamiento, base, cifra;
    String direccionDesplazamiento;

    System.out.println("Este programa \"da vueltas\" a un número.");

    System.out.print("Introduzca un número: ");
    num = s.nextInt();

    for (long i = num; i > 0; i /= 10) nCifras++;
    base = (int) Math.pow(10, nCifras - 1);

    do {
      System.out.print("Introduzca el tipo de desplazamiento (izquierda, derecha; salir): ");
      direccionDesplazamiento = s.next();

      if (direccionDesplazamiento.equals("derecha") || direccionDesplazamiento.equals("izquierda")) {
        System.out.print("Introduzca la cantidad de cifras que desea desplazar: ");
        desplazamiento = s.nextInt();
  
        desplazamiento -= nCifras * (desplazamiento / nCifras);
        
        if (direccionDesplazamiento.equals("derecha")) {
          for (int i = 0; i < desplazamiento; i++) {
            cifra = (int) (num % 10);
            num = num / 10 + cifra * base;
          }
        } else {
          for (int i = 0; i < desplazamiento; i++) {
            cifra = (int) (num / base);
            num = (num - (cifra * base)) * 10 + cifra;
          }
        }
  
        System.out.println("El número resultante es: " + num);
      }
    } while (!direccionDesplazamiento.equals("salir"));

    s.close();

  }
}
