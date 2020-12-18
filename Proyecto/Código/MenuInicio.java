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


public class MenuInicio implements Initializable {
	
	private Stage juego;
	
	MenuInicio menu;
	
	@FXML
	private ImageView fondo;
	
	@FXML
	private Button nuevaPartida;
	
	@FXML
	private Button nuevaPartida1;

	@FXML
	private void nuevaPartida(ActionEvent evento) {
		
	}
	//presenta la interfaz correspondiente a juego nuevo
	@FXML
    void crearPartida(ActionEvent evento) {

        try {
        	//Establece la escena de colocar barcos y juego 
            FXMLLoader ventanaNuevaPartida = new FXMLLoader(getClass().getResource("Juego.fxml"));
            Parent root = (Parent) ventanaNuevaPartida.load();
            Juego escenaJuego = (Juego) ventanaNuevaPartida.getController();
            escenaJuego.setMenu(menu);
            Stage primaryStage = new Stage();
            primaryStage.setTitle("Battleship");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
            
            this.juego = primaryStage;
            
            
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            System.out.println("1");
        }



    }
	
	
	public Stage getJuego() {
		return juego;
	}


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        menu = this;

    }
    
    
    

}
