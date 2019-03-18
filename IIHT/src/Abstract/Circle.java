package Abstract;

public class Circle extends ShapeTest{

	private double radius;
	
	public double getRadius() {
	return radius;
	}

	public void setRadius(double radius)
	
	{
		this.radius = radius;
	
	}
	@Override
	public double calculateArea() {
		
		double area = 0;
		area = 3.14*this.radius*this.radius;
		return area;
	}
	
	
	
}
