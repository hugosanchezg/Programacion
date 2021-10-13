public class Ej10{
public static void main(String[]args){
  String horoscopo = "";
  System.out.print("Introduzca el número del mes de nacimiento: ");
    int mes = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    
  switch(mes){ 
    case1:
      if(dia<21){
        horoscopo = "capricornio";}
      else{ horoscopo = "acuario";}
      break;
    case2:
      if(dia<20){
        horoscopo="acuario";}
      else{ horoscopo="piscis";}
      break;
    case3:
      if(dia<21){
        horoscopo="piscis";}
      else{ horoscopo="aries";}
      break;
    case4:
      if(dia<21){
        horoscopo="aries";}
      else{ horoscopo="tauro";}
      break;
    case5:
      if(dia<20){
        horoscopo="tauro";}
      else{ horoscopo="géminis";}
      break;
    case6:
      if(dia<22){
        horoscopo="géminis";}
      else{ horoscopo="cáncer";}
      break;
    case7:
      if(dia<22){
        horoscopo="cáncer";}
      else{ horoscopo="Leo";}
      break;
    case8:
      if(dia<24){
        horoscopo="leo";}
      else{ horoscopo="virgo";}
      break;
    case9:
      if(dia<23){
        horoscopo="virgo";}
      else{ horoscopo="libra";}
      break;
    case10:
      if(dia<23){
        horoscopo="libra";}
      else{ horoscopo="escorpio";}
      break;
    case11:
      if(dia<23){
        horoscopo="escorpio";}
      else{ horoscopo="sagitario";}
      break;
    case12:
      if(dia<21){
        horoscopo="sagitario";}
      else{ horoscopo="capricornio";}
      break;
      default:
    }
    System.out.print("Tu horóscopo "+horoscopo);
} }
