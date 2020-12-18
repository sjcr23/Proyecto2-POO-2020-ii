package application;

import java.util.ArrayList;

public class Tablero {
	//Lista de casillas
	private ArrayList<Casilla> casillas;
	
	
	public Tablero() {
		super();
		this.casillas = new ArrayList<Casilla>();
	}
	//FUnción encargada de rellenar esa lista de casillas que conforman el tablero
	public void setCoordenadas() {
		for(int i = 0; i<10;i=i+1)
			for(int j = 0; j<10;j=j+1) {
				Casilla coordenada = new Casilla();
				coordenada.setCoordenada(i, j);
				this.casillas.add(coordenada);
			}
	}
	
	
	
	
	public ArrayList<Casilla> getCasillas() {
		return casillas;
	}

	
	
	
	
	
	
	
	
	

	
	
	
}
