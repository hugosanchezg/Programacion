public class Ej9{
public static void main(String[]args){
  double x1,x2;
  System.out.println("Vamos a resolver: ax^2 + bx + c = 0");
  System.out.println("Introduce los valores.");
  System.out.print("a = ");
    double a = Double.parseDouble (System.console().readLine());
  System.out.print("b = ");
    double b = Double.parseDouble (System.console().readLine());
  System.out.print("c = ");
    double c = Double.parseDouble (System.console().readLine());

//TODOS SON 0    
  if((a==0)&&(b==0)&&(c==0)){
    System.out.println("Infinitas soluciones");}

//C DISTINTO DE 0  
  if((a==0)&&(b==0)&&(c!=0)){
    System.out.println("No tiene solución.");}

//A Y B DISTINTOS DE 0
  if((a!=0)&&(b!=0)&&(c==0)){
    System.out.println("x1 = 0");
    System.out.println("x2 = "+(-b/a));}
    
// 0x^2 + bx + c = 0  B Y C DISTINTOS DE 0
  if((a==0)&&(b!=0)&&(c!=0)){
    System.out.println("x1 = x2 = "+(-c/b));}
    
//TODOS DISTINTOS DE 0
  if((a!=0)&&(b!=0)&&(c!=0)){
    double discriminante = b * b - (4 * a * c);
  if(radicando < 0){
    System.out.println("La ecuación no tiene soluciones reales");
    } else{
      System.out.println("x1 = "+((-b) + Math.sqrt(radicando))/(2 * a));
      System.out.println("x2 = "+((-b) - Math.sqrt(radicando))/(2 * a));}
      }        
}}
