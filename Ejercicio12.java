package Capitulo9b;

public class Ejercicio12 {
	public static void main(String[] args) {
		Libro libro1 = new Libro("123456", "La Ruta Prohibida", 2007);
		Libro libro2 = new Libro("112233", "Los Otros", 2016);
		Libro libro3 = new Libro("456789", "La rosa del mundo", 1995);
		Revista revista1 = new Revista("444555", "Año Cero", 2019, 344);
		Revista revista2 = new Revista("002244", "National Geographic", 2003, 255);
		System.out.println(libro1);
		System.out.println(libro2);
		System.out.println(libro3);
		System.out.println(revista1);
		System.out.println(revista2);
		libro2.presta();
		if (libro2.estaPrestado()) {
		System.out.println("El libro está prestado");
		}
		libro2.presta();
		libro2.devuelve();
		if (libro2.estaPrestado()) {
		System.out.println("El libro está prestado");
		}
		libro3.presta();
		System.out.println(libro2);
		System.out.println(libro3);
	}
}

class Publicacion{
	protected String ISBN;
	protected String titulo;
	protected int añoPublicacion;
	public Publicacion(String ISBN, String titulo, int añoPublicacion) {
		this.ISBN=ISBN;
		this.titulo=titulo;
		this.añoPublicacion=añoPublicacion;
	}
}

interface Prestable{
	public void presta();
	public void devuelve();
	public boolean estaPrestado();
}

class Libro extends Publicacion implements Prestable{
	boolean prestado;
	public Libro(String ISBN, String titulo, int añoPublicacion){
		super(ISBN, titulo, añoPublicacion);
		prestado=false;
	}
	public String toString() {
		if(estaPrestado()) {
			return "ISBN: "+ISBN+", título: "+titulo+", año de publicación: "+añoPublicacion+" (prestado)";
		}else {
			return "ISBN: "+ISBN+", título: "+titulo+", año de publicación: "+añoPublicacion+" (no prestado)";
		}
	}
	@Override
	public void presta(){
		if(estaPrestado()) {
			System.out.println("Lo siento, ese libro ya está prestado.");
		}else {
		prestado=true;
		}
	}
	@Override
	public void devuelve() {
		prestado=false;
	}
	@Override
	public boolean estaPrestado() {
		return this.prestado;
	}
}

class Revista extends Publicacion{
	private int numero;
	public Revista(String ISBN, String titulo, int añoPublicacion, int numero) {
		super(ISBN, titulo, añoPublicacion);
		this.numero=numero;
	}
	public String toString() {
		return "ISBN: "+ISBN+", título: "+titulo+", año de publicación: "+añoPublicacion;
	}
}