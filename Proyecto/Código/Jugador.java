package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class Jugador {
	
	//Atributos

	private ArrayList<Casilla> barcos;
	private Tablero matriz;

	
	//Constructor
	public Jugador(Tablero matriz ) {
		super();
		this.barcos = new ArrayList<Casilla>();
		this.matriz = matriz;

	}
	
	public void setBarcos(Casilla e) {
		this.barcos.add(e);
	}
	
	//Proceso de atacar al oponente 
	public int Atacar(int x, int y, Tablero matriz, GridPane tablero, int turno) {
		//lista con el valor correspondiente a la coordenada a atacar
		ArrayList<Integer> coordenada = new ArrayList<Integer>();
		//Lista correspondiente todas las fichas del tablero 
		ArrayList<Casilla> Casillas = matriz.getCasillas();
		
		coordenada.add(y); coordenada.add(x);
		Casilla coordenadaActaul;
		
		//Para cada casilla del tablero.
		for(int i=0; i<100; i=i+1) {
			
			coordenadaActaul = Casillas.get(i);
			//si la casilla seleccionada es la que describen las coordenadas
			if(coordenadaActaul.getCoordenadas().toString().equals(coordenada.toString())) {
				//valida que en esa casilla no hayan ddo un ataque anterior
				if(coordenadaActaul.getEstadoGolpe() == false) {
					
					//registra el ataque en la casilla
					coordenadaActaul.setEstadoGolpe();
					System.out.println("1");
					//Si habia un barco en la casilla
					if(coordenadaActaul.isEstado()) {
	
						
						System.out.println("2");
						java.io.FileInputStream fis = null;
						try {
							// asigna el icono correspondiente a el ataque a un barco
							fis = new FileInputStream("resources/fueguito.png");
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//inserta en la casilla un determinado ícono que representa el ataque a un barco 
						ImageView iv = new ImageView(new Image(fis));
						tablero.add(iv, x, y);
						iv.toBack();
						
					}
		
					else {
						
						java.io.FileInputStream fis = null;
						try {
							fis = new FileInputStream("resources/canva-photo-editor.png");
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//inserta una X en la posición indicando el ataque
						ImageView iv = new ImageView(new Image(fis));
						tablero.add(iv, x, y);
						
					}
					
					return turno;
				}
				
				if(turno == 1) {
					turno = 0;
					return turno;
				}
				else {
					turno = 1;
					return turno;
				}
				


			}

		}
		return turno;
			
	}
	//Confirma si uno de los jugadores ah perdido
	public int verificarPerdida() {
		// barcos es una lista con las casillas ocupadas por barcos
		int contador = 0;
		for(int i = 0; i<barcos.size();i++) {
			// si la casilla i ha sido golpeada 
			if(barcos.get(i).isEstado() && barcos.get(i).getEstadoGolpe()) {
				contador++;
			}
		}
		//Mientras esta contador retorne menos de 21 significa que el jugador no ha ganado
		return contador;
	}

	public Tablero getMatriz() {
		return matriz;
	}

	public void setMatriz(Tablero matriz) {
		this.matriz = matriz;
	}


	
	
	
	
	
	
}
