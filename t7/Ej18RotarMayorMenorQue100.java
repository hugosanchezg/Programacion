public class Ej18RotarMayorMenorQue100{
public static void main(String[]args){
  
  int[] numero = new int[20];
  int[] menor = new int[20];
  int[] mayor = new int[20];
  int contadormenor=0;
  int contadormayor=0;
  
  
  System.out.println("Se van a crear 10 nums aleatorios del 0 al 200, y después\nse van a colocar: n>100, n<100, n>100, n<100... ");
  
  for(int i = 0; i < 10; i++){
    numero[i] = (int)(Math.random()*201);
    
    if(numero[i]>=100){
      mayor[contadormayor++]=numero[i];
    }else{
      menor[contadormenor++]=numero[i];
    }
  }
  
  //Pintamos el array inicial
  System.out.println("------------------ARRAY INICIAL--------------");
  System.out.print("Indice: ");
  for (int i = 0; i < 10; i++){
    System.out.printf("%-4d", i);
  }
  System.out.println();

  System.out.print("Valor:  ");
  for(int i = 0; i < 10; i++){
    System.out.printf("%-4d", numero[i]);
  }
  
  //Rotar el Array yendo Menor<100, Mayor>100, Menor, Mayor...
  int[]resultado=new int[10];
  int menoresColocados=0;
  int mayoresColocados=0;
  int j=0;
  
  do{
    if(menoresColocados<contadormenor){
      resultado[j++]=menor[menoresColocados++];
    }
    if(mayoresColocados<contadormayor){
      resultado[j++]=mayor[mayoresColocados++];
    }
  }while(j<10);
  
  //Pintamos el array final rotado
  System.out.println("\n------------------ARRAY FINAL----------------");
  System.out.print("Indice: ");
  for (int i = 0; i < 10; i++){
    System.out.printf("%-4d", i);
  }
  System.out.println();

  System.out.print("Valor:  ");
  for(int i = 0; i < 10; i++){
    System.out.printf("%-4d", resultado[i]);
  }
  
}}
