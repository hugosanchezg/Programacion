public class Ej7BuscarTesoro {
  public static void main(String[] args) {
    
    final int nada = 0;
    final int mina = 1;
    final int tesoro = 2;
    final int intento = 3;

    int x;
    int y;
    int[][] tablero = new int[5][4];
    
    // creamos el array con todo vacío de 5*4
    for (x = 0; x < 4; x++) {
      for (y = 0; y < 3; y++) {
        tablero[x][y] = nada;
      }
    }
    
    // coloca la mina en una posicion random
    int minaX = (int) (Math.random() * 5);
    int minaY = (int) (Math.random() * 4);
    tablero[ minaX ][ minaY ] = mina;
    
    // coloca el tesoro en una posición random que no coincida con la de la mina
    int tesoroX;
    int tesoroY;
    do {
      
      tesoroX = (int) (Math.random() * 5);
      tesoroY = (int) (Math.random() * 4);
    
    } while ((minaX == tesoroX) && (minaY == tesoroY));
     //-definimos el tesoro en esa posición
    tablero[ tesoroX ][ tesoroY ] = tesoro;
    
    
    
    System.out.println("JUEGO BUSCA EL TESORO");
    System.out.println("¿Serás capaz de encontrar el tesoro de una?");
    boolean encontrado = false;
    
    do {
      
      // pintamos el tablero
      for (y = 3; y >= 0; y--) {
        
        System.out.print(y + "|");
        
        for (x = 0; x < 5; x++) {
          
          //
          if (tablero[x][y] == intento) {
            System.out.print("X ");
          } else {
            System.out.print(" ");
          }
          
        }
        
        System.out.println();
        
      }
      System.out.println(" └—————————\n  01234\n");
      
      //pedimos donde quiere probar
      System.out.print("Intoduce la coordenada x: ");
        x = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce la coordenada y: ");
        y = Integer.parseInt(System.console().readLine());
      
      //comprobamos lo que hay en las coordenadas introducidas al jugador
      switch (tablero[x][y]) {
        //en caso de que no haya nada
        case nada:
          tablero[x][y] = intento;
          
          //si la mina estña a menos de dos casillas de la posición, avisa
          if ((Math.abs(x - minaX) < 2 ) && (Math.abs(y - minaY) < 2)){
            System.out.println("Cuidado, tienes una mina al lado");
          }
        break;
        //en caso de que haya una mina
        case mina:
          System.out.println("¡BOM! te has topado con una mina");
          encontrado = true;
        break;
        case tesoro:
          System.out.println("Has encontrado el tesoro!!!");
          encontrado = true;
        break;
        default:
      }
      
    }while (encontrado = false);
    
    String caracter = "";
    
    // pintamos el tablero
    for (y = 3; y >= 0; y--) {
      System.out.print(y + "|");
      
      for (x = 0; x < 5; x++) {
        switch (tablero[x][y]) {
          case nada:
            caracter = " ";
          break;
          case mina:
            caracter = "! ";
          break;
          case tesoro:
            caracter = "€ ";
            break;
          case intento:
            caracter = "X ";
          break;
          default:
        }
        System.out.print(caracter);
      }
      System.out.println();
    }
    System.out.println(" └—————————\n  01234\n");
  }
}
