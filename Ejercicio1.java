package Capitulo9b;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		Caballo cab1=new Caballo(2.3, 190.5, true, "Carlos");
		Caballo cab2=new Caballo(2.1, 174.2, false, "Carla");
		
		cab2.comer();
		cab1.correr();
		cab1.beber();
		
	}

}


class Caballo{
	
	private double altura;
	private double peso;
	private boolean macho;
	private String nombre;
	
	public Caballo(double altura, double peso, boolean macho, String nombre) {
		this.altura=altura;
		this.peso=peso;
		this.macho=macho;
		this.nombre=nombre;
	}
	
	public void correr() {
		System.out.println("clack clack clack");
	}
	
	public void comer() {
		System.out.println("munch munch munch");
	}
	
	public void beber() {
		System.out.println("glup glup glup");
	}
	
	
	
}
