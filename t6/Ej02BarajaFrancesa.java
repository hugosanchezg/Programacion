/*Al azar el nombre de una carta de la baraja francesa:
*-Picas(p1), corazones(p2), diamantes(p3) y tréboles(p4). 
*-Cada palo->13 cartas: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el 1).*/

//1=A, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11=J, 12=Q, 13=K
public class Ej02BarajaFrancesa{
public static void main(String[]args){
  
  int carta;
  int palo;

  System.out.println("Vamos a mostrar al azar una carta de la baraja francesa: ");

  for(int i=0; i<1; i++){
    carta=(int)(Math.random()*13)+1;
    
    if(carta==1){
      System.out.print("A ");
    
    }else if(carta==11){
      System.out.print("J ");
      }else if(carta==12){
      System.out.print("Q ");
      }else if(carta==13){
      System.out.print("K ");
      
      }else{
      System.out.print(carta+" ");
      }
  }
  
  for(int i=0; i<1; i++){
    palo=(int)(Math.random()*4)+1;
    if(palo==1){
      System.out.print("de picas ");
    }
    if(palo==2){
      System.out.print("de corazones ");
    }
    if(palo==3){
      System.out.print("de diamantes ");
    }
    if(palo==4){
      System.out.print("de tréboles ");
    }
  }
  
  System.out.println();
}}
