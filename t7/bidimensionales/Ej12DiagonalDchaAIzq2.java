/*
  1. [x] Array de 9 filas por 9 columnas relleno con números aleatorios entre 500 y 900.
  2. [x] Debe mostrar los números de la diagonal que va desde la esquina inferior izquierda.
  3. [x] El máximo, el mínimo y la media de los números que hay en esa diagonal.
*/
public class Ej12DiagonalDchaAIzq2{
  public static void main(String[]args){
    
    int total_filas = 9;
    int total_columna = 9;
    int[][] numero = new int[total_filas][total_columna];
    
    int minimo = 900;
    int maximo = 500;
    int media = 0;
    int mediafinal = 0;
    
    int[][]numerodiagonal = new int[10][10];
    
    //1. creamos la matriz de 9 x 9
    for (total_filas = 0; total_filas < 9; total_filas++){
      for (total_columna = 0; total_columna < 9; total_columna++){
        
        int numeroazar = (int)(Math.random()*401)+500;
        numero[total_filas][total_columna] = numeroazar;
        
        //asignamos a los numeros que estan en la diagonal si son maximo o minimo
        if(numerodiagonal[total_filas][total_columna] < minimo) {
          minimo = numerodiagonal[total_filas][total_columna];
        }

        if(numerodiagonal[total_filas][total_columna] > maximo) {
          maximo = numerodiagonal[total_filas][total_columna];
        }
      }
    }
    
    int fila=0;
    
    for (int columna = 8; columna >= 0; columna--){
      numerodiagonal[fila][columna] = numero[fila][columna];
      fila++;
    }
      
    //mostramos la matriz
    for(int x = 0; x < 9; x++){
      for(int y = 0; y < 9; y++){
        
        System.out.print("\t " +numero[x][y]);
        
      }
        System.out.println("");
    }
    
    //mostramos los números que son de la diagonal:
    System.out.print("Los números de la diagonal son: ");
    for(int x = 0; x < 9; x++){
      for(int y = 0; y < 9; y++){
        System.out.print(numerodiagonal[x][y]+" ");
        
        //hacemos la media
        media = numerodiagonal[x][y] + media;
        mediafinal = media/9;
      }
    }
    
    System.out.println("");
      
    System.out.println("El nº mín de la diagonal es "+minimo);
    System.out.println("El nº máx de la diagonal es "+maximo);
    System.out.println("La media de la diagonal es "+mediafinal);
    
  }
}
