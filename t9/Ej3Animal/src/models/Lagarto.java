package models;

public class Lagarto extends Animal {

	//public Lagarto() {}
	
	public Lagarto(String s) {
		
		super(s);
		
	}
	
	public void tomaElSol() {
		
		System.out.println("Estoy tomando el Sol");
		
	}
	public void baniate() {
		
		System.out.println("Me estoy dando un chapuzón");
		
	}
	public void escondete() {
		
		System.out.println("Me he escondido, ya no me puedes ver");
		
	}
	
	@Override
	public void dormir() {
		
		System.out.println("grgrgrgrgr");
		
	}
	
	
	
	
}
