package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class Main extends Application{

	
	private Scene sc = new ListaScene(this);
	public void start(Stage primaryStage){
		
		primaryStage.setTitle("Tarea");
        primaryStage.setScene(sc);
        primaryStage.show();
		
	}
	
	
		public static void main(String[] args){
			launch(args);
		}
}


