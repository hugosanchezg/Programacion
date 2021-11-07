public class Ej36{
public static void main(String[]args){

    int manipulado=0;
    int alreves=0;

    System.out.print("Introduce un numero: ");
    int numero=Integer.parseInt(System.console().readLine());

//cogemos el nº manipulado para darle la vuelta y ver si es igual al introducido inicialmente
    numero=manipulado;

    while(manipulado>0){
      alreves=(alreves*10)+(manipulado%10);
      manipulado=manipulado/10;
    }

    if (numero==alreves){
      System.out.println("El número introducido es capicúa");
    }else{
      System.out.println("El número introducido no es capicúa");
    }
}}
