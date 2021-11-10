public class Ej01Dados{
public static void main(String[]args){
  
  int tirarDado;
  int suma=0;

System.out.println("Vamos a hacer la tirada de tres dados: ");

  for(int i=0; i<3; i++){
    tirarDado=(int)(Math.random()*6)+1;
    
    System.out.println(tirarDado+" ");
    suma=suma+tirarDado;
  }
  
  System.out.println("La suma de las 3 tiradas es: "+suma);}}
