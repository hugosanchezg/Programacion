public class Prueba {
    public static void main (String[] args){
      
      //esto es un comentario de una sola linea
      /*para poner notas
        de varias líneas*/
        
        int nota1, nota2, nota3;
        float notaDecimal = 6.7256f;
        String entrada;
        
        
        System.out.println("hola");
        System.out.print("Introduzca un valor entero:" );
        entrada = System.console().readLine();
        System.out.print("La cadena introducida es:",entrada);
        nota1 = Integer.parseInt(entrada);
        System.out.println("El numero introducido es: ",nota1);
        System.out.printf("Ejemplo de nota %10.2f con decimales. \n", notaDecimal);
    }
}

