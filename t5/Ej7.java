//Si contraseña introducida es igual a contraseña (real):
// -“La caja fuerte se ha abierto satisfactoriamente”

//Si contraseña introducida no es igual a contraseña (real):
// -“Lo siento, esa no es la combinación”

public class Ej7{
public static void main(String[]args){
  
  int i=0;
  int nintentos=4;
  
  System.out.println("Control de acceso a la caja fuerte");

for(i=0; i<=1234; i++){ System.out.println("Introduzca la contraseña (de 4 dígitos): ");
    int contraseñaintroducida=Integer.parseInt(System.console().readLine());
    i=contraseñaintroducida;
    
    if(i==1234){
      System.out.println(+contraseñaintroducida+": La caja fuerte se ha abierto satisfactoriamente");
    }else{
      System.out.println(+contraseñaintroducida+": Lo siento, esa no es la combinación");
      --nintentos;
      }if(nintentos<1){
      System.out.println("Se han acabado tus intentos");
      break;
    }
    }
}}
