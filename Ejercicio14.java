package Capitulo9b;

public class Ejercicio14 {
	public static void main(String[] args) {
		FichaDomino f1 = new FichaDomino(6, 1);
		FichaDomino f2 = new FichaDomino(0, 4);
		FichaDomino f3 = new FichaDomino(3, 3);
		FichaDomino f4 = new FichaDomino(0, 1);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f2.voltea());
		System.out.println(f2.encaja(f4));
		System.out.println(f1.encaja(f4));
		System.out.println(f1.encaja(f3));
		System.out.println(f1.encaja(f2));
	}
}


class FichaDomino{
	public int numero1; public int numero2;
	public FichaDomino(int num1, int num2) {
		numero1=num1; numero2=num2;
	}
	public String toString() {
		if(numero1==0&&numero2==0) {
			return "[ | ]";
		}else if(numero1==0) {
			return "[ |"+numero2+"]";
		}else if(numero2==0){
			return "["+numero1+"| ]";
		}else {
			return "["+numero1+"|"+numero2+"]";
		}
	}
	public FichaDomino voltea() {
		return new FichaDomino(numero2,numero1);
	}
	public boolean encaja(FichaDomino ficha) {
	 if(this.numero1==ficha.numero1||this.numero1==ficha.numero2||
		this.numero2==ficha.numero1||this.numero2==ficha.numero2) {
		 	return true;
	 	}else {
	 		return false;
	 	}
	}
}
