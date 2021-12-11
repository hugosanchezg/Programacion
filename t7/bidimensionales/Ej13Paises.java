/*
  [x] - Realiza un programa que calcule la estatura media, mínima y máxima en centímetros de personas de diferentes países. 
  [x] - El array que contiene los nombres de los paises es el siguiente: pais = {“España”, “Rusia”, “Japón”,“Australia”}. 
  [x] - Los datos sobre las estaturas se deben simular mediante un array de 4 filas por 10 columnas con números aleatorios generados al azar entre 140 y 210. 
  [x] - Los nombres de los países se deben mostrar utilizando el array de países (no se pueden escribir directamente).
*/
public class Ej13Paises{
  public static void main(String[]args){
    
    //creamos el array de paises
    String[] pais = {"España","Rusia","Japón","Australia"};
    int[][] estaturas = new int[4][10];
    
    System.out.println("Las estaturas en cm son:");
  
    //Rellenamos aleatoriamente el array y lo mostramos
    for(int i = 0; i < 4; i++){
      System.out.printf("%-12s",pais[i]);
      for(int j = 0; j < 10; j++){
        
        estaturas[i][j] = (int)(Math.random()*(71))+140;
        System.out.printf(estaturas[i][j]+" ");
        
      }
      System.out.println();
    }
    
    int[] esMinimo = new int[4];
    int[] esMaximo = new int[4];
    int[] suma = new int[4];
    int[] media = new int[4];
    
    //Calculamos el mínimo, máximo y media
    int[] unaEstatura = new int[4];
    
    for(int numero_pais = 0; numero_pais < 4; numero_pais++){
      
      esMinimo[numero_pais] = 210;
      esMaximo[numero_pais] = 140;
      
      for(int j = 0; j < 10; j++){
        
        //nos quedamos con una estatura para cada país
        unaEstatura[numero_pais] = estaturas[ numero_pais ][j];
        
        //media
        suma[numero_pais] = unaEstatura[numero_pais] + suma[numero_pais];
        media[numero_pais] = suma[numero_pais] / 10;
        
        //max y min
        if(unaEstatura[numero_pais] < esMinimo[numero_pais]){
          esMinimo[numero_pais] = unaEstatura[numero_pais];
        }
        
        if(unaEstatura[numero_pais] > esMaximo[numero_pais]){
          esMaximo[numero_pais] = unaEstatura[numero_pais];
        }
        
      }
      
      //y los mostramos
      System.out.println(pais[ numero_pais ]+": ");
      System.out.println("-La media es "+media[numero_pais]);
      System.out.println("-El nº mín es "+esMinimo[numero_pais]);
      System.out.println("El nº máx es "+esMaximo[numero_pais]);
    }
    
  }
}
