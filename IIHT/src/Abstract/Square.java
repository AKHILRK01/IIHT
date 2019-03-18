package Abstract;

public class Square extends ShapeTest {
	
	private double length;
	public double getLength() {
	return length;
	}
	
	public void setLength(double length)
	
	{
		this.length = length;
	}
	@Override
	public  double calculateArea(){
		
		double area = 0;
		area = this.length*this.length;
		return area;
	}
}
