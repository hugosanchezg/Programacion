public class Ej34{
public static void main(String[]args){
  
  System.out.println("Vas a introducir dos números de la misma longitud,\ny con un dígito par y otro impar mínimo");
  
  long digito;
  long alreves=0;
  
  
  System.out.print("Introduzca el primer número: ");
    long numero1=Long.parseLong(System.console().readLine());
  System.out.print("Introduzca el segundo número: ");
    long numero2=Long.parseLong(System.console().readLine());
    
  System.out.print("Los digitos pares son ");
    
    while(numero2>0){
      alreves=(alreves*10)+(numero2%10);
      numero2=numero2/10;
    }
    while(numero1>0){
      alreves=(alreves*10)+(numero1%10);
      numero1=numero1/10;
    }
    long alreves2=alreves;
    while(alreves>0){
      digito=alreves%10;
      alreves=alreves/10;
      
      if (digito%2==0){
        System.out.print(digito+" ");
      }
    }
    
  System.out.println();
  
  System.out.print("Los digitos impares son ");
    while(alreves2>0){
      digito=alreves2%10;
      alreves2=alreves2/10;
      
      if (!(digito%2==0)){
        System.out.print(digito+" ");
      }
    }
      
    
}}
