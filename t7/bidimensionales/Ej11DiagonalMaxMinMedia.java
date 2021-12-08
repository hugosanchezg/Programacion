/*
  1. Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas
  2. Array relleno con números aleatorios entre 200 y 300. 
  3. El programa debe mostrar los números de la diagonal que va desde la esquina superior izquierda a 
  la esquina inferior derecha
  4. También el máximo, el mínimo y la media de los números que hay en esa diagonal.
*/
public class Ej11DiagonalMaxMinMedia{
public static void main(String[]args){
  
  int x = 10;
  int y = 10;
  int[][]numero = new int[x][y];
  
  int minimo = 300;
  int maximo = 200;
  int suma = 0;
  int media = 0;
  
  int[]numerodiagonal = new int[10];
  
  //1. creamos la matriz de 10 x 10
  for (x = 0; x < 10; x++){
    for (y = 0; y < 10; y++){
      
      int numeroazar = (int)(Math.random()*101)+200;
      numero[x][y] = numeroazar;
      
      //identificamos que numero esta en la diagonal
      if(x == y){
        numerodiagonal[x] = numero[x][y];
        
        //asignamos a los numeros que estan en la diagonal si son maximo o minimo
        if(numerodiagonal[x] < minimo) {
          minimo = numerodiagonal[x];
        }

        if(numerodiagonal[x] > maximo) {
          maximo = numerodiagonal[x];
        }
      }
      
      
      
    }
  }
  
  //mostramos la matriz
  for(x = 0; x < 10; x++){
    for(y = 0; y < 10; y++){
      
      System.out.print("\t " +numero[x][y]);
      
    }
      System.out.println("");
  }
  
  //mostramos los números que son de la diagonal:
  System.out.print("Los números de la diagonal son: ");
  for(x = 0; x < 10; x++){
    
    System.out.print(numerodiagonal[x]+" ");
    
    //hacemos la media
    suma = numerodiagonal[x] + suma;
    media = suma/10;
  }
  
  System.out.println("");
    
  System.out.println("El nº mín de la diagonal es "+minimo);
  System.out.println("El nº máx de la diagonal es "+maximo);
  System.out.println("La media de la diagonal es "+media);
  
}}
