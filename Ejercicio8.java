package Capitulo9b;

public class Ejercicio8 {
	public static void main(String[] args) {
		Terminal t1 = new Terminal("678 11 22 33");
		Terminal t2 = new Terminal("644 74 44 69");
		Terminal t3 = new Terminal("622 32 89 09");
		Terminal t4 = new Terminal("664 73 98 18");
		System.out.println(t1);
		System.out.println(t2);
		t1.llama(t2, 320);
		t1.llama(t3, 200);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
	}
}

class Terminal{
	private String numero;
	private int tiempoLlamado;
	public Terminal(String numero){
		this.numero=numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String toString(){
		return numero+" - "+tiempoLlamado+"s de conversacion";
	}
	public int getTiempoLlamada() {
		return tiempoLlamado;
	}
	public void incrementarTiempo(int tiempo) {
		this.tiempoLlamado+=tiempo;
	}
	public void llama(Terminal t, int tiempo) {
		this.incrementarTiempo(tiempo);
		t.incrementarTiempo(tiempo);
	}
}
