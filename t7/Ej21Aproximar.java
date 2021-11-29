public class Ej21Aproximar{
public static void main(String[]args){
  
  int numero[]=new int[15];
  boolean esmultiplo=false;
  
  System.out.println("Vamos a mostrar 15 nros aleatorios entre 0 y 500: ");
  
  //Creamos el Array
  for (int i = 0; i < 15; i++) {
    numero[i] = (int)(Math.random()*501);
  }
  
  //Pintamos el array inicial
  System.out.println("Array Original:");
  System.out.print("Indice: ");
  for (int i = 0; i < 15; i++){
    System.out.printf("%-4d", i);
  }
  System.out.println();
  System.out.print("Valor:  ");
  for(int i = 0; i < 15; i++){
    System.out.printf("%-4d", numero[i]);
  }
  
  //Si es múltiplo, le sumamos 1 hasta que sea múltiplo de 5, es decir, lo redondeamos
  for (int i = 0; i < 15; i++) {
    if(numero[i] % 5 == 0){
      esmultiplo = true;
    }else{
      do{
        numero[i]++;
      }while(numero[i] % 5 != 0);
    }
  }
  
  //Pintamos el array final
  System.out.println("\nArray Final:");
  System.out.print("Indice: ");
  for (int i = 0; i < 15; i++){
    System.out.printf("%-4d", i);
  }
  System.out.println();
  System.out.print("Valor:  ");
  for(int i = 0; i < 15; i++){
    System.out.printf("%-4d", numero[i]);
  }
  
  System.out.println();
}}
