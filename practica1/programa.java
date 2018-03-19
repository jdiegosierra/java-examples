package practica1;
import javax.swing.*;

public class programa {


	public static void main(String[] args) {
		//EJERCICIO 1 y 2
		/*Casilla casilla1=new Casilla();
		casilla1.pintaNegro(true);
		Casilla casilla2=new Casilla();
		casilla2.pintaNegro(false);
		
		if (casilla1.dameColor()!=casilla2.dameColor()) {
			casilla1.imprimeColor();
			casilla2.imprimeColor();
		}*/
		
		//System.out.print("Introduzca la dimension del tablero: ");
		//Scanner entrada=new Scanner(System.in);
		//int dimension = entrada.nextInt();
		
		String dimension=JOptionPane.showInputDialog("Introduzca la dimension del tablero (mínimo 5): ");
		int dimensionint = Integer.parseInt(dimension);
		Tablero tablero=new Tablero(dimensionint);
		String cantidad=JOptionPane.showInputDialog("Introduzca la cantidad de damas por persona a añadir: ");
		int cantidadInt = Integer.parseInt(cantidad);
		tablero.colocarDamas(cantidadInt);
		tablero.mostrarTablero();
		//entrada.close();
	}

}
