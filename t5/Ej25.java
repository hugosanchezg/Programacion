public class Ej25{
public static void main(String[]args){
  
  int alreves=0;
  
  System.out.print("Introduzca un número para darle la vuelta: ");
    int numero=Integer.parseInt(System.console().readLine());
    
  while(numero>0){
/*EJEMPLO 123:
Dividimos el número entre 10, para obtener su resto: RESTO=3, RESULTADO=12
Si el resto lo multiplicamos x10, obtendríamos 30, y a ese 30 le podemos sumar el siguiente resto:
12 entre 10: RESTO=2, RESULTADO=1
Por lo tanto, 30+2=32, x10=320 .... llegando a 320 + 1 = 321 = NÚMERO INVERTIDO
*/
    alreves=(numero%10)+(alreves*10);
    numero=numero/10;
  }
  System.out.print("El número introducido al revés es: "+alreves);
}
}
