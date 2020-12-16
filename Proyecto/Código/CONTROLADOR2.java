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
import javafx.scene.text.Text;

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
	private ImageView portaAviones_2;
	
	@FXML
	private ImageView submarino1_2;
	
	@FXML
	private ImageView submarino2_2;
	
	@FXML
	private ImageView submarino3_2;
	
	@FXML
	private ImageView destructor1_2;
	
	@FXML
	private ImageView destructro2_2;
	
	@FXML
	private ImageView desctructor3_2;
	
	@FXML
	private ImageView fragata1_2;
	
	@FXML
	private ImageView fragata2_2;
	
	@FXML
	private Text x00_1;
	@FXML
	private Text x01_1;
	@FXML
	private Text x02_1;
	@FXML
	private Text x03_1;
	@FXML
	private Text x04_1;
	@FXML
	private Text x05_1;
	@FXML
	private Text x06_1;
	@FXML
	private Text x07_1;
	@FXML
	private Text x08_1;
	@FXML
	private Text x09_1;
	@FXML
	private Text x10_1;
	@FXML
	private Text x11_1;
	@FXML
	private Text x12_1;
	@FXML
	private Text x13_1;
	@FXML
	private Text x14_1;
	@FXML
	private Text x15_1;
	@FXML
	private Text x16_1;
	@FXML
	private Text x17_1;
	@FXML
	private Text x18_1;
	@FXML
	private Text x19_1;
	@FXML
	private Text x20_1;
	@FXML
	private Text x21_1;
	@FXML
	private Text x22_1;
	@FXML
	private Text x23_1;
	@FXML
	private Text x24_1;
	@FXML
	private Text x25_1;
	@FXML
	private Text x26_1;
	@FXML
	private Text x27_1;
	@FXML
	private Text x28_1;
	@FXML
	private Text x29_1;
	@FXML
	private Text x30_1;
	@FXML
	private Text x31_1;
	@FXML
	private Text x32_1;
	@FXML
	private Text x33_1;
	@FXML
	private Text x34_1;
	@FXML
	private Text x35_1;
	@FXML
	private Text x36_1;
	@FXML
	private Text x37_1;
	@FXML
	private Text x38_1;
	@FXML
	private Text x39_1;
	@FXML
	private Text x40_1;
	@FXML
	private Text x41_1;
	@FXML
	private Text x42_1;
	@FXML
	private Text x43_1;
	@FXML
	private Text x44_1;
	@FXML
	private Text x45_1;
	@FXML
	private Text x46_1;
	@FXML
	private Text x47_1;
	@FXML
	private Text x48_1;
	@FXML
	private Text x49_1;
	@FXML
	private Text x50_1;
	@FXML
	private Text x51_1;
	@FXML
	private Text x52_1;
	@FXML
	private Text x53_1;
	@FXML
	private Text x54_1;
	@FXML
	private Text x55_1;
	@FXML
	private Text x56_1;
	@FXML
	private Text x57_1;
	@FXML
	private Text x58_1;
	@FXML
	private Text x59_1;
	@FXML
	private Text x60_1;
	@FXML
	private Text x61_1;
	@FXML
	private Text x62_1;
	@FXML
	private Text x63_1;
	@FXML
	private Text x64_1;
	@FXML
	private Text x65_1;
	@FXML
	private Text x66_1;
	@FXML
	private Text x67_1;
	@FXML
	private Text x68_1;
	@FXML
	private Text x69_1;
	@FXML
	private Text x70_1;
	@FXML
	private Text x71_1;
	@FXML
	private Text x72_1;
	@FXML
	private Text x73_1;
	@FXML
	private Text x74_1;
	@FXML
	private Text x75_1;
	@FXML
	private Text x76_1;
	@FXML
	private Text x77_1;
	@FXML
	private Text x78_1;
	@FXML
	private Text x79_1;
	@FXML
	private Text x80_1;
	@FXML
	private Text x81_1;
	@FXML
	private Text x82_1;
	@FXML
	private Text x83_1;
	@FXML
	private Text x84_1;
	@FXML
	private Text x85_1;
	@FXML
	private Text x86_1;
	@FXML
	private Text x87_1;
	@FXML
	private Text x88_1;
	@FXML
	private Text x89_1;
	@FXML
	private Text x90_1;
	@FXML
	private Text x91_1;
	@FXML
	private Text x92_1;
	@FXML
	private Text x93_1;
	@FXML
	private Text x94_1;
	@FXML
	private Text x95_1;
	@FXML
	private Text x96_1;
	@FXML
	private Text x97_1;
	@FXML
	private Text x98_1;
	@FXML
	private Text x99_1;
	
	
	@FXML
	private Text x00_2;
	@FXML
	private Text x01_2;
	@FXML
	private Text x02_2;
	@FXML
	private Text x03_2;
	@FXML
	private Text x04_2;
	@FXML
	private Text x05_2;
	@FXML
	private Text x06_2;
	@FXML
	private Text x07_2;
	@FXML
	private Text x08_2;
	@FXML
	private Text x09_2;
	@FXML
	private Text x10_2;
	@FXML
	private Text x11_2;
	@FXML
	private Text x12_2;
	@FXML
	private Text x13_2;
	@FXML
	private Text x14_2;
	@FXML
	private Text x15_2;
	@FXML
	private Text x16_2;
	@FXML
	private Text x17_2;
	@FXML
	private Text x18_2;
	@FXML
	private Text x19_2;
	@FXML
	private Text x20_2;
	@FXML
	private Text x21_2;
	@FXML
	private Text x22_2;
	@FXML
	private Text x23_2;
	@FXML
	private Text x24_2;
	@FXML
	private Text x25_2;
	@FXML
	private Text x26_2;
	@FXML
	private Text x27_2;
	@FXML
	private Text x28_2;
	@FXML
	private Text x29_2;
	@FXML
	private Text x30_2;
	@FXML
	private Text x31_2;
	@FXML
	private Text x32_2;
	@FXML
	private Text x33_2;
	@FXML
	private Text x34_2;
	@FXML
	private Text x35_2;
	@FXML
	private Text x36_2;
	@FXML
	private Text x37_2;
	@FXML
	private Text x38_2;
	@FXML
	private Text x39_2;
	@FXML
	private Text x40_2;
	@FXML
	private Text x41_2;
	@FXML
	private Text x42_2;
	@FXML
	private Text x43_2;
	@FXML
	private Text x44_2;
	@FXML
	private Text x45_2;
	@FXML
	private Text x46_2;
	@FXML
	private Text x47_2;
	@FXML
	private Text x48_2;
	@FXML
	private Text x49_2;
	@FXML
	private Text x50_2;
	@FXML
	private Text x51_2;
	@FXML
	private Text x52_2;
	@FXML
	private Text x53_2;
	@FXML
	private Text x54_2;
	@FXML
	private Text x55_2;
	@FXML
	private Text x56_2;
	@FXML
	private Text x57_2;
	@FXML
	private Text x58_2;
	@FXML
	private Text x59_2;
	@FXML
	private Text x60_2;
	@FXML
	private Text x61_2;
	@FXML
	private Text x62_2;
	@FXML
	private Text x63_2;
	@FXML
	private Text x64_2;
	@FXML
	private Text x65_2;
	@FXML
	private Text x66_2;
	@FXML
	private Text x67_2;
	@FXML
	private Text x68_2;
	@FXML
	private Text x69_2;
	@FXML
	private Text x70_2;
	@FXML
	private Text x71_2;
	@FXML
	private Text x72_2;
	@FXML
	private Text x73_2;
	@FXML
	private Text x74_2;
	@FXML
	private Text x75_2;
	@FXML
	private Text x76_2;
	@FXML
	private Text x77_2;
	@FXML
	private Text x78_2;
	@FXML
	private Text x79_2;
	@FXML
	private Text x80_2;
	@FXML
	private Text x81_2;
	@FXML
	private Text x82_2;
	@FXML
	private Text x83_2;
	@FXML
	private Text x84_2;
	@FXML
	private Text x85_2;
	@FXML
	private Text x86_2;
	@FXML
	private Text x87_2;
	@FXML
	private Text x88_2;
	@FXML
	private Text x89_2;
	@FXML
	private Text x90_2;
	@FXML
	private Text x91_2;
	@FXML
	private Text x92_2;
	@FXML
	private Text x93_2;
	@FXML
	private Text x94_2;
	@FXML
	private Text x95_2;
	@FXML
	private Text x96_2;
	@FXML
	private Text x97_2;
	@FXML
	private Text x98_2;
	@FXML
	private Text x99_2;
	
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
