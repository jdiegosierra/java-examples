package practica1;

public class Dama {
	
	private char color;
	
	public char dameColor() {
		return color;
	}
	
	public void pintaColor(char color) {
		this.color = color;
	}
	
	public void imprimeColor() {
		System.out.println("El color de la dama es: " + color);
	}
	
	public Boolean comparaColor(Dama dama) {
		return color == dama.dameColor();
	}

}
