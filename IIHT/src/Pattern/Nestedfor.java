package Pattern;

import java.util.Scanner;

public class Nestedfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter row");
		int r = s.nextInt();
		System.out.println("Enter columns");
		int c = s.nextInt();
	for(int i=1; i<r; i++)
	{
		for(int j = 1; j<=r-i; j++) {
			
			System.out.println("");
		}
		
		for(int j = 1; j<=2*i-i; j++)
		{
	System.out.println("*");
	}
		System.out.println();
	}
}
}
	
