public class Ej05PosicMaxYMin{
  
  public static void main(String[]args){
  
    int[][] matriz = new int[6][10]; 
    int min=1001; // 1000, 900
    int max=-1;//4
    
    // rellenamos con números al azar y calculamos el mayor y el menor:
    for (int fila = 0; fila < 6; fila++){ // 0
      
      for (int columna = 0; columna < 10; columna++){ // 1
     
        int numeroazar = (int)(Math.random()*1001)+0; // 2, 4 
        
        matriz[ fila ][ columna ] = numeroazar;
        
        // vamos a calcular el número mínimo:
        if(numeroazar < min) {
          min = numeroazar;
        }
        
        if(numeroazar > max) {
          max = numeroazar;
        }
        
      }
      
      
    }
    
    // mostramos el contenido de la matriz:
    for(int j=0; j<6; j++){
      // dibujaba una línea
      for(int i=0; i<10; i++){
        System.out.print("\t " +matriz[j][i]);
        
      }
      System.out.println("");
    }
    
    System.out.println("El nº mín es "+min);
    System.out.println("El nº máx es "+max);
    
  }
  
}
