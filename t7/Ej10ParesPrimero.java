public class Ej10ParesPrimero{
public static void main(String[]args){
  
  int[]numero=new int[20];
  int[]par=new int[20];
  int[]impar=new int[20];
  int parestotales=0;
  int impartotales=0;
  int i=0;
  
  System.out.println("Se va a generar un Array aleatorio, que después se va a ordenar");
  System.out.println("estando primero los pares y después los impares");
  
  //Creamos los 20 nums aleatorios y los asignamos a dos arrays diferentes (pares e impares)
  for(i=0; i<20; i++){
    numero[i]=(int)(Math.random()*101);
    if(numero[i]%2==0){
      par[parestotales++]=numero[i];
    }else{
        impar[impartotales++]=numero[i];
      }
  }
  
  //Mostramos los números aleatorios
  for(i=0; i<20; i++){
    System.out.print(numero[i]+" ");
  }
  
  System.out.println();
  
  //Metemos los pares primero en el array de números
  for(i=0; i<parestotales; i++){
    numero[i]=par[i];
  }
  
  //Metemos los impares en los huecos que no sean los pares
  for(i=parestotales; i<20; i++){
    numero[i]=impar[i-parestotales];
  }

  System.out.println("Resultado con los pares primero:");
  
  for(i=0;i<20;i++){
    System.out.print(numero[i]+" ");
  }
}}
