package application;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class CONTROLADOR2 implements Initializable {
	
	
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
		tablero.add(portaAviones, 0, 0);
	}
	
	
	
	
	Controller menu;
	
	public void setMenu(Controller menu) {
		
		this.menu = menu;
		
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	

}
