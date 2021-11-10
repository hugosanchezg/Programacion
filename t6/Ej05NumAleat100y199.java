//Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
//separados por espacios. Muestra también el máximo, el mínimo y la media de ellos.
public class Ej05NumAleat100y199{
public static void main(String[]args){
  
  int numero;
  int media=0;
  int suma=0;
  //Definimos max y min para compararlos con el numero y sacar el mas 
  int maximo=100;
  int minimo=199;
  
  System.out.println("Vamos a mostrar 50 nros aleatorios entre 100 y 199: ");

  for(int i=0; i<50; i++){
    numero=(int)(Math.random()*100)+100;
    System.out.print(numero+" ");
    suma=numero+suma;
    
    if(numero<minimo){
      minimo=numero;
    }
    if(numero>maximo){
      maximo=numero;
    }
  }
  media=suma/50;
  System.out.println();
  System.out.println("El máximo es "+maximo+", el mínimo es "+minimo+",\ny la media de ellos es "+media);
}}
