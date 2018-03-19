package practica1;
import java.util.Random;

public class Tablero {
	
	static final char BLANCO = 'B';
	static final char NEGRO = 'N';
	
	private Casilla [][] tablero=null;
	private int dimension;
	
	public Tablero(int dimension) {
		
		if (dimension < 5)
			dimension = 5;		
		this.dimension = dimension;
		tablero =new Casilla[dimension][dimension];
		rellenar(dimension);
	}
	
	private void rellenar(int dimension) {
		Random random = new Random(System.currentTimeMillis());
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
				tablero[i][j].imprimeColor();
				System.out.print("  ");
			}
			System.out.print("\n\n");
		}
		System.out.println("Damas:");
		for(int i=0; i<dimension; ++i) {
			System.out.print("   ");
			for(int j=0; j<dimension; ++j) {
				if (tablero[i][j].tieneDama())
					System.out.println("Dama " + tablero[i][j].dameColor() + " en " + "(" + i + ", " + j + ")");
			}
		}
		
	}
	
	public void colocarDamas(int cantidad) {
		Random random = new Random(System.currentTimeMillis());
		//int counter = 0;
		//generar dos numeros aleatorios		
		for(int ndamas=0; ndamas<cantidad; ++ndamas) {
			Dama dama=new Dama(false);
			int posicion = random.nextInt(dimension);
			System.out.println("Se va a colocar una dama BLANCA en la posicion " + (posicion+1) + "º negra , si coincide con otra "
					+ "dama se eliminará");
			fin1:
			for (Casilla[] fila:tablero) {
				for (Casilla i: fila) {
					if (i.dameColor() == NEGRO) {
						if(posicion == 0) {
							i.asignaDama(dama);
							break fin1;
						}
						else
							--posicion;
					}
				}	
			}
		}
		for(int ndamas=0; ndamas<cantidad; ++ndamas) {
			Dama dama=new Dama(true);
			int posicion = random.nextInt(dimension);
			posicion = dimension*dimension/2-posicion-1;
			System.out.println("Se va a colocar una dama NEGRA en la posicion " + (posicion+1) + "º negra , si coincide con otra "
					+ "dama se eliminará");
			fin1:
			for (Casilla[] fila:tablero) {
				for (Casilla i: fila) {
					if (i.dameColor() == NEGRO) {
						if(posicion == 0) {
							i.asignaDama(dama);
							break fin1;
						}
						else
							--posicion;
					}
				}	
			}
		}
	}
	
	public boolean mover(int x1, int y1, int x2, int y2) {
		if (x1+1>dimension || y1+1>dimension || x2+1>dimension || y2+1>dimension) {
			System.out.println("Alguna coordenada supera los límites del tablero");
			return false;
		}
		if(tablero[x1][y1].tieneDama() == false) {
			System.out.println("No hay ninguna dama en el origen especificado");
			return false;
		}
		if(tablero[x2][y2].tieneDama() == true) {
			System.out.println("Hay una dama en el destino especificado");
			return false;
		}
		//FALTA ACABAR FUNCION MOVER
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		return true;
	}
}
