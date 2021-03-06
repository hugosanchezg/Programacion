public class Ej05PosicMaxYMin{
  
  public static void main(String[]args){
  
    int[][] matriz = new int[6][10]; 
    int min=1001;
    int max=-1;
    
  //Rellenamos con números al azar y calculamos el mayor y el menor:
    
    //-con este bucle damos 6 vueltas a las 10 de la columna
    for (int fila = 0; fila < 6; fila++){
      
      //-con este vamos asignando las columnas las columnas
      for (int columna = 0; columna < 10; columna++){
     
        int numeroazar = (int)(Math.random()*1001)+0;
        
        matriz[ fila ][ columna ] = numeroazar;
        
        // vamos a calcular el número mínimo y máximo:
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
