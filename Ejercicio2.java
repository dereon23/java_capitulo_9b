package Capitulo9b;
import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		Bicicleta bici1 = new Bicicleta(0);
		Coche coch1 = new Coche(0);
		int elec;
		Scanner s=new Scanner(System.in);
		boolean salir=false;
		while(!salir) {
			System.out.println("VEHÍCULOS\n"
					+ "=========\n"
					+ "1. Anda con la bicicleta\n"
					+ "2. Haz el caballito con la bicicleta\n"
					+ "3. Anda con el coche\n"
					+ "4. Quema rueda con el coche\n"
					+ "5. Ver kilometraje de la bicicleta\n"
					+ "6. Ver kilometraje del coche\n"
					+ "7. Ver kilometraje total\n"
					+ "8. Salir\n"
					+ "Elige una opción (1-8):");
			elec=s.nextInt();
			switch(elec) {
				case 1: bici1.andar();
					break;
				case 2: bici1.caballito();
					break;
				case 3: coch1.andar();
					break;
				case 4: coch1.quemarRueda();
					break;
				case 5: System.out.println(bici1.verKm());
					break;
				case 6: System.out.println(coch1.verKm());
					break;
				case 7: System.out.println(Vehiculo.verKmT());
					break;
				default: salir=true;
			}
		}
		
		
		
	}
	

}

class Vehiculo{
	protected static int vehiculosCreados=0;
	protected static double kilometrosTotales;
	protected double kilometrosRecorridos;
	public double verKm() {
		return this.kilometrosRecorridos;
	}
	public static double verKmT() {
		return kilometrosTotales;
	}
}

class Bicicleta extends Vehiculo{
	public Bicicleta(double kR) {
		kilometrosRecorridos=kR;
		vehiculosCreados++;
	}
	public void andar() {
		System.out.println("andando");
		kilometrosRecorridos+=1;
		kilometrosTotales+=1;
	}
	public void caballito() {
		System.out.println("haciendo el caballito");
		kilometrosRecorridos+=0.01;
		kilometrosTotales+=0.01;
	}
}

class Coche extends Vehiculo{
	public Coche(double kR){
		kilometrosRecorridos=kR;
		vehiculosCreados++;
	}
	public void andar() {
		System.out.println("andando");
		kilometrosRecorridos+=10;
		kilometrosTotales+=10;
	}
	public void quemarRueda() {
		System.out.println("quemando rueda");
		kilometrosRecorridos+=30;
		kilometrosTotales+=30;
	}
}
