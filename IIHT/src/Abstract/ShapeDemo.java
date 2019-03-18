package Abstract;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
					try {
						file();
					}
				 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		Circle c = new Circle();
		c.setRadius(10);
		System.out.println("Circle Area:" + c.calculateArea());
		
		Square s = new Square();
		s.setLength(20);
		System.out.println("Square Area:" + s.calculateArea());
		
	
	

}

	private static void file() throws IOException {
		// TODO Auto-generated method stub
		FileReader f = new FileReader("abc.txt");
		if(f==null)
			throw new IOException();
	}

	

}