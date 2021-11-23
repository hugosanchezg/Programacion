public class Ej12Rotar2Posic{
public static void main(String[] args) {

  int numero[]=new int[10];
  int posicionInicial;
  int posicionFinal;
  int numeroInicial;
  int numeroFinal;
  
  System.out.println("Introduce los 10 números: ");
  
  for (int i = 0; i < 10; i++) {
    numero[i]=Integer.parseInt(System.console().readLine());
  }

  //Pintamos el array inicial
  System.out.print("Indice: ");
  for (int i = 0; i < 10; i++){
    System.out.printf("%-4d", i);
  }
  
  System.out.println();

  System.out.print("Valor:  ");
  for(int i = 0; i < 10; i++){
    System.out.printf("%-4d", numero[i]);
  }

  do{
    
    System.out.println();

    System.out.print("Introduce la posicion inicial: ");
    posicionInicial=Integer.parseInt(System.console().readLine());

    System.out.print("Introduce la posicion final: ");
    posicionFinal=Integer.parseInt(System.console().readLine());

  }while(posicionInicial<0 || posicionFinal<0 || posicionInicial>9 || posicionFinal>9 || posicionFinal<posicionInicial);

  numeroInicial=numero[posicionInicial];
  numeroFinal=numero[9];
    
  for(int i=9; i>0; i--) {
      
    if(i==posicionFinal){
      numero[i]=numeroInicial;
    }else if(!(i>posicionInicial && i<posicionFinal)){
        numero[i]=numero[i-1];
      }
  }

  numero[0]=numeroFinal;

  //Array Final
  System.out.println();

  System.out.print("Indice: ");
  for(int i=0; i<10; i++){
    System.out.printf("%-4d", i);
  }
  
  System.out.println();

  System.out.print("Valor:  ");
  for(int i=0; i<10; i++){
    System.out.printf("%-4d", numero[i]);
  }
  
}}
