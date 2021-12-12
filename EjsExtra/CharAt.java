public class CharAt {
  public static void main(String[] args) {
  
    //Creamos un string
    String cadena = "Cadena de caracteres";
    
    /*Con esto tomamos el caracter que queremos del string, p. ej el 4:
    
      -Partimos desde el 0: C a d e n a   d e   c a r a c t e r e s
                            0 1 2 3 4 5 6 7 8 9 ..................19
    */
    
    //Por lo tanto, si ponemos lo siguiente, obtendremos la 'n'
    char caracter = cadena.charAt(4);
    System.out.print(" "+caracter);
    
    
    System.out.println("\n\n");
    
    //Y si ponemos lo siguiente, obtendremos la 's'
    caracter = cadena.charAt(19);
    System.out.print(" "+caracter);
    
    
    System.out.println("\n\n");
    
    //Si hacemos un bucle for, nos iría recorriendo cada carácter del string
    for (int i = 0; i < cadena.length(); i++){
      
      caracter = cadena.charAt(i);
      System.out.print(" "+caracter);
      
    }
    
    
    System.out.println("\n\n");
    
    //Si fuese un int en vez de un char, veríamos el código ASCII de cada letra (incluso el de los espacios)
    int ascii;
    for (int i = 0; i < cadena.length(); i++){
      
      ascii = cadena.charAt(i);
      System.out.print(" "+ascii);
      
    }
    
    
    
    
    
    
  }
}
