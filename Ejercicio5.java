package Capitulo9b;

public class Ejercicio5 {
	public static void main(String[] args) {
		Pizza p1 = new Pizza("margarita", "mediana");
		Pizza p2 = new Pizza("funghi", "familiar");
		p2.sirve();
		Pizza p3 = new Pizza("cuatro quesos", "mediana");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.sirve();
		System.out.println("pedidas: " + Pizza.getTotalPedidas());
		System.out.println("servidas: " + Pizza.getTotalServidas());
	}
}

class Pizza{
	private static int servidas=0;
	private static int pedidas=0;
	private String tamano;
	private String tipo;
	private String estado;
	public Pizza(String tipo, String tamano){
		this.tipo=tipo;
		this.tamano=tamano;
		estado="pedida";
		pedidas++;
	}
	public void sirve(){
		if(estado.equalsIgnoreCase("pedida")) {
			estado="servida";
			servidas++;
			pedidas--;
		}else {
			System.out.println("Esa pizza ya se ha servido");
		}
	}
	public String toString() {
		return tipo+" "+tamano+", "+estado;
	}
	public static int getTotalPedidas() {
		return pedidas;
	}
	public static int getTotalServidas() {
		return servidas;
	}
	
}
