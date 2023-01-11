package Capitulo9b;

import java.text.DecimalFormat;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		Movil m1 = new Movil("678 11 22 33", "rata");
		Movil m2 = new Movil("644 74 44 69", "mono");
		Movil m3 = new Movil("622 32 89 09", "bisonte");
		System.out.println(m1);
		System.out.println(m2);
		m1.llama(m2, 320);
		m1.llama(m3, 200);
		m2.llama(m3, 550);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
		
	}

}
class Movil extends Terminal{
	
	private String tarifa;
	private float factura;
	private static DecimalFormat dosCeros = new DecimalFormat("0.00");
	
	public Movil(String numero, String tarifa) {
		super(numero);
		this.tarifa=tarifa;
		factura=0;
	}
	
	public void setTarifa(String tarifa) {
		this.tarifa=tarifa;
	}
	
	public String toString() {
		return "Nº "+this.getNumero() +" - "+ this.getTiempoLlamada()+"s de conversación - tarificados "+dosCeros.format(this.factura)+" euros";
	}
	
	public void llama(Movil movil, int tiempo) {
		this.incrementarTiempo(tiempo);
		movil.incrementarTiempo(tiempo);
		if(this.tarifa.equalsIgnoreCase("rata")) {
			this.factura+=tiempo*(0.06/(float)60);
		}else if((this.tarifa.equalsIgnoreCase("mono"))) {
			this.factura+=tiempo*(0.12/(float)60);
		}else {
			this.factura+=tiempo*(0.3/(float)60);
		}
	}
}
