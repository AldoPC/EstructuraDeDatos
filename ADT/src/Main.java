

import presentation.LayerPresentation;
import presentation.TypeOfFigure.figuras;
import presentation.TypeOfFigure.operaciones;
import shapes.Shape;



public class Main {
	
	public static void main(String args[]) {
		figuras selectedFigure;
		
		//En este while, mientras tu sigas eligiendo una figura, te seguira preguntando por una, pero en caso de poner ninguna, te dejara de preguntar por una figura
		do {
			//Se le llama al metodo askForFigure para preguntar por una figura
			selectedFigure= LayerPresentation.askForFigure();
			//Este if sirve para que en caso de elegir ninguna como tu primera opcion, se salga del programa y no haga los demas metodos
			if (selectedFigure != figuras.ninguna) {
				
			//Shape recibe la figura del metodo askForData
			Shape shape = LayerPresentation.askForData(selectedFigure);
			
			//Operacion recibe la operacion de askForOperation
			operaciones operacion = LayerPresentation.askForOperation();
			
			//Se imprime el resultado con printResult
			LayerPresentation.printResult(shape, operacion);
			}
			
		}while(selectedFigure != figuras.ninguna);
		
			
	//Mensaje de despedida al finalizar el programa
	LayerPresentation.goodbyeMessage();

		
	}
}
	

