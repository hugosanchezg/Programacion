public class Ej17NumEnArrayYRotar{
public static void main(String[]args){
  
  int[] numero = new int[20];
  int i = 0;
  int opcion = 0;
  boolean siEsta = false;
  System.out.println("Se van a crear 10 nums aleatorios del 0 al 100: ");
  
  for(i = 0; i < 10; i++){
    numero[i] = (int)(Math.random()*100);
  }
  
  //Pintamos el array inicial
  System.out.print("Indice: ");
  for (i = 0; i < 10; i++){
    System.out.printf("%-4d", i);
  }
  System.out.println();

  System.out.print("Valor:  ");
  for(i = 0; i < 10; i++){
    System.out.printf("%-4d", numero[i]);
  }
  
  //Pedimos el número hasta que coincida con uno del Array
  do{
    System.out.print("\nDime un número: ");
    opcion = Integer.parseInt(System.console().readLine());
    for(int estenumero : numero){
      if(opcion == estenumero){
        siEsta = true;
      }
    }
  }while(!siEsta);
  
  //Rotar el Array hacia la derecha hasta que el número introducido esté en la posición 0 del Array
  while(numero[0] != opcion){
    int aux = numero[9];
    //Rotación a la derecha
    for(i = 9; i>0; i--){
      numero[i] = numero[i-1];
    }
    numero[0]=aux;
  }
  
  //Pintamos el array final rotado
  System.out.print("Indice: ");
  for (i = 0; i < 10; i++){
    System.out.printf("%-4d", i);
  }
  System.out.println();

  System.out.print("Valor:  ");
  for(i = 0; i < 10; i++){
    System.out.printf("%-4d", numero[i]);
  }
}}
