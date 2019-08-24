package presentation;

public class TypeOfFigure {
	
	//Use un enum para el caso de que haya más figuras, la capa de presentación quede de manera automática
	public enum figuras{
		
		cuadrado("Cuadrado"),
		circulo("Círculo"),
		rectangulo("Rectángulo"),
		equilatero("Equilátero"),
		isoceles("Isóceles"),
		escaleno("Escaleno"),
		ninguna("Ninguna");
		
		//Use private final para crear una variable constante, asi su valor no puede ser modificado
		private final String textRepresentation;
		//Constructor con la representación en pantalla del enum
	    private figuras(String textRepresentation) {
	        this.textRepresentation = textRepresentation;
	    }
	    //Se sobreescribe el metodo toString para poder presentar el enum como un String
	    @Override public String toString() {
	         return textRepresentation;
	    }
		
	}
	
	//Use un enum para el caso de que haya más operaciones, la capa de presentación quede de manera automática
	public enum operaciones{
		
		area("Área"),
		perimetro("Perímetro"),
		ninguna("Ninguna");
		
		private final String textRepresentation;
		//Constructor con la representación en pantalla del enum
	    private operaciones(String textRepresentation) {
	        this.textRepresentation = textRepresentation;
	    }
	    //Se sobreescribe el metodo toString para poder presentar el enum como un String
	    @Override public String toString() {
	         return textRepresentation;
	    }
		
		
		
	}

}
