package application;
//bibliotecas a utilizar
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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Juego implements Initializable {
	
	MenuInicio menu;
	//Atributos
	private Jugador jugador1;
	
	private Jugador jugador2;
	
	private Tablero matriz1;
	
	private Tablero matriz2;
	
	private boolean viabilidad;
	
	int turno;
	
	int bandera;
	
	//Elementos de la interfaz
	@FXML
	private Button guardarPartida;
	
	@FXML
	private Button guardarPosicion;
	
	@FXML
	private Button atacar1;
	
	@FXML
	private Button atacar2;
	
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
	private GridPane tablero1;
	
	@FXML
	private GridPane tablero2;
	
	@FXML
	public void colocarBarcos(ActionEvent eventos) {
		//turno para el primer jugador 
		if(turno == 0) {
			ponerImagen(tablero1,botonBarco, EjeX, EjeY, posicion, matriz1, jugador1);
		}
		//Turno para el segundo jugador 
		else {
			ponerImagen(tablero2, botonBarco2, EjeX1, EjeY1, posicion1, matriz2, jugador2);
		}
	}
	
	//Función encargada de rotar la imagenes en el caso de que sea necesario cmdiar su orientacion original
	public ImageView rotarFicha(ImageView barco) {
		//Gira 90 grados la imagen 
		barco.setRotate(barco.getRotate() + 90);
		//Se ubica según e ltipo de barco en la sasilla 
		if(barco.equals(portaAviones) || barco.equals(portaAviones_2)) {
			barco.setTranslateX(-45);
			barco.setTranslateY(45);

			return barco;
			
		}
		
		else if(barco.equals(submarino1) || barco.equals(submarino2) || 
				barco.equals(submarino3) || barco.equals(submarino1_2) || barco.equals(submarino2_2) || 
				barco.equals(submarino3_2)) {
			
			barco.setTranslateX(-30);
			barco.setTranslateY(30);
			return barco;
		}
		
		else if(barco.equals(destructor1) || barco.equals(destructro2) || 
				barco.equals(desctructor3) || barco.equals(destructor1_2) || barco.equals(destructro2_2) || 
				barco.equals(desctructor3_2)) {
			
			
			barco.setTranslateX(-15);
			barco.setTranslateY(15);
			return barco;
			
		}
		
		return barco;
	}
	

	
	/*Retorna una lista con listas que contienen las coordenadas que ocuparia 
	  el barco que se esta colocando*/
	public ArrayList<ArrayList<Integer>> obtenerCoordenadas(int x, int y, String orientacion, ImageView barco) {
		ArrayList<ArrayList<Integer>> coordenadas = new ArrayList<ArrayList<Integer>>();
		//Caso de imagenes en posición horizontal 
		if (orientacion.contentEquals("Horizontal")) {
			//Condiciona el tipo de barco, ya que cada uno tien una talla distinta 
			if (barco.equals(portaAviones) || barco.equals(portaAviones_2)) {
				//Calcula las coordenadas de las casillas que va a ocupar el barco 
				for(int i = 0; i<4;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					y=y+1;
				}
			}
		
			//Condiciona el tipo de barco, ya que cada uno tien una talla distinta 
			else if (barco.equals(destructor1) || barco.equals(destructro2) || 
					barco.equals(desctructor3) || barco.equals(destructor1_2) || barco.equals(destructro2_2) || 
					barco.equals(desctructor3_2)) {
				//Calcula las coordenadas de las casillas que va a ocupar el barco
					for(int i = 0; i<2;i=i+1) {
						ArrayList<Integer> coordenada = new ArrayList<Integer>();
						coordenada.add(x);
						coordenada.add(y);
						coordenadas.add(coordenada);
					
						y=y+1;
					}
			}
			//Condiciona el tipo de barco, ya que cada uno tien una talla distinta 
			else if (barco.equals(fragata1) || barco.equals(fragata2) || barco.equals(fragata1_2) 
						|| barco.equals(fragata2_2)) {
				//Calcula las coordenadas de las casillas que va a ocupar el barco
				for(int i = 0; i<1;i=i+1) {
					
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					y=y+1;
				
				}
			}
			//Condiciona el tipo de barco, ya que cada uno tien una talla distinta 
			else if (barco.equals(submarino1) || barco.equals(submarino2) || 
				barco.equals(submarino3) || barco.equals(submarino1_2) || barco.equals(submarino2_2) || 
				barco.equals(submarino3_2)) {
				//Calcula las coordenadas de las casillas que va a ocupar el barco
				for(int i = 0; i<3;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					y=y+1;
				}
			}
			
		}
		
		
		else if (orientacion.contentEquals("Vertical")) {
			//Condiciona el tipo de barco, ya que cada uno tien una talla distinta 
			if (barco.equals(portaAviones) || barco.equals(portaAviones_2)) {
				//Calcula las coordenadas de las casillas que va a ocupar el barco
				for(int i = 0; i<4;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					x=x+1;
				}
			}
			//Condiciona el tipo de barco, ya que cada uno tien una talla distinta 
			else if (barco.equals(destructor1) || barco.equals(destructro2) || 
					barco.equals(desctructor3) || barco.equals(destructor1_2) || barco.equals(destructro2_2) || 
					barco.equals(desctructor3_2)) {
				//Calcula las coordenadas de las casillas que va a ocupar el barco
				for(int i = 0; i<2;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					x=x+1;
				}
			}
			//Condiciona el tipo de barco, ya que cada uno tien una talla distinta 
			else if (barco.equals(fragata1) || barco.equals(fragata2) || barco.equals(fragata1_2) 
					|| barco.equals(fragata2_2)) {
				//Calcula las coordenadas de las casillas que va a ocupar el barco
				for(int i = 0; i<1;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					x=x+1;
				}
			}
			//Condiciona el tipo de barco, ya que cada uno tien una talla distinta 
			else if (barco.equals(submarino1) || barco.equals(submarino2) || 
					barco.equals(submarino3) || barco.equals(submarino1_2) || barco.equals(submarino2_2) || 
					barco.equals(submarino3_2)) {
				//Calcula las coordenadas de las casillas que va a ocupar el barco
				for(int i = 0; i<3;i=i+1) {
					ArrayList<Integer> coordenada = new ArrayList<Integer>();
					coordenada.add(x);
					coordenada.add(y);
					coordenadas.add(coordenada);
					
					x=x+1;
				}
			}
			
		}
		//Esta es la lista que contiene las listas de las coordendas que va a ocupar 
		return coordenadas;
	}
	/* Función oficial encargada de colocar las figuras.
	 * Recibe como argumento todos los combobox provenientes de la intefaz */
	public void ponerImagen(GridPane tablero, ComboBox<ImageView> botonBarco, ComboBox<String> EjeX,
		ComboBox<String> EjeY, ComboBox<String> posicion, Tablero matriz, Jugador jugador) {
		//Lista que contien todas las casillas y sus datos 
		ArrayList<Casilla> Casillas = matriz.getCasillas();
		Casilla casilla;
		//Asigna los valores que provienen del comboBox
		ImageView barcoSeleccionado = botonBarco.getSelectionModel().getSelectedItem();
		// Convierte en un entero los valores obtenidos del comboBox 
		int ejex = Integer.parseInt(EjeX.getSelectionModel().getSelectedItem().toString())-1;
		int ejey = Integer.parseInt(EjeY.getSelectionModel().getSelectedItem().toString())-1;
		String orientacion = posicion.getSelectionModel().getSelectedItem().toString();
		//lista que recibe como resultado el valor de retorno de la función "obtenerCoordenadas"
		ArrayList<ArrayList<Integer>> CoordenadasOcupadas = obtenerCoordenadas(ejey, ejex, orientacion, barcoSeleccionado);
		// Atributo Booleano que permite verificar la viabilidad de la inserción de la imagen
		viabilidad = posicionViable(ejey, ejex, orientacion, barcoSeleccionado);
		//Condicional de viabilidad de la inserción 
		if (viabilidad == false) {
			System.out.println("El barco no cabe en esa casilla");
		}else {
			// Condicional de orientación 
			if(orientacion.equals("Vertical")) {
				
				rotarFicha(barcoSeleccionado);
		
			}
			//Para cada una de las casillas del tablero 
			for(int i=0; i<100; i=i+1) {
				//Toma una casilla específica
				casilla = Casillas.get(i);
				//Para cada una de las coordenadas que ocupa el barco.
				for(int k = 0; k< CoordenadasOcupadas.size();k=k+1) {
					//Si, uno de los elementos de la lista de coordenadas corresponde a la casilla actual.	
					if(casilla.getCoordenadas().toString().equals(CoordenadasOcupadas.get(k).toString())) {
						//Verifica el estado para evitar poner un barco en una posición que ya esté ocupada.
						if(casilla.isEstado()) {
							//Al ser este el caso de la inserción de una barco en posición vertical, se realiza la rotación
							if(barcoSeleccionado.getRotate() == 90) {
								barcoSeleccionado.setRotate(barcoSeleccionado.getRotate() - 90);
							}
							//En caso de que la casilla ya esté ocupada
							barcoSeleccionado.setTranslateX(0);
							barcoSeleccionado.setTranslateY(0);
							System.out.println("Ya hay un barco");
							return;
						}
						else {
							//Se coloca el barco y se imprimen sus coordenadas
							System.out.println("=========================");
							botonBarco.getItems().remove(barcoSeleccionado);
							casilla.setEstado(); casilla.setTipo();
							jugador.setBarcos(casilla);
							System.out.println(casilla.getCoordenadas().toString() + " " + casilla.getTipo());	
						}
					}	
				}
			}
			
			bandera++;
			//Se agrega al tablero el movimiento. 
			tablero.add(barcoSeleccionado, ejex, ejey);
			barcoSeleccionado.toBack();
			
			//Cambia el proceso de colocasión de barcos al segundo judador 
			if(bandera == 9 && turno == 0) {
	
				botonBarco2.setDisable(false); botonBarco2.setOpacity(1);
				
				botonBarco.setDisable(true); botonBarco.setOpacity(0);
				
				portaAviones.setOpacity(0);
				submarino1.setOpacity(0); submarino2.setOpacity(0); submarino3.setOpacity(0);
				fragata1.setOpacity(0); fragata2.setOpacity(0);
				destructor1.setOpacity(0); destructro2.setOpacity(0); desctructor3.setOpacity(0);
				guardarPosicion.setDisable(true); guardarPosicion.setOpacity(0);
				
				posicion.setDisable(true); posicion.setOpacity(0);
				
				this.turno = 1;
				
				return;
			}
			//Culmina el proceso de inserción. 
			if(bandera == 18) {
				//Esconde los elementos de interfaz que no se van necesitar el siguiente proceso
				atacar1.setOpacity(1); botonBarco.setDisable(true); botonBarco.setOpacity(0);
				
				guardarPosicion1.setDisable(true); guardarPosicion1.setOpacity(0);
				portaAviones_2.setOpacity(0);
				submarino1_2.setOpacity(0); submarino2_2.setOpacity(0); submarino3_2.setOpacity(0);
				fragata1_2.setOpacity(0); fragata2_2.setOpacity(0);
				destructor1_2.setOpacity(0); destructro2_2.setOpacity(0); desctructor3_2.setOpacity(0);
				
				this.guardarPosicion1.setDisable(true); this.guardarPosicion1.setOpacity(0);
				
				posicion.setDisable(true); posicion.setOpacity(0);
				
				this.turno = 0;
				
				return;
	
	
			}
		}
		
	}
	
	
	
	//Proceso coordinación del ataque y sus turnos
	@FXML
	public void Atacar() {
		if(turno == 0) {
			//Convierte los atributos de entrada
			int ejex = Integer.parseInt(EjeX.getSelectionModel().getSelectedItem().toString())-1;
			int ejey = Integer.parseInt(EjeY.getSelectionModel().getSelectedItem().toString())-1;
			//Ejecuta el turno del jugador 2 
			turno = jugador1.Atacar(ejex, ejey, matriz2, tablero2, turno);
			
			if(turno == 1) {
				return;
			}
			//Esconde el boton de atacar para el jugador que ya hizo su movimiento
			atacar1.setOpacity(0);
			atacar2.setOpacity(1);
			
			//Confirma si el jugador ya ganó
			if(jugador2.verificarPerdida() == 21) {
				System.out.println("gano1");
				cerrarJuego();
				
			}
			
			return;
		}
		
		int ejex = Integer.parseInt(EjeX1.getSelectionModel().getSelectedItem().toString())-1;
		int ejey = Integer.parseInt(EjeY1.getSelectionModel().getSelectedItem().toString())-1;
		//Ejecuta el turno del jugador 1
		turno = jugador2.Atacar(ejex, ejey, matriz1, tablero1, turno);
		
		if(turno == 0) {
			return;
		}
		//Esconde el boton de atacar para el jugador que ya hizo su movimiento
		atacar2.setOpacity(0);
		atacar1.setOpacity(1);

		//Confirma si el jugador ya ganó
		if(jugador1.verificarPerdida() == 21) {
		System.out.println("gano2");
		cerrarJuego();
			
		}
		return;
	}
	
	
	//Termina la ejecuion del juego
	public void cerrarJuego() {
		menu.getJuego().close();
		
	}
	
	public void setMenu(MenuInicio menu) {
		
		this.menu = menu;
		
	}
	

	
	//Se encarga de adjudicar los valores necesarios para el funcionamiento del controlador 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
		turno = 0;
		 
		jugador1 = new Jugador(matriz1);
		jugador2 = new Jugador(matriz2);
		
		
		ObservableList<ImageView> barcosJugador = FXCollections.observableArrayList(portaAviones
				,submarino1,submarino2,
				submarino3,destructor1,destructro2,desctructor3,fragata1,fragata2);
		
		botonBarco.setItems(barcosJugador);

		
		
		ObservableList<ImageView> barcosJugador1 = FXCollections.observableArrayList(portaAviones_2
				,submarino1_2,submarino2_2,
				submarino3_2,destructor1_2,destructro2_2,desctructor3_2,fragata1_2,fragata2_2);
		
		botonBarco2.setItems(barcosJugador1);
		botonBarco2.setDisable(true);botonBarco2.setOpacity(0);
		
		
		
		ObservableList<String> ejes = FXCollections.observableArrayList("1", "2", "3","4", "5", "6", "7", "8", "9","10");
		EjeX.setItems(ejes); EjeY.setItems(ejes);
		EjeX1.setItems(ejes); EjeY1.setItems(ejes);
		


		ObservableList<String> orientacion = FXCollections.observableArrayList("Horizontal", "Vertical");
		posicion.setItems(orientacion); posicion1.setItems(orientacion);
		
		this.matriz1 = new Tablero();
		matriz1.setCoordenadas();
		
		this.matriz2 = new Tablero();
		matriz2.setCoordenadas();
		
	}
	//Verifica si colocar un elemento en dicha posición es factible y queda dentro del GridPane
	public boolean posicionViable(int x, int y, String orientacion, ImageView barco) {
		//Verifica que la posición seleccionada por el usario sea menor al limite respectivo al tipo de barco
		if (orientacion.contentEquals("Horizontal")) {
			if ((barco.equals(portaAviones) || barco.equals(portaAviones_2)) && y >=7) {
				return false;
		
			
			}else if ((barco.equals(destructor1) || barco.equals(destructro2) || 
					barco.equals(desctructor3) || barco.equals(destructor1_2) || barco.equals(destructro2_2) || 
					barco.equals(desctructor3_2)) && y >= 9) {
					return false;
			}
		
			else if (barco.equals(fragata1) || barco.equals(fragata2) || barco.equals(fragata1_2) 
						|| barco.equals(fragata2_2)) {
				
				return true;
			}
			
			else if ((barco.equals(submarino1) || barco.equals(submarino2) || 
				barco.equals(submarino3) || barco.equals(submarino1_2) || barco.equals(submarino2_2) || 
				barco.equals(submarino3_2)) && y >= 8) {
				
				return false;
			}
			
		}
		
		
		else if (orientacion.contentEquals("Vertical")) {
			if ((barco.equals(portaAviones) || barco.equals(portaAviones_2)) && x >= 7) {
				return false;
			}
			else if ((barco.equals(destructor1) || barco.equals(destructro2) || 
					barco.equals(desctructor3) || barco.equals(destructor1_2) || barco.equals(destructro2_2) || 
					barco.equals(desctructor3_2)) && x >= 9) {
				
				return false;
			}
			else if (barco.equals(fragata1) || barco.equals(fragata2) || barco.equals(fragata1_2) 
					|| barco.equals(fragata2_2)) {
				
				return true;
			}
			else if ((barco.equals(submarino1) || barco.equals(submarino2) || 
					barco.equals(submarino3) || barco.equals(submarino1_2) || barco.equals(submarino2_2) || 
					barco.equals(submarino3_2)) && x >= 8) {
				
				return false;
			}

			
		}
		return true;
	}
}	


