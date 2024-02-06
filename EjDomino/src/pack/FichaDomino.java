package pack;

import java.util.Random;

public class FichaDomino {

	private int izq;
	private int der;

	Random aleatorio = new Random();

	public FichaDomino() {
		this.izq = aleatorio.nextInt(6);
		this.der = aleatorio.nextInt(6);
	}
	
	public FichaDomino(int izq, int der) {
		this.izq = izq;
		this.der = der;
	}

	

	public void girarFicha(){
		int auxIzq;
		int auxDer;
		
		auxIzq = this.izq;
		auxDer = this.der;
		
		this.izq=auxDer;
		this.der=auxIzq;
				
	}
	
	
	
	@Override
	public String toString() {

		if ((izq == 0) && (der == 0)) {
		return "[" + " " + "|" + " " + "]";	
		}
		if (izq == 0) {
			return "[" + " " + "|" + der + "]";

		} else if (der == 0) {
			return "[" + izq + "|" + " " + "]";
		
					
		} else {
			return "[" + izq + "|" + der + "]";
		}

	}

	public int getIzq() {
		return izq;
	}

	public void setIzq(int izq) {
		this.izq = izq;
	}

	public int getDer() {
		return der;
	}

	public void setDer(int der) {
		this.der = der;
	}

	
	
	
	
	
}
