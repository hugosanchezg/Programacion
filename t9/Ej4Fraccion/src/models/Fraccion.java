package models;

public class Fraccion {
	
	private int numerador;
	private int denominador;
	private int signo;
	
	public Fraccion (int n, int d) {
		
		//comprobamos si el denominador es 0
		if (d == 0) {
			
			System.out.println("Una fracción no puede tener como denominador el número 0");
			
		} else {
			
			//vemos si el signo de la fracción es positivo o negativo
			if (n * d < 0) {
				
				this.signo = -1;
				
			} else {
				
				this.signo = 1;
			
			}
			
			this.numerador = Math.abs(n);
			this.denominador = Math.abs(d);
			
		}
		
	}
	
	public Fraccion invierte(){
		
		Fraccion resultado;
		
		resultado = new Fraccion(signo*denominador, numerador);
		
		return resultado;
		
	}
	
	public Fraccion simplifica(){
		
		Fraccion resultado;
		
		for(int i = numerador; i > 0; i--) {
			
			if( (numerador % i == 0) && (denominador % i == 0)) {
				
				numerador = numerador / i;
				denominador = denominador / i;
				
			}
			
		}
		
		resultado = new Fraccion(signo*numerador, denominador);
		
		return resultado;
		
	}
	
	public Fraccion multiplica(int n, int d){
		
		Fraccion resultado;
		
		resultado = new Fraccion(signo*numerador*n, denominador*d);
		
		return resultado;
		
	}
	
	public Fraccion divide(int n, int d){
		
		Fraccion resultado;
		
		resultado = new Fraccion(signo*numerador*d, denominador*n);
		
		return resultado;
		
	}
	
	@Override
	public String toString() {
		
		if(signo == 1) {
			
			return (numerador + "/" + denominador);
			
		}else {
			
			return ("-" + numerador + "/" + denominador);
		}
		
	}



	public int getNumerador() {
		return numerador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}


	public int getDenominador() {
		return denominador;
	}


	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}


	
}
