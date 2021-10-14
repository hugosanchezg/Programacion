public class Ej7{ 
public static void main(String[]args){
  System.out.print("Introduzca la primera nota: ");
    Double nota1=Double.parseDouble(System.console().readLine());
  System.out.print("Introduzca la segunda nota: ");
    Double nota2=Double.parseDouble(System.console().readLine());
  System.out.print("Introduzca la tercera nota: ");
    Double nota3=Double.parseDouble(System.console().readLine());
  double media=(nota1+nota2+nota3)/3;
System.out.printf("La media es:" +media);
  
  if(media<5){
    System.out.print(" insuficiente");}
  if((media>=5)&&(media<6)){
    System.out.print(" suficiente");}
  if((media>=6)&&(media<7)){
    System.out.print(" bien");}
  if((media>=7)&&(media<9)){
    System.out.print(" notable");}
  if(media>=9){
    System.out.print(" sobresaliente");}
}}
