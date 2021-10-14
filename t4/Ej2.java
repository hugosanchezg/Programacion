public class Ej2{
  public static void main(String[]args){
    System.out.print("Introduzca una hora del día: ");
    int hora = Integer.parseInt(System.console().readLine());
//Zona Horaria de "Mañana"//    
    if((hora>=6)&&(hora<=12)){
      System.out.println("Buenos días");
    }
//Zona Horaria de "Tarde"//
    if((hora>=13)&&(hora<=20)){
      System.out.println("Buenas tardes");
    }
//Zona Horaria de "Noche": Cuando la hora es mayor de las 21 hasta las 24 (00:00), o el intervalo de "0" a 5 //
    if(((hora>=21)&&(hora<24))||((hora<=5)&&(hora>=0))){
      System.out.println("Buenas noches");
    }
//If para cuando se introduce una hora mayor que las 24 o cuando se introduce un valor negativo menor de 0//
    if((hora>=24)||(hora<0)){
      System.out.println("La hora introducida no es correcta.");
    }
}}
