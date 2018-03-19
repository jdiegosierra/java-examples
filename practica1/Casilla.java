package practica1;

public class Casilla {
	static final char BLANCO = 'B';
	static final char NEGRO = 'N';
	private Dama dama;
	private char color;
	
	public Casilla(boolean negro) {
		pintaNegro(negro);
	}
	
	public char dameColor() {
		return color;
	}
	
	public void asignaDama(Dama dama) {
		this.dama = dama;
	}
	
	public boolean tieneDama() {
		if(dama != null)
			return true;
		return false;
	}
	
	public void pintaNegro(boolean negro) {
		if (negro)
			color = NEGRO;
		else
			color = BLANCO;
	}
	
	public void imprimeColor() {
		if (tieneDama())
			System.out.print("[" + dama.dameColor() +"]");
		else
			System.out.print(" " + color + " ");
	}
	
	public Boolean comparaColor(Casilla casilla) {
		return color == casilla.dameColor();
	}
}

