package Capitulo9b;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		Ameba a1 = new Ameba();
		a1.come(2);
		System.out.println(a1);
		Ameba a2 = new Ameba();
		a2.come(4);
		System.out.println(a2);
		a1.come(a2);
		System.out.println(a1);
		System.out.println(a2);
		a2.come(3);
		System.out.println(a2);
	}

}

class Ameba{
	private int peso;
	public Ameba(){
		peso=3;
	}
	public String toString() {
		return "Soy una ameba y peso "+this.peso+" microgramos.";
	}
	public void come(int gramos) {
		peso+=-1+gramos;
	}
	public void come(Ameba ameba) {
		peso+=-1+ameba.peso;
		ameba.peso=0;
	}
}
