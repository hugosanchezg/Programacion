public class Ej06MaxMinNoRepetidos{
  
  public static void main(String[]args){
  
    int[][] matriz = new int[6][10]; 
    int min=1001;
    int max=-1;
    boolean repetido = false;
    
    
    for (int fila = 0; fila < 6; fila++){
      
      for (int columna = 0; columna < 10; columna++){
        
        do{
          
          int numeroazar = (int)(Math.random()*1001)+0;
        
          matriz[ fila ][ columna ] = numeroazar;
          
          //le damos otra vuelta a la matriz y si es igual está repetida
          for(int k = 0; k < fila; k++){
            for(int l = 0; l < columna; l++){
              if(matriz[fila][columna] == matriz[k][l]){
                repetido = true;
              }else{
                repetido = false;
              }
            }
          } 
          
          //identificamos el max y min
          if(matriz[fila][columna] < min) {
            min = numeroazar;
          }
          
          if(matriz[fila][columna] > max) {
            max = numeroazar;
          }
          
        }while(repetido==true);
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
