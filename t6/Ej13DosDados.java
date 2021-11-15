public class Ej13DosDados{
public static void main(String[]args){
  
  int tirada1;
  int tirada2;
  
  System.out.println("Vamos a hacer la tirada de dos dados hasta que coincidan: ");
  
  do{
    tirada1=(int)(Math.random()*6)+1;
    System.out.println(tirada1);
    
    tirada2=(int)(Math.random()*6)+1;
    System.out.println(tirada2);
    
    System.out.println();
    
    if(tirada1==tirada2){
      System.out.println("Los dados han coincidido!");
    }
  
  }while(tirada1!=tirada2);
  
}}
