package Capitulo9b;

public class Ejercicio16 {
	public static void main(String[] args) {
		Punto p1 = new Punto(4.21, 7.3);
		Punto p2 = new Punto(-2, 1.66);
		Linea l = new Linea(p1, p2);
		System.out.println(l);
	}
}

class Punto{
	public double coordx, coordy;
	public Punto(double coordx, double coordy) {
		this.coordx=coordx; this.coordy=coordy;
	}
}
class Linea{
	private Punto inicio, fin;
	public Linea(Punto inicio,Punto fin) {
		this.inicio=inicio; this.fin=fin;
	}
	public String toString() {
		return "Línea formada por los puntos ("+inicio.coordx+", "+inicio.coordy+") y ("+fin.coordx+", "+fin.coordy+")";
	}
}