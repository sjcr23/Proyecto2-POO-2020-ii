package application;

import java.util.ArrayList;

public class Casilla {
	//Atributos 
	private String tipo;
	private ArrayList<Integer> coordenadas;
	//Este estado define si esta ocupada o desocupada la casilla
	private boolean Estado;
	//Este estado define si la casilla ha sido golpeada con un disparo o no 
	private boolean estadoGolpe;
	
	
	//Constructor 
	public Casilla() {

		this.tipo = "Agua";
		this.coordenadas = new ArrayList<Integer>();
		this.Estado = false;
		this.estadoGolpe = false;
	}
	
	//Métodos de Set y get de los atributos
	
	
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
