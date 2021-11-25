//verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado
public class Ej14PalabrasColores{
public static void main(String[]args){
  
  String[]color={"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"};
  String[]palabra=new String[8];
  String[]resultadoFinal=new String[8];
  int j=0;
  
  System.out.println("Introduce 8 palabras: ");
  for(int i=0; i<8; i++){
    palabra[i]=System.console().readLine();
    
    //Identificamos si la palabra introducida es un color
    for(String c : color){
      if(palabra[i].equals(c)){
        resultadoFinal[j++]=c;
      }
    }
  }
  
  //Las que no son colores se meten al final del array
  for(int i=0;i<8;i++){
    boolean SiColor=false;
    
    for(String c:color){
      if(palabra[i].equals(c)){
        SiColor=true;
      }
    }
    if(!SiColor){
      resultadoFinal[j++]=palabra[i];
    }
  }
  
  System.out.println("------------------ARRAY ORIGINAL-------------------");
  for(int i=0; i<8; i++){ 
    System.out.print(palabra[i]+" ");
  }
  
  System.out.println();
  
  System.out.println("\n------------------ARRAY RESULTADO------------------");
  for(int i=0; i<8; i++){ 
    System.out.print(resultadoFinal[i]+" ");
  }
  
  
}}
