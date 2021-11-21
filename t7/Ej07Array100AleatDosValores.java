public class Ej07Array100AleatDosValores{
public static void main(String[]args){
  
  int[]numero=new int[100];
  int i=0;
  
  System.out.println("Se van a mostrar 100 números aleatorios del 0 al 20, y después vas a poder \nseleccionar un valor para cambiarlo por el que quieras:");
  
  //Bucle de números aleatorios
  for(i=0; i<100; i++){
    numero[i]=(int)(Math.random()*21);
    System.out.print(numero[i]+" ");
  }
  
  System.out.print("\nIntroduzca un número de los que se han mostrado: ");
  int valor1=Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
  int valor2=Integer.parseInt(System.console().readLine());
  System.out.println();
  
  //Bucle para mostrarlos de nuevo con el valor cambiado
  for(i=0; i<100; i++){
    if(numero[i]==valor1){
      numero[i]=valor2;
      System.out.print(" '"+numero[i]+"' ");
    }else{
      System.out.print(" "+numero[i]+" ");
      }
  }
  
}}
