package practica1;

public class Casilla {
	static final char BLANCO = 'B';
	static final char NEGRO = 'N';
	
	private char color;
	
	public Casilla(boolean negro) {
		pintaNegro(negro);
	}
	
	public char dameColor() {
		return color;
	}
	
	public void pintaNegro(boolean negro) {
		if (negro)
			color = NEGRO;
		else
			color = BLANCO;
	}
	
	public void imprimeColor() {
		System.out.print(color);
	}
	
	public Boolean comparaColor(Casilla casilla) {
		return color == casilla.dameColor();
	}
}

