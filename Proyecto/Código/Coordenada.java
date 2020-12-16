package application;

import java.util.ArrayList;

public class Coordenada {
	
	private String tipo;
	private ArrayList<Integer>  coordenadas;
	private boolean Estado;
	private boolean estadoGolpe;
	
	public Coordenada() {

		this.tipo = "Agua";
		this.coordenadas = new ArrayList<Integer>();
		this.Estado = false;
		this.estadoGolpe = false;
	}
	
	
	public void setCoordenada(int x, int y) {
		this.coordenadas.add(x);
		this.coordenadas.add(y);
	}
	
	public void setEstado() {
		this.Estado = true;
	}

	public void setTipo() {
		this.tipo = "Barco";
	}

	public boolean isEstado() {
		return Estado;
	}


	public ArrayList<Integer> getCoordenadas() {
		return coordenadas;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public boolean getEstadoGolpe() {
		return estadoGolpe;
	}


	public void setEstadoGolpe() {
		this.estadoGolpe = true;
	}
	
	
}
