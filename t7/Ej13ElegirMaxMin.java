public class Ej13ElegirMaxMin{
public static void main(String[]args){
  
  int numero[]=new int[100];
  int minimo=Integer.MAX_VALUE;
  int maximo=Integer.MIN_VALUE;
  int i;
  
  System.out.println("Vamos a mostrar 100 nros aleatorios: ");
  
  //Creamos aleat. e imprimimos el número y averiguamos cuál es máx y cual mín
  for(i=0; i<100; i++){
    numero[i]=(int)(Math.random()*500);
    System.out.print(numero[i]+" ");
    
    if(numero[i]>maximo){
      maximo=numero[i];
    }
    if(numero[i]<minimo){
      minimo=numero[i];
    }
  }
  
  //Preguntamos si quiere saber el máx o el mín
  System.out.print("\n¿Quiere saber el máximo (TECLEE 1) o  el mínimo (TECLEE 2)?: ");
  int opcion=Integer.parseInt(System.console().readLine());
  
  //Imprimimos los números y según lo elegido ponemos al lado lo que le corresponde
  for(i=0; i<100; i++){
    
    if(opcion==1 && numero[i]==maximo){
      System.out.println(numero[i]+" máximo");
    }else if(opcion==2 && numero[i]==minimo){
        System.out.println(numero[i]+" minimo");
      }else{
          System.out.println(numero[i]);
        }
  }
  
}}
