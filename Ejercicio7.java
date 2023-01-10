package Capitulo9b;
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Zona principal =new Zona(1000);
		Zona compraventa = new Zona(200);
		Zona vip = new Zona(25);
		int cantidad;
		
		boolean salir=false;
		while(!salir) {
		System.out.println("1. Mostrar número de entradas libres");
		System.out.println("2. Vender entradas");
		System.out.println("3. Salir");
		int opcion = s.nextInt();
		
			switch(opcion) {
			case 1:
				System.out.println("Zona Principal: "+principal.getEntradasPorVender());
				System.out.println("Zona de compraventa: "+compraventa.getEntradasPorVender());
				System.out.println("Zona VIP: "+vip.getEntradasPorVender()+'\n');
				break;
			case 2:
				System.out.println("Elija una zona:");
				System.out.println("1. Principal");
				System.out.println("2. Compraventa");
				System.out.println("3. VIP");
				opcion=s.nextInt();
				System.out.println("Introduzca la cantidad de entradas");
				cantidad=s.nextInt();
				switch(opcion) {
				case 1: principal.vender(cantidad); break;
				case 2: compraventa.vender(cantidad); break;
				default: vip.vender(cantidad);
				}
				break;
			default: 
				salir=true;
				;
			}
		}
		System.out.println("\nSaliendo del programa");
		
	}
}

class Zona {
	private int entradasPorVender;
	
	public Zona(int n){
		entradasPorVender = n;
	}
	
	public int getEntradasPorVender() {
		return entradasPorVender;
	}
	
	/**
	* Vende un número de entradas.
	* Comprueba si quedan entradas libres antes de realizar la venta.
	*
	* @param n número de entradas a vender
	*/
	public void vender(int n) {
		
		if (this.entradasPorVender == 0) {
			System.out.println("Lo siento, las entradas para esa zona están agotadas.");
		} else if (this.entradasPorVender < n) {
			System.out.println("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
		}
		
		if (this.entradasPorVender >= n) {
		entradasPorVender -= n;
		System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
		}
		
	}
}
