public class Ej19Aleatmenos100a200{
public static void main(String[]args){
  
  int numero;
  int media=0;
  int suma=0;
  int maximopares=-100;
  int minimoimpares=200;
  
  System.out.println("Vamos a mostrar 50 nros aleatorios entre -100 y 200: ");

  for(int i=0; i<50; i++){
    numero=(int)(Math.random()*300)-100;
    System.out.print(numero+" ");
    suma=numero+suma;
    
    if(numero%2==0){
      if(numero>maximopares){
        maximopares=numero;
      }
    }else if(numero<minimoimpares){
        minimoimpares=numero;
      }
  }
  media=suma/50;
  System.out.println();
  System.out.println("El nº par más grande es "+maximopares+",\nel impar más pequeño es "+minimoimpares+",\ny la media de todos ellos es "+media);
}}
