public class Ej14{
public static void main(String[]args){
  
  double potencia=1;
  double resultado=0;
  
  System.out.print("Introduzca la base de la potencia: ");
    int base=Integer.parseInt(System.console().readLine());
    
  System.out.print("Introduzca el exponente de la potencia: ");
    int exponente=Integer.parseInt(System.console().readLine());

//si x^0=1
  if(exponente==0){
    resultado=1;
  System.out.println("Cualquier número elevado a 0 es 1");
  }
  

//si x^nºpositivo  
  if(exponente>0){
    for(int i=0; i<exponente; i++){
      resultado=base*base;
    }
    System.out.println(base+" elevado a "+exponente+" = "+resultado);
  }

//si x^nºnegativo
  if(exponente<0){
    for(int i=0; i<-exponente; i++){
      resultado=base*base;
    }
    //para hacer la inversa
    potencia=1/potencia;
    System.out.println(base+" elevado a "+exponente+" = "+resultado);
  }
}}
