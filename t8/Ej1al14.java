package Ejercicios;

import java.util.Scanner;

public class Ej1al14 {
	
	//MAIN
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		//pedimos un nº > 10 para el ej1
		int numero = 0;
		int digito = 0;
		
		/*
		//EJ 1: CAPICUA
		System.out.println("EJ 1. CAPICUA:");
		do {
        	
            System.out.print("Introduce un número >= 10: ");
            numero = sc.nextInt();
            
        } while (numero < 10);
		
		boolean capicua = esCapicua(numero);
		System.out.println("Capicua es " + capicua);

		
		//EJ 2: PRIMO
		System.out.println("\nEJ 2. PRIMO:");
		do {
        	
            System.out.print("Introduce un número >= 10: ");
            numero = sc.nextInt();
            
        } while (numero < 10);
		
		boolean primo = esPrimo(numero);
		System.out.println("Primo es " + primo);
		
		
		//EJ 3: SIGUIENTE PRIMO
		System.out.println("\nEJ 3. SIGUIENTE PRIMO:");
		do {
        	
            System.out.print("Introduce un número >= 10: ");
            numero = sc.nextInt();
            
        } while (numero < 10);
		
		int sigprimo = siguientePrimo(numero);
		System.out.println("El siguiente primo es " + sigprimo);
		
		
		//EJ 4: POTENCIA
		double base = 0;
		double exponente = 0;
		
		System.out.println("\nEJ 4. POTENCIA:");
        System.out.print("Introduce un número de base: ");
        	base = sc.nextDouble();
        System.out.print("Introduce un exponente: ");
        	exponente = sc.nextDouble();
		
		double potenciaFinal = potencia(base,exponente);
		System.out.println("El resultado de la potencia es " + potenciaFinal);
		
		
		//EJ 5: DIGITOS
		System.out.println("\nEJ 5. DÍGITOS:");
		do {
        	
            System.out.print("Introduce un número > 0: ");
            numero = sc.nextInt();
            
        } while (numero < 0);
		
		int ndigitos = digitos(numero);
		System.out.println("El número tiene " + ndigitos + " dígitos");
		
		
		//EJ 6: VOLTEA
		System.out.println("\nEJ 6. VOLTEA:");
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
		
		int volteado = voltea(numero);
		System.out.println("El número volteado es " + volteado);
		
		
		//EJ 7: DIGITO N
		System.out.println("\nEJ 7. DIGITO N:");
		int n = 0;
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.print("¿De qué posición quieres sacar el dígito? ");
        n = sc.nextInt();
		
		int digitoposicion = digitoN(numero,n);
		System.out.println("El dígito de la posición "+ n + " es " + digitoposicion);
		
		
		//EJ 8: POSICION DE DIGITO
		System.out.println("\nEJ 8. POSICION DE DIGITO:");
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.print("¿De qué dígito quieres que te diga la posición? ");
        digito = sc.nextInt();
		
		int posiciondigito = posicionDeDigito(numero,digito);
		System.out.println("El dígito "+ digito + " está en la posición " + posiciondigito);
				
		
		//EJ 9: QUITA POR DETRAS
		System.out.println("\nEJ 9. QUITA POR DETRAS:");
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.print("¿Cuántos dígitos quieres quitar de detrás? ");
        digito = sc.nextInt();
		
		int quitapordetras = quitaPorDetras(numero,digito);
		System.out.println("El resultado es "+quitapordetras);
	
		
		//EJ 10: QUITA POR DELANTE
		System.out.println("\nEJ 10. QUITA POR DELANTE:");
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.print("¿Cuántos dígitos quieres quitar por delante? ");
        digito = sc.nextInt();
		
		int quitapordelante = quitaPorDelante(numero,digito);
		System.out.println("El resultado es "+quitapordelante);
		
		
		//EJ 11: PEGA POR DETRAS
		System.out.println("\nEJ 11. PEGA POR DETRAS:");
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.print("¿Qué dígito quieres pegar detrás? ");
        digito = sc.nextInt();
		
		int pegapordetras = pegaPorDetras(numero,digito);
		System.out.println("El resultado es "+pegapordetras);
		
		
		//EJ 12: PEGA POR DELANTE
		System.out.println("\nEJ 12. PEGA POR DELANTE:");
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.print("¿Qué número quieres pegar por delante? ");
        digito = sc.nextInt();
		
		int pegapordelante = pegaPorDelante(numero,digito);
		System.out.println("El resultado es "+pegapordelante);
		
		*/
		//EJ 13: TROZO DE NUMERO
		System.out.println("\nEJ 13. TROZO DE NUMERO:");
		
		int posInicial = 0;
		int posFinal = 0;
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.print("¿Qué posición inicial? ");
        posInicial = sc.nextInt();
        
        System.out.print("¿Qué posición final? ");
        posFinal = sc.nextInt();
		
		int trozodenumero = trozoDeNumero(numero,posInicial,posFinal);
		System.out.println("El resultado es "+trozodenumero);
		
		
		//EJ 14: JUNTA NUMEROS
		System.out.println("\nEJ 14. JUNTA NUMEROS:");
		int numero2 = 0;
		
        System.out.print("Introduce un número: ");
        numero = sc.nextInt();
        
        System.out.print("Introduce otro número ");
        numero2 = sc.nextInt();
		
		int juntanumeros = juntaNumeros(numero,numero2);
		System.out.println("Los dos juntos son: "+juntanumeros);
		
		
		
	}
	
	//1. CAPICUA
	public static boolean esCapicua(int numero) {
		
		boolean resultado = false;
		
        //registramos el numero en una variable auxiliar para hacerle las operaciones
        int cambiosNumero = numero;
        
        //llamamos a la funcion voltea para que le de la vuelta al número
        int volteado = voltea(cambiosNumero);
		
		if(numero == volteado){
        	
            resultado = true;
            
        } else {
        	
            resultado = false;
            
        }
		
		return resultado;
		
	}	
	
	//2. PRIMO
	public static boolean esPrimo(int numero) {
		
		boolean resultado = true;
		
		for (int i = 2; i < numero; i++) {
	    	
	    	if (numero % i == 0) {
	            
	    		resultado = false;
	            break;
	            
	        }else {
	        	resultado = true;
	        }
	    	
	    }
	    
	    return resultado;
	    
	}//esPrimo
	
	//3. SIGUIENTE PRIMO
	public static int siguientePrimo(int numero) {
		
		boolean primo = false;
        int resultado = 0;
        
		do{
			numero++;
		
			for (int i = 2; i < numero; i++) {
		    	
				if (numero % i == 0) {
		            
		    		primo = false;
		            break;
		            
		        }else {
		        	
		        	primo = true;
		        	
		        }
		    	
		    }
			
		}while (primo == false);
		
		resultado = numero;
		
	    return resultado;
		
	    //sc.close();
	    
	}//siguientePrimo
	
	//4. POTENCIA
	public static double potencia(double base, double exponente) {
		
		double resultado = 0;
		double baseFinal = base;
		
		if (exponente == 0) {
			
			baseFinal = 1;
			
		}
		
		for (int i = 1; i < exponente; i++) {
			
			baseFinal = baseFinal * base;//2
			
		}
		
		resultado = baseFinal;
		
		return resultado;
	    
	}//potencia		
	
	//5. DIGITOS
	public static int digitos(int numero) {
		
		int digito = 1;
		int resultado = 0;
		
		if ( numero < 10 ) {
			
			digito = 1;
			
		}else {
			
			do {
		
				numero = numero / 10;
				digito++;
		
			}while(numero > 10);
			
		}
		
		resultado = digito;
		return resultado;
		
	}
	
	//6. VOLTEA
	public static int voltea(int numero) {
		
		int inverso = 0;
		int resultado = 0;
		int resto = 0;
		
		//le damos la vuelta al número
        while (numero != 0){
        	
            resto = numero % 10;
            inverso = inverso * 10 + resto;
            numero = numero / 10;
            
        }
        
        resultado = inverso;
        return resultado;
        
	}
	
	//7. DIGITO N
	public static int digitoN(int numero, int n) {
		
		int resultado = 0;
		
		//posicion 1 es la primera
		resultado = (int)(numero / potencia(10, digitos(numero) - n) % 10);
		//hacemos el número potencia 10 elevado a el numero de dígitos menos la posición
		//de esto sacamos la posicion del número al hacerle el resto (%10)
		
		/*posicion 0 es la primera
		resultado = (int)(numero / potencia(10, digitos(numero) - n -1) % 10);
		*/
		
		return resultado;
	}
	
	//8. POSICION DE DIGITO
	public static int posicionDeDigito(int numero, int digito) {

		int posicion = 0;
		
		for (int i = 0; i < digitos(numero); i++) {
			
			if (digitoN(numero, i) == digito) { 
				
				posicion = i;
				
			}else {posicion = -1;}
			
		}
		
		return posicion;
		
	}
	
	//9. QUITA POR DETRAS
	public static int quitaPorDetras(int numero, int digito) {
		
		int resultado = 0;
		
		resultado =  numero / (int)potencia(10, digito);
		
		return resultado;
		
	}
	
	//10. QUITA POR DELANTE
	public static int quitaPorDelante(int numero, int digito) {
		
		int resultado = 0;
		
		resultado =  numero % (int)potencia(10, digitos(numero) - digito);
		
		return resultado;
		
	}
	
	//11. PEGA POR DETRAS
	public static int pegaPorDetras(int numero, int digito) {
		
		int resultado = 0;
		
		resultado =  numero * 10 + digito;
		
		return resultado;
		
	}
	
	//12. PEGA POR DELANTE
	public static int pegaPorDelante(int numero, int digito) {
		
		int resultado = 0;
		
		resultado =  digito * (int)potencia(10, digitos(numero)) + numero;
		
		return resultado;
			
	}
	
	//13. TROZO DE NUMERO
	public static int trozoDeNumero(int numero, int posInicial, int posFinal) {
		
		int resultado = 0;
		
		for (int i = posInicial; i <= posFinal; i++) {
			
			resultado = resultado * 10 + digitoN(numero, i);
			
		}
		
		return resultado;
			
	}
		
	//14. JUNTA NUMEROS
	public static int juntaNumeros(int numero, int numero2) {
		
		int resultado = numero;
		
		for (int i = 0; i < digitos(numero2); i++) {
			
		      resultado = resultado * 10 + digitoN(numero2, i);
		      
		}
		
		return resultado;
			
	}
		
		
		
}
