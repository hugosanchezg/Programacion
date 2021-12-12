/*
  [x]-El programa debe simular que nieva, en una pantalla de 23 filas por 60 columnas
  [x]-En la fila 10 y columna 20 de esa pantalla, deberá aparecer siempre “FELICES FIESTAS”.
*/
public class Ej02FelicesFiestas{
  public static void main(String[]args) throws InterruptedException{
  
    char [][] nieve = new char[23][60];
    char [][] arrayFinal = new char[23][60];
    
    //Rellenamos el array con espacios
    for (int i = 0; i < 23; i++) {
      for (int j = 0; j < 60; j++){
        nieve[i][j] = ' ';
      }
    }

    //Se imprime todo 23 veces, una para cada cambio
    for (int k = 0; k < 23; k++){
      
      //le vamos restando 1 a la i para
      for (int i = 22; i > 0; i--) {
        for (int j = 0; j < 60; j++){
          nieve[i][j] = nieve[i - 1][j];
        }
      }
      
      //Creamos la nieve aleatoria que surge en la fila 0, por eso sólo utilizamos el bucle de las columnas
      for (int j = 0; j < 60; j++){
        
        int nieveAleatoria = (int) (Math.random() * 15);
        
        //Si la nieve aleat es igual a cualquier valor de los 15
        if(nieveAleatoria == 5){
          
          nieve[0][j] = '*';
          
        }else{
          
          nieve[0][j] = ' ';
          
        }
        
      }
      
      //igualamos el array final al de la nieve y añadimos 'felices fiestas'
      for (int i = 0; i < 23; i++) {
        for (int j = 0; j < 60; j++){
          arrayFinal[i][j] = nieve[i][j];
        }
      }

      arrayFinal [10][20] = 'F';
      arrayFinal [10][21] = 'E';
      arrayFinal [10][22] = 'L';
      arrayFinal [10][23] = 'I';
      arrayFinal [10][24] = 'C';
      arrayFinal [10][25] = 'E';
      arrayFinal [10][26] = 'S';
      arrayFinal [10][27] = ' ';
      arrayFinal [10][28] = 'F';
      arrayFinal [10][29] = 'I';
      arrayFinal [10][30] = 'E';
      arrayFinal [10][31] = 'S';
      arrayFinal [10][32] = 'T';
      arrayFinal [10][33] = 'A';
      arrayFinal [10][34] = 'S';
      
      //mostramos el array final
      for (int i = 0; i < 23; i++) {
        for (int j = 0; j < 60; j++){
          System.out.print(arrayFinal[i][j]);
        }
        System.out.println();
      }

      
      //Añadimos un retardo
      Thread.sleep(800);
    }
  
  }
}
