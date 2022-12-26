package Capitulo9b;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Fraccion frac1=new Fraccion(5,6);
		Fraccion frac2=new Fraccion(7,2);
		System.out.println(frac1.multiplica(frac2).toString());
	}

}

class Fraccion{
	private double numerador; private double denominador;
	public Fraccion(double num, double den) {
		this.numerador=num;
		this.denominador=den;
	}
	public void invierte() {
		double extra=this.denominador;
		this.denominador=this.numerador;
		this.numerador=extra;
	}
	public double simplifica() {
		return this.numerador/this.denominador;
	}
	public Fraccion multiplica(Fraccion fr) {
		return new Fraccion(this.numerador*fr.numerador, this.denominador*fr.denominador);
	}
	public Fraccion divide(Fraccion fr) {
		return new Fraccion(this.numerador*fr.denominador, this.denominador*fr.numerador);
	}
	public String toString() {
		return numerador+"/"+denominador;
	}
}