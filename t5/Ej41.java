public class Ej41{
public static void main(String[]args){
  System.out.print("Introduce el número: ");
  long numero=Long.parseLong(System.console().readLine());
  
  long manipulado=numero;
  int totalpares=0;
  int totalimpares=0;
  
  while(manipulado>0){
    if((manipulado%10)%2==0){
      totalpares++;
    }else{
      totalimpares++;
      }
    manipulado=manipulado/10;
  }
  
  System.out.print("El número tiene "+totalpares+" pares y "+totalimpares+" impares.");

}}
