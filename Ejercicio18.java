package Capitulo9b;

public class Ejercicio18 {

	public static void main(String[] args) {
		Incidencia inc1 = new Incidencia(105, "No tiene acceso a internet");
		Incidencia inc2 = new Incidencia(14, "No arranca");
		Incidencia inc3 = new Incidencia(5, "La pantalla se ve rosa");
		Incidencia inc4 = new Incidencia(237, "Hace un ruido extraño");
		Incidencia inc5 = new Incidencia(111, "Se cuelga al abrir 3 ventanas");
		inc2.resuelve("El equipo no estaba enchufado");
		inc3.resuelve("Cambio del cable VGA");
		System.out.println(inc1);
		System.out.println(inc2);
		System.out.println(inc3);
		System.out.println(inc4);
		System.out.println(inc5);
		System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
	}
}

class Incidencia{
	private int numero, puesto; private String problema, resolucion, estado;
	private static int incidenciasCreadas=0, pendientes=0;
	public Incidencia(int puesto, String problema) {
		this.puesto=puesto; this.problema=problema; estado="Pendiente";
		incidenciasCreadas++;numero=incidenciasCreadas; pendientes++;
	}
	public void resuelve(String resolucion) {
		if(estado.equals("Pendiente")) {
		this.resolucion=resolucion;
		estado="Resuelta";
		pendientes--;
		}
	}
	public String toString() {
		if(estado.equals("Pendiente")) {
		return "Incidencia "+numero+" - Puesto: "+puesto+" - "+problema+" - "+estado;
		}else {
		return "Incidencia "+numero+" - Puesto: "+puesto+" - "+problema+" - "+estado+" - "+resolucion;
		}
	}
	public static int getPendientes() {
		return pendientes;
	}
}