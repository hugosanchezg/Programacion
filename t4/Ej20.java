import java.util.Scanner;

public class Ej20{
public static void main(String[] args){
  Scanner s = new Scanner(System.in);
    int n;
    boolean capicua=false;
    int uds=0;
    int decenas=0;
    int centenas=0;
    int udsMillar=0;
    int decenasMillar=0;

  System.out.println("¿Qué nº de máx 5 cifras deseas saber si es capicúa? ");
    n = s.nextInt();
    s.nextLine();

//Si introducimos un sólo número, obtendremos que:
  if (n<10){
    capicua= true;
  }
    
//Si introducimos un número de dos cifras, tendremos que ver si las uds=decenas
  if ((n>=10)&&(n<100)){
    uds=n%10;
    decenas=n/10;
    capicua=(uds==decenas);
  }
    
//Y así consecutivamente
  if ((n>=100)&&(n<1000)){
    uds=n%10;
    centenas=n/100;
    capicua=(uds==centenas);
  }
  
  if ((n>=1000)&&(n<10000)){
    uds=n%10;
    decenas=(n/10)%10;
    centenas=(n/100)%10;
    udsMillar=n/1000;
    capicua=((uds==udsMillar)&&(decenas==centenas));
  }
    
  if ((n>=10000)&&(n<100000)){
    uds=n%10;
    decenas=(n/10)%10;
    udsMillar=(n/1000)%10;
    decenasMillar=n/10000;
    capicua=((uds==decenasMillar)&&(decenas==udsMillar));
  }

  if(capicua){
    System.out.println("El número es capicúa!");
  }else{
    System.out.println("El número no es capicúa!");
    }
  }
}
