public class Ej11NotasAleat{
public static void main(String[]args){
  int nota;
  String resultado="";
  int suspenso=0;
  int suficiente=0;
  int bien=0;
  int notable=0;
  int sobresaliente=0;
  for(int i=1; i<=20; i++){
    nota=(int)(Math.random()*5)+1;
    
    switch(nota){
      case 1:
        resultado="suspenso";
        suspenso++;
      break;
      case 2:
        resultado="suficiente";
        suficiente++;
      break;
      case 3:
        resultado="bien";
        bien++;
      break;
      case 4:
        resultado="notable";
        notable++;
      break;
      case 5:
        resultado="sobresaliente";
        sobresaliente++;
      default:
    }
    System.out.print(resultado+" ");
    
  }System.out.println();
  System.out.print("En total han habido: "+suspenso+" suspensos, "+suficiente+" suficientes, "+bien+" bienes,\n"+notable+" notables, y "+sobresaliente+" sobresalientes.");
}}
