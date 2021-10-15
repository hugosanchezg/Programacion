public class Ej19{
public static void main(String[]args){
    int numero;
    int digit=0;
  System.out.print("Introduce un nº de 5 cifras máx: ");
    numero = Math.abs(Integer.parseInt(System.console().readLine()));

//Si el número es menor de 10, sólo tendría un dígito, por lo tanto://
  if(numero<10){
    digit=1;
  }
//Un nº mayor que 10 pero menor que 100 tiene dos cifras, por lo que:/
  if((numero>=10)&&(numero<100)){
    digit=2;
  }
//Y así consecutivamente//
  if((numero>=100)&&(numero<1000)){
    digit=3;
  }

  if((numero>=1000)&&(numero<10000)){
    digit=4;
  }

  if((numero>=10000)&&(numero<100000)){
    digit=5;
  }

//Como en el enunciado se establece un máximo de 5 dígitos, establezco://
  if(numero>=100000){
    System.out.println("No puedes introducir más de 5 cifras!!");
  }
  System.out.println("El nº tiene " +digit+ " dígitos");
}}
