package Capitulo9b;

public class Ejercicio6 {

	public static void main(String[] args) {
		Tiempo t=new Tiempo(4,23,12);
		Tiempo t2 = new Tiempo(3,54,16);
		System.out.println(t.suma(t2));
		System.out.println(t.resta(t2));
	}
}

class Tiempo{
	private int horas;
	private int minutos;
	private int segundos;
	public Tiempo(int horas, int minutos, int segundos) {
		this.horas=horas;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	public String toString() {
		return horas+"h "+minutos+"m "+segundos+"s";
	}
	public Tiempo suma(Tiempo t) {
		return new Tiempo(this.horas+t.horas+((this.minutos+t.minutos+((this.segundos+t.segundos)/60))/60),
				(this.minutos+t.minutos+(this.segundos+t.segundos)/60)%60,(this.segundos+t.segundos)%60);
	}
	public Tiempo resta(Tiempo t) {
		int carrym=0; int carryh=0;
		if(this.segundos-t.segundos<0) {carrym=1;}
		if(this.minutos-t.minutos-carrym<0) {carryh=1;}
		return new Tiempo(this.horas-t.horas-carryh,(this.minutos-t.minutos-carrym+60)%60,(this.segundos-t.segundos+60)%60);
	}
}
