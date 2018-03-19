package practica1;

public class Dama {
	static final char BLANCO = 'B';
	static final char NEGRO = 'N';
	private char color;
	private String movimiento;
	
	public Dama(boolean negro) {
		pintaNegro(negro);
		if(negro)
			movimiento = "diagonal adelante";
		else
			movimiento = "diagonal atras";
	}
	
	public char dameColor() {
		return color;
	}
	
	public String dameMovimiento() {
		if(dameColor() == BLANCO)
			return movimiento;
		else
			return movimiento;
	}
	
	public void pintaNegro(boolean negro) {
		if (negro)
			color = NEGRO;
		else
			color = BLANCO;
	}
	
	public void imprimeColor() {
		System.out.println("El color de la dama es: " + color);
	}
	
	public Boolean comparaColor(Dama dama) {
		return color == dameColor();
	}

}
