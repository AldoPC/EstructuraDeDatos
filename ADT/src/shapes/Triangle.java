package shapes;



import shapes.Shape;

public abstract class Triangle extends Shape{


	//Constructor del triangulo
	
	public Triangle() {
	}
	
	public Triangle(double side1, double side2, double base, double heightTrian) {
		
		
	}
	
	public Triangle(double base, double heightTrian) {
		
		
	}
	
	public Triangle(double side1, double base, double heightTrian) {
		
		
	}

	
	

	//El metood del cual se encarga de calcular el area, antes de el metodo se pone @Override ya que se esta sobreescribiendo el metodo abstracto de ShapeOperations
	public abstract double calculateArea();
	
	//El metood del cual se encarga de calcular el perimetro, antes de el metodo se pone @Override ya que se esta sobreescribiendo el metodo abstracto de ShapeOperations
	public abstract double calculatePerimeter();
	
	
	
	
}