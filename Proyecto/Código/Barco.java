package application;

public class Barco {
	
	//Atributos
	private String tipo;
	private int largo;
	private int orientacion;
	private int cantidadDeGolpes;
	private Coordenada posicion[];
	private boolean condicion;
	
	
	//Constructor
	public Barco(String tipo, int largo, int orientacion) {
		super();
		this.tipo = tipo;
		this.largo = largo;
		this.orientacion = 0;
		this.cantidadDeGolpes = 0;
		this.posicion = new Coordenada[largo];
		this.condicion = false;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getLargo() {
		return largo;
	}


	public void setLargo(int largo) {
		this.largo = largo;
	}


	public int getOrientacion() {
		return orientacion;
	}


	public void setOrientacion(int orientacion) {
		this.orientacion = orientacion;
	}


	public int getCantidadDeGolpes() {
		return cantidadDeGolpes;
	}


	public void setCantidadDeGolpes(int cantidadDeGolpes) {
		this.cantidadDeGolpes = cantidadDeGolpes;
	}


	public Coordenada[] getPosicion() {
		return posicion;
	}


	public void setPosicion(Coordenada[] posicion) {
		this.posicion = posicion;
	}


	public boolean isCondicion() {
		return condicion;
	}


	public void setCondicion(boolean condicion) {
		this.condicion = condicion;
	}
	
	
	
	
	
	
}
