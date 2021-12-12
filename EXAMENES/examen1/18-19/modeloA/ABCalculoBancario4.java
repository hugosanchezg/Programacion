public class ABCalculoBancario4 {
  public static void main(String[] args) {
    double dineroInicial, dineroActual, rentabilidadMensual, dineroEsperado;
    int numeroMeses = 0;

    // Suponemos que el tipo de interés es compuesto

    System.out.print("Introduzca la cantidad inicial: ");
    dineroInicial = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la rentabilidad mensual (entendida como %, sin símbolo %): ");
    rentabilidadMensual = Double.parseDouble(System.console().readLine()) / 100;
    
    System.out.print("Introduzca la cantidad final esperada: ");
    dineroEsperado = Double.parseDouble(System.console().readLine());

    dineroActual = dineroInicial;

    while (dineroActual < dineroEsperado) {
      dineroActual += dineroInicial * rentabilidadMensual;
      numeroMeses++;
    }

    System.out.printf("Tardará %d meses en alcanzar %.2f €.", numeroMeses, dineroEsperado);
  }
}
