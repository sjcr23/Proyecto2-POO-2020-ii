package application;

import java.util.ArrayList;

public class Tablero {
	
	private ArrayList<Coordenada>casillas;
	
	
	public Tablero() {
		super();
		this.casillas = new ArrayList<Coordenada>();
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
