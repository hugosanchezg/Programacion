public class PareImparInverso02 {
  public static void main(String[] args) {
    long num;
    long pares = 0;
    long impares = 0;
    int nCifras = 0;
    int digito;
    boolean tienePares = false;
    boolean tieneImpares = false;

    System.out.print("Introduzca un número largo positivo: ");
    num = Long.parseLong(System.console().readLine());

    for (long i = num; i > 0; i /= 10) nCifras++;

    for (int i = nCifras - 1; i >= 0; i--) {
      digito = (int) (num / Math.pow(10, i)) % 10;

      if (digito % 2 == 0) {
        tienePares = true;
        pares = pares * 10 + digito;
      }
    }

    for (long i = num; i > 0; i /= 10) {
      digito = (int) (i % 10);

      if (digito % 2 != 0) {
        tieneImpares = true;
        impares = impares * 10 + digito;
      }
    }

    if (tienePares) System.out.printf("Las cifras pares del número %d son: %d\n", num, pares);
    else System.out.printf("El número %d no tiene cifras pares\n", num);

    if (tieneImpares) System.out.printf("Las cifras impares del número %d son (en orden inverso): %d\n", num, impares);
    else System.out.printf("El número %d no tiene cifras impares\n", num);
  }
}
