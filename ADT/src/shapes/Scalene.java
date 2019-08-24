package shapes;


public class Scalene extends Triangle{
	
	private double base;
	private double heightTrian;
	private double side1;
	private double side2;
	
	public Scalene(double side1, double side2, double base, double heightTrian) {
		this.base = base;
		this.heightTrian=heightTrian;
		this.side1 = side1;
		this.side2 = side2;
	}
	@Override
	public  double calculatePerimeter() {
		// TODO Auto-generated method stub
		return side1 + side2 + base;
	}
	
	@Override
	public  double calculateArea() {
		double area;
		
		area=(base*heightTrian)/2;
		
		return area;
		
	
}
	
}
