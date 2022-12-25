package Capitulo9b;

public class Ejercicio3 {
	public static void main(String[] args) {
		Perro per1=new Perro();
		Pinguino pin1=new Pinguino();
		Lagarto lag1=new Lagarto();
		per1.comer(); per1.correr(); System.out.println(per1.hambriento()); per1.guau();
		pin1.comerPescado(); pin1.darPescado(per1);
		lag1.comerMosca(); lag1.croak();
	}
}


class Animal{
	private boolean lleno;
	public void comer() {
		lleno=true;
		System.out.println("comiendo");
	}
	public void correr() {
		lleno=false;
		System.out.println("corriendo");
	}
	public boolean hambriento() {
		return !lleno;
	}
}

class Mamifero extends Animal{
	private int patasEnSuelo;
	public void pararseEnNPatas(int N) {
		patasEnSuelo=N;
		System.out.println("Parado a "+N+" patas");
	}
	public void acostarse() {
		System.out.println("acostado");
		patasEnSuelo=0;
	}
	public int paradoA() {
		return patasEnSuelo;
	}
}

class Ave extends Animal{
	private boolean peinado;
	public void picar() {
		System.out.println("picando");
	}
	public void peinarPlumas() {
		System.out.println("peinando plumas");
		peinado=true;
	}
	public void aletear() {
		System.out.println("aleteando");
		peinado=false;
	}
}

class Gato extends Mamifero{
	public void miau() {
		System.out.println("miau");
	}
	public void miau2() {
		System.out.println("miau miau");
	}
	public void miau3() {
		System.out.println("miau miau miau");
	}
}

class Perro extends Mamifero{
	public void guau() {
		System.out.println("guau");
	}
	public void ladrar() {
		System.out.println("guau guau");
	}
	public void ladrarMucho() {
		System.out.println("guau guau guau");
	}
}

class Canario extends Ave{
	public void tui() {
		System.out.println("tui");
	}
	public void piar() {
		System.out.println("tui tui");
	}
	public void piarMucho() {
		System.out.println("tui tui tui");
	}
}

class Pinguino extends Ave{
	public void comerPescado() {
		this.comer();
		System.out.println("comiendo pescado");
	}
	public void darPescado(Mamifero mam) {
		mam.comer();
		System.out.println("Dando de comer a un mamifero");
	}
	public void darPescado(Ave ave) {
		ave.comer();
		System.out.println("Dando de comer a un ave");
	}
}

class Lagarto extends Animal{
	public void comerMosca() {
		this.comer();
		System.out.println("Comiendo mosca");
	}
	public void expulsarMoscar() {
		this.correr();
		System.out.println("Mosca expulsada");
	}
	public void croak() {
		System.out.println("croak");
	}
}