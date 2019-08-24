package shapes;

public class Square extends Shape{
	
	private double side;
	//Contructor del Cuadrado
	public Square(double side) {
		super();
		this.side = side;
	}

	//El metood del cual se encarga de calcular el area, antes de el metodo se pone @Override ya que se esta sobreescribiendo el metodo abstracto de ShapeOperations
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	//El metood del cual se encarga de calcular el perimetro, antes de el metodo se pone @Override ya que se esta sobreescribiendo el metodo abstracto de ShapeOperations
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

}
