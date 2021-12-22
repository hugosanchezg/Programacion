package Ejercicios;

import java.util.Scanner;

public class Ej1al14 {
	
	//MAIN
	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		//pedimos un nº > 10 para el ej1
		int numero = 0;
		
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
		
		
		
		
		
		return resultado;
		
	}
	
	
	
	}
