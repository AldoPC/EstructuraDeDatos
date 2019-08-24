package shapes;


public class Equilateral extends Triangle{
	
	private double base;
	private double heightTrian;


	
	
	public Equilateral(double base, double heightTrian) {
		this.base = base;
		this.heightTrian=heightTrian;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return base*3;
	}
	
	@Override
	public double calculateArea() {
		
		return (base*heightTrian)/2;
		
	
}
	
	
	
	
	

}
