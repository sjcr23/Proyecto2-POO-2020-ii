package application;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
    	//carga la intefaz de inicio
        Parent root = FXMLLoader.load(getClass().getResource("MenuInicio.fxml"));
        //establece el nombre del encabezado
        primaryStage.setTitle("Battleship");
        // establece el tamaño
        Scene scene = new Scene(root, 750, 600);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
	
}
