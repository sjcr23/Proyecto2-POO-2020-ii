package application;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Coordenada>casillas;
	private ArrayList<Barco> barcos;
	
	
	public Tablero() {
		super();
		this.casillas = new ArrayList<Coordenada>();
		this.barcos = new ArrayList<Barco>();
	}

	public void setCoordenadas() {
		for(int i = 0; i<10;i=i+1)
			for(int j = 0; j<10;j=j+1) {
				Coordenada coordenada = new Coordenada();
				coordenada.setCoordenada(i, j);
				this.casillas.add(coordenada);
			}
	}
	
	
	
	

	public ArrayList<Coordenada> getCasillas() {
		return casillas;
	}

	public ArrayList<Barco> getBarcos() {
		return barcos;
	}

	public void setBarcos(ArrayList<Barco> barcos) {
		this.barcos = barcos;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
