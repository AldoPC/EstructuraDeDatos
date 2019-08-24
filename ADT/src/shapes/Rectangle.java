package shapes;

public class Rectangle extends Shape{
	
	private double width;
	private double heightRec;
	//Constructor del rectangulo
	public Rectangle(double width, double heightRec) {
		super();
		this.width = width;
		this.heightRec = heightRec;
	}

	//El metood del cual se encarga de calcular el area, antes de el metodo se pone @Override ya que se esta sobreescribiendo el metodo abstracto de ShapeOperations
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return heightRec*width;
	}

	//El metood del cual se encarga de calcular el perimetro, antes de el metodo se pone @Override ya que se esta sobreescribiendo el metodo abstracto de ShapeOperations
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (heightRec*2)+(width*2);
	}

}
