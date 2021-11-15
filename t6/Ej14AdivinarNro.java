/*El programa intentará adivinar el número que estás pensando (0-100) en 5 oportunidades. 
En cada intento fallido, el programa debe preguntar si el número que estás 
pensando es mayor o menor que el que te acaba de decir.*/
public class Ej14AdivinarNro{
public static void main(String[]args){
  
  int nintentos=5;
  int numeroAAcertar=0;
  int maximo=100;
  int minimo=0;
  int opcion;
  
  System.out.println("Piensa un número entre el 0 y el 100.");
  System.out.println("Tengo 5 intentos para adivinar el número.");
  
  do{
    
    int numero=(int)(Math.random()*(maximo-minimo)+minimo);
      System.out.println("¿Es este el número? "+numero);
    
    System.out.println("El número es menor (1), mayor (2) o acerté (3)? ");
      opcion=Integer.parseInt(System.console().readLine());
    
    nintentos--;
    
    if(opcion==1){
      maximo=numero-1;
    }
    
    if(opcion==2){
      minimo=numero+1;
    }
    
    if(opcion==3){
      System.out.println(+numero+": He acertado el número!!!");
    }
    
  }while(opcion!=3 && nintentos>0);
  
  if(nintentos==0){
    System.out.println("El programa finaliza, me quedé sin intentos!");
  }
}}
