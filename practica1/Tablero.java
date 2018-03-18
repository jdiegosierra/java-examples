package practica1;
import java.util.Random;

public class Tablero {
	
	private Casilla [][] tablero=null;
	private int dimension;
	
	public Tablero(int dimension) {
		
		this.dimension = dimension;
		tablero =new Casilla[dimension][dimension];
		rellenar(dimension);
	}
	
	private void rellenar(int dimension) {
		Random random = new Random();
		Boolean negro = random.nextBoolean();

		for(int i=0; i<dimension; ++i) {
			for(int j=0; j<dimension; ++j) {
				tablero[i][j] = new Casilla(negro);
				negro = (negro == false);
			}
			if (dimension%2 == 0)
				negro = (negro == false);
		}
	}
	
	public void mostrarTablero() {
		System.out.println("Tablero:");
		for(int i=0; i<dimension; ++i) {
			System.out.print("   ");
			for(int j=0; j<dimension; ++j) {
				this.tablero[i][j].imprimeColor();
				System.out.print("  ");
			}
			System.out.print("\n");
		}
		
	}
	
	public void colocarDamas() {
		
	}

}
