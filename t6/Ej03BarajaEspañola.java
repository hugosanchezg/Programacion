//Baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
public class Ej03BarajaEspañola{
public static void main(String[]args){
  
  int carta;
  int palo;

  System.out.println("Vamos a mostrar al azar una carta de la baraja española: ");

  for(int i=0; i<1; i++){
    carta=(int)(Math.random()*12)+1;
    
    if(carta==1){
      System.out.print("As ");
    }else if(carta==10){
      System.out.print("Sota ");
      }else if(carta==11){
      System.out.print("Caballo ");
      }else if(carta==12){
      System.out.print("Rey ");
      
      }else{
      System.out.print(carta+" ");
      }
  }
  
  for(int i=0; i<1; i++){
    palo=(int)(Math.random()*4)+1;
    if(palo==1){
      System.out.print("de copas ");
    }
    if(palo==2){
      System.out.print("de palos ");
    }
    if(palo==3){
      System.out.print("de espadas ");
    }
    if(palo==4){
      System.out.print("de oros ");
    }
  }
  
  System.out.println();
}}
