package Capitulo9b;

import java.text.DecimalFormat;

public class Ejercicio11 {

	public static void main(String[] args) {
		TarjetaRegalo t1 = new TarjetaRegalo(100);
		TarjetaRegalo t2 = new TarjetaRegalo(120);
		System.out.println(t1);
		System.out.println(t2);
		t1.gasta(45.90);
		t2.gasta(5);
		t2.gasta(200);
		t1.gasta(3.55);
		System.out.println(t1);
		System.out.println(t2);
		TarjetaRegalo t3 = t1.fusionaCon(t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

	}
	
}

class TarjetaRegalo{
	private int numero;
	private float saldo;
	public static DecimalFormat dosCeros = new DecimalFormat("0.00");
	
	public TarjetaRegalo(float saldo) {
		this.saldo=saldo;
		numero=(int)Math.random()*90000+10000;
	}
	public String toString() {
		return "Tarjeta nº "+numero+" – Saldo "+dosCeros.format(saldo)+"€";
	}
	
	public void gasta(double gasto) {
		if(this.saldo-gasto<0) {
			System.out.println("No tiene suficiente saldo para gastar "+dosCeros.format(gasto)+"€");
		}else {
		this.saldo-=gasto;
		}
	}
	public TarjetaRegalo fusionaCon(TarjetaRegalo segundaTarjeta) {
		TarjetaRegalo nuevaTarjeta = new TarjetaRegalo(this.saldo+segundaTarjeta.saldo);
		this.saldo=0;
		segundaTarjeta.saldo=0;
		return nuevaTarjeta;
	}
}