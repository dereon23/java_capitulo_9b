package Capitulo9b;

import java.text.DecimalFormat;

public class Ejercicio13 {

	public static void main(String[] args) {
		CuentaCorriente cuenta1 = new CuentaCorriente();
		CuentaCorriente cuenta2 = new CuentaCorriente(1500);
		CuentaCorriente cuenta3 = new CuentaCorriente(6000);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);
		cuenta1.ingreso(2000);
		cuenta2.cargo(600);
		cuenta3.ingreso(75);
		cuenta1.cargo(55);
		cuenta2.transferencia(cuenta3, 100);
		System.out.println(cuenta1);
		System.out.println(cuenta2);
		System.out.println(cuenta3);

	}
}


class CuentaCorriente{
	private double dinero;
	private String numero;
	public static DecimalFormat dosCeros=new DecimalFormat("0.00");
	public CuentaCorriente(){
		dinero=0;
		numero="";
		for(int i=0;i<10;i++) {
			numero+=(int)(Math.random()*10);
		}
	}
	public CuentaCorriente(double dinero) {
		this.dinero=dinero;
		numero="";
		for(int i=0;i<10;i++) {
			numero+=(int)(Math.random()*10);
		}
	}
	public String toString() {
		return "Número de cta: "+numero+" Saldo: "+dosCeros.format(dinero)+" €";
	}
	public void ingreso(double ingresos) {
		dinero+=ingresos;
	}
	public void cargo(double cargos) {
		dinero-=cargos;
	}
	public void transferencia(CuentaCorriente cuenta, double transferido) {
			this.dinero-=transferido;
			cuenta.dinero+=transferido;
	}
}