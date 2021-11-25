public class Ej20Reyes{
public static void main(String[]args){
  
  System.out.print("¿Cuántos reyes vas a querer introducir? ");
  int cantidadreyes=Integer.parseInt(System.console().readLine());
  
  String[] rey=new String[cantidadreyes];
  
  for(int i=0; i<cantidadreyes; i++){
    System.out.println("Introduce el nombre del Rey nº"+i+": ");
    rey[i]=System.console().readLine();
  }
  
  for(int i = 0; i < cantidadreyes; i++){
    int ordenRey = 1;
    
    for(int j = 0; j < i; j++){
      if(rey[i].equals(rey[j])){
        ordenRey++;
      }
    }
    
    System.out.println(rey[i]+" "+ordenRey+"º");
  }
  
}}
