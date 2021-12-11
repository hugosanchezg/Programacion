public class Ej08Alfil {
  public static void main(String[] args) {
    
    int alfil, fila, columna;

    int [][] comprobador = new int [8][8];

    System.out.print("Introduzca la coordenada del alfil: ");
    alfil = Integer.parseInt(System.console().readLine());

    fila = alfil % 10;
    fila /= 10;
    columna = alfil % 10;

    for (int i = 0; i < 8 ; i++){
      for (int j = 0 ; j < 8 ; j++){
        if((i /= fila && j /= columna))
      }
    }
  }
}
