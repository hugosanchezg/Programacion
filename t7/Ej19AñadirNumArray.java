public class Ej19AñadirNumArray{
public static void main(String[] args) {
  
  int numero[]=new int[12];
  int posicionNumero;
  int numeroIntroducido;
  
  System.out.println("Se va a generar un Array Aleatorio de 12 números: ");
  
  for (int i = 0; i < 12; i++) {
    numero[i] = (int)(Math.random()*201);
  }
  
  //Pintamos el array inicial
  System.out.print("Indice: ");
  for (int i = 0; i < 12; i++){
    System.out.printf("%-4d", i);
  }
  
  System.out.println();

  System.out.print("Valor:  ");
  for(int i = 0; i < 12; i++){
    System.out.printf("%-4d", numero[i]);
  }
  
  System.out.print("\nIntroduce el número que quieres introducir en el Array: ");
  numeroIntroducido=Integer.parseInt(System.console().readLine());

  System.out.print("Introduce la posicion en la que intrducirla: ");
  posicionNumero=Integer.parseInt(System.console().readLine());
  
  //Rota las posiciones hacia la derecha
  for(int i = 11; i>0; i--){
    numero[i] = numero[i-1];
  }
  
  numero[posicionNumero]=numeroIntroducido;
  
  //Array Final
  System.out.println();

  System.out.print("Indice: ");
  for(int i=0; i<12; i++){
    System.out.printf("%-4d", i);
  }
  
  System.out.println();

  System.out.print("Valor:  ");
  for(int i=0; i<12; i++){
    System.out.printf("%-4d", numero[i]);
  }
  
}}
