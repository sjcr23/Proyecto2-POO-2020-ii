package application;
public class Tablero {
	
	private Coordenada casillas[];
	private Barco barcos[];
	
	
	public Tablero() {
		super();
		this.casillas = new Coordenada[100];
		this.barcos = new Barco[9];
	}

	
	public Coordenada[] getCasillas() {
		return casillas;
	}

	public void setCasillas(Coordenada[] casillas) {
		this.casillas = casillas;
	}

	public Barco[] getBarcos() {
		return barcos;
	}

	public void setBarcos(Barco[] barcos) {
		this.barcos = barcos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
