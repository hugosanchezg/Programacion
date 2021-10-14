public class Ej18{
public static void main(String[]args){
  int n;
  int cifra1;
  System.out.print("Introduzca un número de 5 dígitos máximo: ");
  n = Integer.parseInt(System.console().readLine());
  
  //Si el nº es menor de 10, sólo tendría una cifra, por lo que://
  if(n<10){
  cifra1=n;
  System.out.println("La primera cifra del número introducido es el "+cifra1);
  }
  //Un nº mayor que 10 pero menor que 100 tiene dos cifras, por lo que:/
  if((n>=10)&&(n<100)){
  cifra1=n/10;
  System.out.println("La primera cifra del número introducido es el "+cifra1);
  }
  //Seguimos el mismo proceso consecutivamente, añadiendo un cero a la división a la par que a la cifra://
  if((n>=100)&&(n<1000)){
  cifra1=n/100;
  System.out.println("La primera cifra del número introducido es el "+cifra1);
  }
  if((n>=1000)&&(n<10000)){
  cifra1=n/1000;
  System.out.println("La primera cifra del número introducido es el "+cifra1);
  }
  if((n>=10000)&&(n<100000)){
  cifra1=n/10000;
  System.out.println("La primera cifra del número introducido es el "+cifra1);
  }
  //Como en el enunciado se establece un máximo de 5 dígitos, establezco://
  if(n>=100000){
  System.out.println("No puedes introducir más de 5 cifras!!");
  }
  }
}
