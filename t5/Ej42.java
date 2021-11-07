public class Ej42{
public static void main(String[] args){

  int contador=0;

  System.out.print("Introduce un numero entero positivo: ");
    int numero=Integer.parseInt(System.console().readLine());
    for(int i=numero; i<(numero+6); i++){
      contador=0;
      
      for(int j=1; j<=i; j++){
        if (i%j==0){
          contador++;
        }
      }
     
      if (contador==2){
        System.out.println(+i+" es primo");
      }else{
        System.out.println(+i+" no es primo");
      }
    }

}}
