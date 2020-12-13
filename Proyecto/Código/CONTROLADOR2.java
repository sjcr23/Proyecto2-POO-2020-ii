package application;

import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CONTROLADOR2 implements Initializable {
	

	@FXML
	private Button guardarPosicion;
	
	@FXML
	private ComboBox<ImageView> botonBarco;
	
	@FXML
	private ComboBox<String> EjeX;
	
	@FXML
	private ComboBox<String> EjeY;
	
	@FXML
	private ComboBox<String> posicion;
	
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
	private GridPane tablero;
	
	public ImageView rotarFicha(ImageView barco) {
		barco.setRotate(barco.getRotate() + 90);
		
		if(barco.equals(portaAviones)) {
			barco.setTranslateY(30);
			barco.setTranslateX(-30);
			return barco;
			
		}
		
		else if(barco.equals(submarino1) || barco.equals(submarino2) || 
					barco.equals(submarino3)) {
			
			barco.setTranslateX(-15);
			barco.setTranslateY(15);
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
	public void ponerImagen(ActionEvent eventoS) {
		ImageView barcoSeleccionado = botonBarco.getSelectionModel().getSelectedItem();
		botonBarco.getItems().remove(barcoSeleccionado);
		int ejex = Integer.parseInt(EjeX.getSelectionModel().getSelectedItem().toString())-1;
		int ejey = Integer.parseInt(EjeY.getSelectionModel().getSelectedItem().toString())-1;
		String orientacion = posicion.getSelectionModel().getSelectedItem().toString();
		
		
		if(orientacion.equals("Vertical")) {
			
			rotarFicha(barcoSeleccionado);
	
		}
		
		
		tablero.add(barcoSeleccionado, ejex, ejey);
		barcoSeleccionado.toBack();
		
		
		if(botonBarco.getItems().isEmpty()) {
			generarBarcos();
		}
	}
	
	public GridPane getTablero() {
		return tablero;
	}
	
	
	Controller menu;
	
	public void setMenu(Controller menu) {
		
		this.menu = menu;
		
	}
	

	public void generarBarcos(){
		
		ObservableList<ImageView> barcosJugador = FXCollections.observableArrayList(portaAviones,submarino1,submarino2,
				submarino3,destructor1,destructro2,desctructor3,fragata1,fragata2);
		botonBarco.setItems(barcosJugador);
		

	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		generarBarcos();
		
		
		ObservableList<String> ejes = FXCollections.observableArrayList("1", "2", "3","4", "5", "6", "7", "8", "9","10");
		EjeX.setItems(ejes);
		EjeY.setItems(ejes);
		


		ObservableList<String> orientacion = FXCollections.observableArrayList("Horizontal", "Vertical");
		posicion.setItems(orientacion);
	}
	
	

}
