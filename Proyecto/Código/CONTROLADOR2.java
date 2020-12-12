package application;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CONTROLADOR2 implements Initializable {
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

	@FXML
	public void ponerImagen() {
		ImageView barcoSeleccionado = botonBarco.getSelectionModel().getSelectedItem();
		int ejex = Integer.parseInt(EjeX.getSelectionModel().getSelectedItem().toString());
		int ejey = Integer.parseInt(EjeY.getSelectionModel().getSelectedItem().toString());
		String orientacion = posicion.getSelectionModel().getSelectedItem().toString();
		
	}
	
	
	
	
	Controller menu;
	
	public void setMenu(Controller menu) {
		
		this.menu = menu;
		
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		ObservableList<ImageView> barcos = FXCollections.observableArrayList(portaAviones,submarino1,submarino2,
				submarino3,destructor1,destructro2,desctructor3,fragata1,fragata2);
		botonBarco.setItems(barcos);
		
		ObservableList<String> ejes = FXCollections.observableArrayList("1", "2", "3","4", "5", "6", "7", "8", "9","10");
		EjeX.setItems(ejes);
		EjeY.setItems(ejes);
		


		ObservableList<String> orientacion = FXCollections.observableArrayList("Horizontal", "Vertical");
		posicion.setItems(orientacion);
	}
	
	

}
