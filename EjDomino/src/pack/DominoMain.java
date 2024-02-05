package pack;

import java.util.Random;

public class DominoMain {

	static int contador = 0;
	static FichaDomino arrayDomino[] = new FichaDomino[28];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out
				.println("------------------------------------------------------------------------------------------");

		/* FichaDomino uno = new FichaDomino();
		FichaDomino dos = new FichaDomino(0, 1);

		System.out.println(uno.toString());

		uno.girarFicha();

		System.out.println();
		System.out.println(uno.toString());
		 */
	} // Fin main

	public static void insertarFicha() {

		FichaDomino ficha = new FichaDomino();

		arrayDomino[contador] = ficha;
		contador++;
	}

}
