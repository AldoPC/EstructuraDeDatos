package application;

import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class ListaScene extends Scene{
	
	public HBox root;
    private ListaLigada<String> listaLigada ;
		
		public ListaScene(Main main){
			super(new HBox());
			root=(HBox)super.getRoot();
			
			listaLigada = new ListaLigada<>();
			
			
			TextField leerCalificacion = new TextField();
			TextField leerMatricula = new TextField();
			TextField leerNombre = new TextField();
			ListView<String> lista = new ListView<>();

			
			EventHandler<ActionEvent> registrarMetodo = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 
	            	String calificacionLeido = leerCalificacion.getText();
        			String nombreLeido = leerNombre.getText();
        			String matriculaLeido = leerMatricula.getText();
        			listaLigada.setLista(lista);
		              listaLigada.insertarAlInicio(Integer.parseInt(calificacionLeido), nombreLeido, matriculaLeido);
		              
		              listaLigada.imprimeLista();
		              leerCalificacion.clear();
		              leerNombre.clear();
		              leerMatricula.clear();
	            } 
	        }; 
	        
	        EventHandler<ActionEvent> ordenarMetodo = new EventHandler<ActionEvent>() { 
	            public void handle(ActionEvent e) 
	            { 
	            	listaLigada.mergeEstudiante(listaLigada.getInicial());
		            listaLigada.imprimeLista();
	            } 
	        }; 
			
			
			VBox left = new VBox();
			left.setPadding(new Insets(10, 0, 0, 0));
			left.setAlignment(Pos.CENTER);
			left.setSpacing(10);
			
			
			
			Label nombre = new Label("Nombre");
			nombre.setStyle("");
			left.getChildren().add(nombre);
			
			leerNombre.setStyle("");
			left.getChildren().add(leerNombre);
			Label matricula = new Label("Matrícula");
			matricula.setStyle("");
			left.getChildren().add(matricula);

			leerMatricula.setStyle("");
			left.getChildren().add(leerMatricula);
			Label calificacion = new Label("Calificación");
			calificacion.setStyle("");
			left.getChildren().add(calificacion);
			leerCalificacion.setStyle("");
			left.getChildren().add(leerCalificacion);
			Button button1 = new Button("Registrar");
			button1.setStyle("");
			button1.setOnAction(registrarMetodo);	
			left.getChildren().add(button1);
	        Button button2 = new Button("Ordenar");
	        button2.setStyle("");
	        button2.setOnAction(ordenarMetodo);	
	        left.getChildren().add(button2);
			
	        
	        HBox right = new HBox();
	        lista.setPrefWidth(600);
	        HBox.setHgrow(lista, Priority.ALWAYS);
	        
	        right.getChildren().add(lista);
	        
	        HBox root = new HBox(left,right);
	        
	        root.setSpacing(0);
	       
	       super.setRoot(root); 
	        
			
	       
	       
	       
		}
		



}


