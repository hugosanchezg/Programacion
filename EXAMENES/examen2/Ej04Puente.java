public class Ej04Puente {
  public static void main(String[] args) {

    int longitud;
    int numeroAleatorio;

    System.out.print("Introduce la longitud del puente (número mayor que 6): ");
    longitud = Integer.parseInt(System.console().readLine());

    System.out.println();

    System.out.print("  ");
    
    //hacemos que las personas (&) aparezcan en la plataforma
    for (int i = 2; i < longitud-2; i++) {
      
      numeroAleatorio = (int) (Math.random() * 3);

      if(numeroAleatorio == 0){
        
        System.out.print("&");
        
      }else{
      
        System.out.print(" ");
        
      }

    }

    System.out.println();
    
    //Pintamos la plataforma del puente
    for (int i = 0; i < longitud - 2; i++) {
      
      //Para cuando sea mayor a 2, ya que los dos primeros los mostramos después porque son el soporte
      if(i >= 2){
        
        System.out.print("*");
        
      }else{
      
        System.out.print(" ");
        
      }
      
    }
    
    System.out.println();
    
    //Pintamos los dos primeros asteriscos de los soportes
    for (int i = 0; i < longitud; i++) {
      
      //los mostramos
      if(i == 1 || i == longitud - 2){
        
        System.out.print("+");
        
      }else{
        System.out.print(" ");
      }
    }
    
    System.out.println();
    
    //Pintamos los dos últimos asteriscos de los soportes
    for (int i = 0; i < longitud; i++) {
      
      //los mostramos en la primera posición y la última
      if(i == 0 || i == longitud - 1){
        
        System.out.print("-");
        
      }else{
        
        System.out.print(" ");
        
      }
    }
    
    
    
  }
}
