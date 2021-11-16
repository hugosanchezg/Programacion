public class Ej18ColorAleat{
public static void main(String[]args){
  
  String color1="";
  String color2="";
  String color3="";
  int colorAleat1, colorAleat2, colorAleat3;
  System.out.println("Se van a mostrar tres colores random diferentes:");
  
  //Iniciamos un bucle que no pare hasta que haga que los 3 colores random sean diferentes 
  do{
    colorAleat1=(int)(Math.random()*6);
    colorAleat2=(int)(Math.random()*6);
    colorAleat3=(int)(Math.random()*6);
  }while((colorAleat1==colorAleat2) || (colorAleat1==colorAleat3) || (colorAleat2==colorAleat3));
  
  switch(colorAleat1){
    case 0:
      color1="rojo";
    break;
    case 1:
      color1="azul";
    break;
    case 2:
      color1="verde";
    break;
    case 3:
      color1="amarillo";
    break;
    case 4:
      color1="violeta";
    break;
    case 5:
      color1="naranja";
    break;
    default:
  }
  
  System.out.print(color1+" ");
  
  switch(colorAleat2){
    case 0:
      color2="rojo";
    break;
    case 1:
      color2="azul";
    break;
    case 2:
      color2="verde";
    break;
    case 3:
      color2="amarillo";
    break;
    case 4:
      color2="violeta";
    break;
    case 5:
      color2="naranja";
    break;
    default:
  }
  
  System.out.print(color2+" ");
  
  switch(colorAleat3){
    case 0:
      color3="rojo";
    break;
    case 1:
      color3="azul";
    break;
    case 2:
      color3="verde";
    break;
    case 3:
      color3="amarillo";
    break;
    case 4:
      color3="violeta";
    break;
    case 5:
      color3="naranja";
    break;
    default:
  }
  
  System.out.print(color3+" ");
  
}}

