/*
  [x]-En un array de strings cargar platos (comidas) que se podrían hacer en los almuerzos y otro array para cenas
  [ ]-Para una semana aletoriamente una secuencia de platos sin que caigan dos platos iguales consecutivos
*/
public class EjCena{
  public static void main(String[]args){
    
    //declaramos las variables
    String[] almuerzo = {"Espaguetis","Macarrones","Filetes"};
    String[] cena = {"Ensalada","Hamburguesa","Serranito"};
    String[] dias = {"Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
    
    //calculamos el menu del lunes
    int almuerzoAnterior = (int)(Math.random()*(3));
    int cenaAnterior = (int)(Math.random()*(3));
    
    //Lunes
    System.out.println("El menú del almuerzo del "+dias[0]+" es "+almuerzo[almuerzoAnterior]);
    System.out.println("El menú del cena del lunes es "+cena[cenaAnterior]);
    System.out.println("\n");
    
    int almuerzoPosterior = 0;
    int cenaPosterior = 0;
    
    //Martes, Mirércoles, etc.
    
    for (int i = 1; i < 6; i++) {//Martes
    
      do{
        
        almuerzoPosterior = (int)(Math.random()*(3));
        cenaPosterior = (int)(Math.random()*(3));
        
      } while( (almuerzoAnterior == almuerzoPosterior) || (cenaAnterior == cenaPosterior) );
      
      // mostramos el día actual
      System.out.println("El menú del almuerzo del " + dias[i] + " es "+almuerzo[almuerzoPosterior]);
      System.out.println("El menú del cena del " + dias[i] + " es "+cena[cenaPosterior]);
      System.out.println("\n");
      
      almuerzoAnterior = almuerzoPosterior;
      cenaAnterior = cenaPosterior;
      
    }
  
  }
}
