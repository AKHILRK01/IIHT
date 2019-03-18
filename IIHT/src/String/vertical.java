package String;

import java.util.Scanner;

public class vertical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String u = s.nextLine();
		
		 
		for(int i=0; i<u.length(); i++) {
	            
			char letter=u.charAt(i);
	            System.out.println(letter);
	        }
	}

}
