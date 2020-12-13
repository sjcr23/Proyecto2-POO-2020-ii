package application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;


public class Controller implements Initializable {
	
	Controller menu;
	
	@FXML
	private ImageView fondo;
	
	@FXML
	private Button nuevaPartida;
	
	@FXML
	private Button nuevaPartida1;

	@FXML
	private void nuevaPartida(ActionEvent evento) {
		
	}
	
	@FXML
	void crearPartida(ActionEvent evento) {

		try {

			Parent root = FXMLLoader.load(getClass().getResource("SeleccionarBarco.fxml"));

			Stage primaryStage = new Stage();
			primaryStage.setTitle("Battleship");
			primaryStage.setScene(new Scene(root, 750, 600));
			primaryStage.show();
			

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		
		
		
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		menu = this;
		
	}

}
