package shapes;

public class Circle extends Shape{
	
	private double radius;
	//Constructor del circulo
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	//El metood del cual se encarga de calcular el area, antes de el metodo se pone @Override ya que se esta sobreescribiendo el metodo abstracto de ShapeOperations
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI*(radius*radius);
	}

	//El metood del cual se encarga de calcular el perimetro, antes de el metodo se pone @Override ya que se esta sobreescribiendo el metodo abstracto de ShapeOperations
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
	
	

}
