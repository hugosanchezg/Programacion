public class Ej21CaraoCruz{
public static void main(String[]args){
  
  String moneda="";
  String caraocruz="";
  
  System.out.println("Se van a mostrar cinco monedas random de cara o cruz:");
  
  for(int i=0; i<5; i++){
    int monedaAleat=(int)(Math.random()*7);
    switch(monedaAleat){
      case 0:
        moneda="1 céntimo";
      break;
      case 1:
        moneda="2 céntimos";
      break;
      case 2:
        moneda="5 céntimos";
      break;
      case 3:
        moneda="10 céntimos";
      break;
      case 4:
        moneda="20 céntimos";
      break;
      case 5:
        moneda="50 céntimos";
      break;
      case 6:
        moneda="1 euro";
      break;
      case 7:
        moneda="2 euros";
      break;
      default:
    }
  
    int caraocruzAleat=(int)(Math.random()*1);
    switch(caraocruzAleat){
      case 0:
        caraocruz="cara";
      break;
      case 1:
        caraocruz="cruz";
      break;
      default:
    }
  System.out.println(moneda+" - "+caraocruz);
  }
  
}}
