package application;

import java.util.ArrayList;

public class Coordenada {
	
	
	private ArrayList<Integer>  coordenadas;
	private boolean Estado;
	
	public Coordenada() {
		this.coordenadas = new ArrayList<Integer>();
		this.Estado = false;
	}
	
	
	public void setCoordenada(int x, int y) {
		this.coordenadas.add(x);
		this.coordenadas.add(y);
	}
	
	public void setEstado() {
		this.Estado = true;
	}


	public boolean isEstado() {
		return Estado;
	}


	public ArrayList<Integer> getCoordenadas() {
		return coordenadas;
	}

	
	
}
