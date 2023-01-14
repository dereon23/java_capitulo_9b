package Capitulo9b;

public class Ejercicio15 {
	public static void main(String[] args) {
		int i=1;
		FichaDomino[] fichas=new FichaDomino[8];
		fichas[0]=new FichaDomino((int)(Math.random()*10),(int)(Math.random()*10));
		while(i<8) {
			fichas[i]=new FichaDomino((int)(Math.random()*10),(int)(Math.random()*10));
			while(fichas[i-1].numero2!=fichas[i].numero1) {
				fichas[i]=new FichaDomino((int)(Math.random()*10),(int)(Math.random()*10));
			}
			i++;
		}
		for(FichaDomino ficha: fichas) {
			System.out.print(ficha+" ");
		}
	}
}
