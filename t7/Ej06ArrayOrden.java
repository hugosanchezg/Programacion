public class Ej06ArrayOrden{
public static void main(String[] args) {

  int aux;
  int[] lista = new int[15];
  
  System.out.println("Array de 15 números rotando su orden");
  System.out.println("Introduzca los 15 números:");
  
  for (int i=0; i<15; i++){
    lista[i]=Integer.parseInt(System.console().readLine());
  }

  aux = lista[14];

  for (int i = 14; i > 0; i--){
    lista[i] = lista[i - 1];
  }
    
  lista[0] = aux;
  
  System.out.println();
  
  for (int i = 0; i < 15; i++){
    System.out.println(lista[i]);
  }
  
}}
