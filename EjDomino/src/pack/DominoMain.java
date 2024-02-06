package pack;

import java.util.Random;
import java.util.Scanner;

public class DominoMain {

	public static Scanner entrada = new Scanner(System.in);
	static int contador = 0;
	static FichaDomino arrayDomino[] = new FichaDomino[28];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 0;

		System.out
				.println("------------------------------------------------------------------------------------------");

		/*
		 * FichaDomino uno = new FichaDomino(); FichaDomino dos = new FichaDomino(0, 1);
		 * 
		 * System.out.println(uno.toString());
		 * 
		 * uno.girarFicha();
		 * 
		 * System.out.println(); System.out.println(uno.toString());
		 */

		do {
			System.out.println();
			System.out.println();
			System.out.println("Elige una opcion");
			System.out.println("1 - Llenar array con fichas aleatorias");
			System.out.println("2 - Jugar partida");
			System.out.println("3 - Partida metodo 2");
			System.out.println("4 - Salir");

			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				llenarArray();

				break;

			case 2:
				partida();
				break;

			case 3:
				partida2();
				break;

			case 4:
				System.out.println("Hasta luego");
				break;

			default:
				System.out.println("La opción seleccionada no existe, pruebe de nuevo");

			}

		} while (menu != 4);

	} // Fin main

	public static void llenarArray() {

		for (int i = 0; i < arrayDomino.length; i++) {

			FichaDomino ficha = new FichaDomino();

			arrayDomino[contador] = ficha;
			contador++;

			System.out.print(arrayDomino[i].toString());

		}

	}

	public static void listarArray() {
		for (int i = 0; i < arrayDomino.length; i++) {
			System.out.print(arrayDomino[i].toString());
		}

	}

	public static void insertarFicha() {
		int izq, der;

		if (contador < 28) {

			System.out.println("Escribe el numero para la parte izquierda de la ficha");
			izq = entrada.nextInt();

			System.out.println("Escribe el numero para la parte derecha de la ficha");
			der = entrada.nextInt();

			FichaDomino fichaManual = new FichaDomino(izq, der);
			arrayDomino[contador] = fichaManual;
			contador++;

		} else {
			System.out.println("No hay huecos para crear mas fichas");
		}

	}

	public static void partida() {
		int aciertos = 0;
		System.out.print(arrayDomino[0].toString());

		for (int i = 1; i < arrayDomino.length; i++) {

			if (arrayDomino[aciertos].getDer() == arrayDomino[i].getIzq()) {

				System.out.print(arrayDomino[i].toString());
				aciertos = i;

			} else {
				arrayDomino[i].girarFicha();
			}

			if (arrayDomino[aciertos].getDer() == arrayDomino[i].getIzq()) {

				System.out.print(arrayDomino[i].toString());
				aciertos = i;
			}

		}

	}

	public static void partida2() {
		int aux = 0;
		arrayDomino[0].toString();

		for (int i = 0; i < arrayDomino.length; i++) {

			for (int x = 1; x < arrayDomino.length; x++) {

				do {
					if (arrayDomino[i].getDer() == arrayDomino[x].getIzq()) {

						System.out.print(arrayDomino[x].toString());
					} else {
						arrayDomino[x].girarFicha();
					}
					aux++;

				} while (aux == 2);
			}

		}

	}

}// fin
