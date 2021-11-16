public class Ej15NotasMusicales{
public static void main(String[]args){
  
  String nota="";
  String primera="";
  System.out.println("Se va a generar una melodía aleatoria.");
  
  /*Para que salgan siempre números aleatorios de la tabla del 4. Por ej: 4*(6)=24.
  28 es lo máximo que se puede llegar a generar (7*4)*/
  
  int notastotales=4*(int)(Math.random()*7+1);
  
  //El contador siempre debe ser igual a las notas totales generadas y nunca mayor
  for(int contador=1; contador<=notastotales; contador++){
    
    int notaAleat=(int)(Math.random()*7);
    switch(notaAleat){
      case 0:
        nota="do";
      break;
      case 1:
        nota="re";
      break;
      case 2:
        nota="mi";
      break;
      case 3:
        nota="fa";
      break;
      case 4:
        nota="sol";
      break;
      case 5:
        nota="la";
      break;
      case 6:
        nota="si";
      break;
      default:
    }
    
    //Si estamos en la primera nota:
    if(contador==1){
      primera=nota;
    }
    
    //Si contador es igual a las notas totales finalizamos con ||, y hacemos que la últ nota sea la primera
    if(contador==notastotales){
      nota=primera;
    }
    
    System.out.print(nota+" ");
    
    //Para poner la barra cada 4 notas
    if(contador%4==0){
      System.out.print("| ");
    }
    
    //Añadimos la barra que señaliza la finalización
    if(contador==notastotales){
      System.out.print("|");
    }
    
  }
}}
