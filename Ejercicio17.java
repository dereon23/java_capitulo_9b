package Capitulo9b;

public class Ejercicio17 {
	public static void main(String[] args) {
		Piramide p = new Piramide(4);
		Rectangulo r1 = new Rectangulo(4, 3);
		Rectangulo r2 = new Rectangulo(6, 2);
		System.out.println(p);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("Pirámides creadas: " + Piramide.getPiramidesCreadas());
		System.out.println("Rectángulos creados: " + Rectangulo.getRectangulosCreados());
	}
}

class Piramide{
	private int altura; private static int piramidesCreadas=0;
	public Piramide(int altura) {
		this.altura=altura; piramidesCreadas++;
	}
	public String toString() {
		String piramide="";
		for(int i=0;i<4;i++) {
			for(int j=0;j<altura*2-1;j++) {
				if(j>=altura-1-i&&j<=altura-1+i) {
					piramide+="*";
				}else {
					piramide+=" ";
				}
			}
			piramide+="\n";
		}
		return piramide;
	}
	public static int getPiramidesCreadas() {
		return piramidesCreadas;
	}
}
class Rectangulo{
	private int ancho, altura; private static int rectangulosCreados=0;
	public Rectangulo(int ancho, int altura) {
		this.ancho=ancho; this.altura=altura; rectangulosCreados++;
	}
	public String toString() {
		String rectangulo="";
		for(int i=0; i<altura;i++) {
			for(int j=0;j<ancho;j++) {
				rectangulo+="*";
			}
			rectangulo+="\n";
		}
		return rectangulo;
	}
	public static int getRectangulosCreados() {
		return rectangulosCreados;
	}
}