package application;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CONTROLADOR2 implements Initializable {
	int turno = 0;
	
	private Tablero matriz1;
	private Tablero matriz2;

	@FXML
	private Button guardarPosicion;
	
	@FXML
	private Button guardarPosicion1;
	
	@FXML
	private ComboBox<ImageView> botonBarco;
	
	@FXML
	private ComboBox<ImageView> botonBarco2;
	
	@FXML
	private ComboBox<String> EjeX;
	
	@FXML
	private ComboBox<String> EjeX1;
	
	@FXML
	private ComboBox<String> EjeY;
	
	@FXML
	private ComboBox<String> EjeY1;
	
	@FXML
	private ComboBox<String> posicion;
	
	@FXML
	private ComboBox<String> posicion1;
	
	@FXML
	private ImageView fondo;
	
	@FXML
	private ImageView portaAviones;
	
	@FXML
	private ImageView submarino1;
	
	@FXML
	private ImageView submarino2;
	
	@FXML
	private ImageView submarino3;
	
	@FXML
	private ImageView destructor1;
	
	@FXML
	private ImageView destructro2;
	
	@FXML
	private ImageView desctructor3;
	
	@FXML
	private ImageView fragata1;
	
	@FXML
	private ImageView fragata2;
	
	@FXML
	private GridPane tablero1;
	
	@FXML
	private GridPane tablero2;
	
	public ImageView rotarFicha(ImageView barco) {
		barco.setRotate(barco.getRotate() + 90);
		
		if(barco.equals(portaAviones)) {
			barco.setTranslateX(-45);
			barco.setTranslateY(45);

			return barco;
			
		}
		
		else if(barco.equals(submarino1) || barco.equals(submarino2) || 
					barco.equals(submarino3)) {
			
			barco.setTranslateX(-30);
			barco.setTranslateY(30);
			return barco;
		}
		
		else if(barco.equals(destructor1) || barco.equals(destructro2) || 
					barco.equals(desctructor3)) {
			
			
			barco.setTranslateX(-15);
			barco.setTranslateY(15);
			return barco;
			
		}
		
		return barco;
	}
	
	@FXML
	public void colocarBarcos(ActionEvent eventos) {
		if(turno == 0) {
			ponerImagen(tablero1,botonBarco, EjeX, EjeY, posicion, matriz1);
		}
		
		else {
			ponerImagen(tablero2, botonBarco2, EjeX1, EjeY1, posicion1, matriz2);
		}
	}
	
	
	public void ponerImagen(GridPane tablero, ComboBox<ImageView> botonBarco, ComboBox<String> EjeX,
			ComboBox<String> EjeY, ComboBox<String> posicion, Tablero matriz) {
		ArrayList<Coordenada> Casillas = matriz.getCasillas();
		Coordenada casilla;
		ImageView barcoSeleccionado = botonBarco.getSelectionModel().getSelectedItem();
		
		int ejex = Integer.parseInt(EjeX.getSelectionModel().getSelectedItem().toString())-1;
		int ejey = Integer.parseInt(EjeY.getSelectionModel().getSelectedItem().toString())-1;
		String orientacion = posicion.getSelectionModel().getSelectedItem().toString();
		
		ArrayList<ArrayList<Integer>> CoordenadasOcupadas = obtenerCoordenadas(ejey, ejex, orientacion, barcoSeleccionado);
		if(orientacion.equals("Vertical")) {
			
			rotarFicha(barcoSeleccionado);
	
		}
		for(int i=0; i<100; i=i+1) {
			casilla = Casillas.get(i);
			for(int k = 0; k< CoordenadasOcupadas.size();k=k+1) {
					
				if(casilla.getCoordenadas().toString().equals(CoordenadasOcupadas.get(k).toString())) {
					if(casilla.isEstado()) {
						
						if(barcoSeleccionado.getRotate() == 90) {
							barcoSeleccionado.setRotate(barcoSeleccionado.getRotate() - 90);
						}
						
						barcoSeleccionado.setTranslateX(0);
						barcoSeleccionado.setTranslateY(0);
						System.out.println("mamaste, perrito");
						return;
					}else {
						System.out.println("=========================");
					botonBarco.getItems().remove(barcoSeleccionado);
					casilla.setEstado();
					casilla.setTipo();
					
					System.out.println(casilla.getCoordenadas().toString() + " " + casilla.getTipo());	
					}
				}	
			}
		}
		
		
		tablero.add(barcoSeleccionado, ejex, ejey);
		barcoSeleccionado.toBack();
		
		
		if(botonBarco.getItems().isEmpty() && turno == 0) {
			this.turno = 1;

		}
		
	
		
	
		
	}
	
	public ComboBox<ImageView> getBotonBarco() {
		return botonBarco;
	}

	public void setBotonBarco(ComboBox<ImageView> botonBarco) {
		this.botonBarco = botonBarco;
	}

	public int getEjeX() {
		int ejex = Integer.parseInt(EjeX.getSelectionModel().getSelectedItem().toString())-1;
		return ejex;
	}

	public void setEjeX(ComboBox<String> ejeX) {
		EjeX = ejeX;
	}

	public int getEjeY() {
		int ejey = Integer.parseInt(EjeY.getSelectionModel().getSelectedItem().toString())-1;
		return ejey;
	}

	public void setEjeY(ComboBox<String> ejeY) {
		EjeY = ejeY;
	}

	public ComboBox<String> getPosicion() {
		return posicion;
	}

	public void setPosicion(ComboBox<String> posicion) {
		this.posicion = posicion;
	}

	public GridPane getTablero() {
		return tablero1;
	}
	
	
	Controller menu;
	
	public void setMenu(Controller menu) {
		
		this.menu = menu;
		
	}
	


		

	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		ObservableList<ImageView> barcosJugador = FXCollections.observableArrayList(portaAviones
				,submarino1,submarino2,
				submarino3,destructor1,destructro2,desctructor3,fragata1,fragata2);
		
		botonBarco.setItems(barcosJugador);
		
		
		ObservableList<String> ejes = FXCollections.observableArrayList("1", "2", "3","4", "5", "6", "7", "8", "9","10");
		EjeX.setItems(ejes);
		EjeY.setItems(ejes);
		EjeX1.setItems(ejes);
		EjeY1.setItems(ejes);
		


		ObservableList<String> orientacion = FXCollections.observableArrayList("Horizontal", "Vertical");
		posicion.setItems(orientacion);
		posicion1.setItems(orientacion);
		
		this.matriz1 = new Tablero();
		matriz1.setCoordenadas();
		
		this.matriz2 = new Tablero();
		matriz2.setCoordenadas();
		
	}
	//Pone las casillas, que los barcos cubren 
	public ArrayList<ArrayList<Integer>> obtenerCoordenadas(int x, int y, String orientacion, ImageView barco) {
		ArrayList<ArrayList<Integer>> coordenadas = new ArrayList<ArrayList<Integer>>();
		
		if (orientacion.contentEquals("Horizontal")) {
			if (barco.equals(portaAviones)) {
				
				for(int i = 0; i<4;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					y=y+1;
				}
			}else if (barco.equals(destructor1) || barco.equals(destructro2) || 
					barco.equals(desctructor3)) {
				
				for(int i = 0; i<2;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					y=y+1;
				}
			}else if (barco.equals(fragata1) || barco.equals(fragata2)) {
				
				for(int i = 0; i<1;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					y=y+1;
				}
			}else if (barco.equals(submarino1) || barco.equals(submarino2) || 
					barco.equals(submarino3)) {
				
				for(int i = 0; i<3;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					y=y+1;
				}
			}
		}else if (orientacion.contentEquals("Vertical")) {
			if (barco.equals(portaAviones)) {
				
				for(int i = 0; i<4;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					x=x+1;
				}
			}else if (barco.equals(destructor1) || barco.equals(destructro2) || 
					barco.equals(desctructor3)) {
				
				for(int i = 0; i<2;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					x=x+1;
				}
			}else if (barco.equals(fragata1) || barco.equals(fragata2)) {
				
				for(int i = 0; i<1;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					x=x+1;
				}
			}else if (barco.equals(submarino1) || barco.equals(submarino2) || 
					barco.equals(submarino3)) {
				
				for(int i = 0; i<3;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					x=x+1;
				}
			}
		}
		return coordenadas;
	}
	

}
