package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Jugador {
	
	//Atributos

	private ArrayList<Coordenada> barcos;
	
	//Constructor
	public Jugador() {
		super();
		this.barcos = new ArrayList<Coordenada>();
	}
	
	public void setBarcos(Coordenada e) {
		this.barcos.add(e);
	}
	
	
	public void Atacar(int x, int y, Tablero matriz, GridPane tablero ) {
		ArrayList<Integer> coordenada = new ArrayList<Integer>();
		
		ArrayList<Coordenada> Casillas = matriz.getCasillas();
		
		coordenada.add(y);
		coordenada.add(x);
		
		Coordenada coordenadaActaul;
		
		for(int i=0; i<100; i=i+1) {
			coordenadaActaul = Casillas.get(i);
			if(coordenadaActaul.getCoordenadas().toString().equals(coordenada.toString())) {
				
				if(!coordenadaActaul.getEstadoGolpe()) {
					coordenadaActaul.setEstadoGolpe();
					System.out.println("1");
					
					if(coordenadaActaul.isEstado()) {
						System.out.println("2");
						java.io.FileInputStream fis = null;
						try {
							fis = new FileInputStream("/home/betozumbado/Desktop/Proyects/IC-2101-POO-2020-ii-/Lab-06/"
									+ "Dardos/resources/fueguito.png");
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						ImageView iv = new ImageView(new Image(fis));
						tablero.add(iv, x,y);
						iv.toBack();
						


					}
					
					else {
						System.out.println("3");
						Text marca = new Text();
						marca.setText("X");
						marca.setOpacity(1);
						tablero.add(marca, x,y);
						
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
			
			if(barcos.get(i).getEstadoGolpe() && barcos.get(i).getTipo().equals("Barco")) {
				i++;
			}
		}
		
		return contador;
	}
}
