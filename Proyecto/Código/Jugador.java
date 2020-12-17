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
	
	
	public void Atacar(int x, int y, Tablero matriz, GridPane tablero, int turno) {
		ArrayList<Integer> coordenada = new ArrayList<Integer>();
		ArrayList<Casilla> Casillas = matriz.getCasillas();
		
		coordenada.add(y); coordenada.add(x);
		Casilla coordenadaActaul;
		
		for(int i=0; i<100; i=i+1) {
			
			coordenadaActaul = Casillas.get(i);
			if(coordenadaActaul.getCoordenadas().toString().equals(coordenada.toString())) {
				
				if(coordenadaActaul.getEstadoGolpe()== false) {
					
					if(turno == 1) {
						turno = 0;
					}
					else {
						turno = 1;
					}
					coordenadaActaul.setEstadoGolpe();
					System.out.println("1");
					
					if(coordenadaActaul.isEstado()) {
	
						
						System.out.println("2");
						java.io.FileInputStream fis = null;
						try {
							fis = new FileInputStream("resources/fueguito.png");
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
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
						ImageView iv = new ImageView(new Image(fis));
						tablero.add(iv, x, y);
						
					}
					
					return;
				}				
				

				System.out.println("4");
				return;
			}

		}
			
	}
	
	public int verificarPerdida() {
		int contador = 0;
		for(int i = 0; i<barcos.size();i++) {
			
			if(barcos.get(i).isEstado() && barcos.get(i).getEstadoGolpe()) {
				contador++;
			}
		}
		
		return contador;
	}

	public Tablero getMatriz() {
		return matriz;
	}

	public void setMatriz(Tablero matriz) {
		this.matriz = matriz;
	}


	
	
	
	
	
	
}
