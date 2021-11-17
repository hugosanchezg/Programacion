public class Ej01Array12Nums{
public static void main(String[]args){
  
  int[]num=new int[12];
  
  System.out.println("Array de 12 números enteros:");
  
  num[0]=123;
  num[1]=1234;
  num[2]=12345;
  num[3]=123456;
  num[4]=1234567;
  num[5]=12345678;
  num[6]=123456789;
  
  for(int i=0; i<12; i++){
    System.out.println("num["+i+"]="+num[i]);
  }
}}
