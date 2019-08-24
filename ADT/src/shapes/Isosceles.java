package shapes;



public class Isosceles extends Triangle{
	
	private double base;
	private double heightTrian;
	private double side1;

	
	
	public Isosceles(double side1, double base, double heightTrian) {
		this.base = base;
		this.heightTrian=heightTrian;
		this.side1 = side1;
	}
	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return (side1*2) + base;
	}
	
	
	@Override
	public  double calculateArea() {
		double area;
		
		area=(base*heightTrian)/2;
		
		return area;
		
	
}
	


	

}
