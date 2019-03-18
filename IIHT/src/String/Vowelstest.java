package String;

import java.util.Scanner;

public class Vowelstest {
	
	public static void main(String[] str) {
		// TODO Auto-generated method stub

		
		 System.out.println("Please enter the sentence");
	     Scanner s = new Scanner(System.in);
	     String a = s.next();
		 int noofvowels = 0;
		 
		 char[] vowels = {'a','e','i','o','u'};

	        for(int i = 0; i < a.length(); ++i)
	        {
	            char ch = a.charAt(i);
	            for(int j = 0; j < vowels.length; ++j)
	            {
	                if(ch==Vowels()) {
	                	noofvowels = noofvowels + 1;
	                }
	            }
	
	         
	        
	}
	        
	}

	private static int Vowels() {
		int noofvowels = 0;
		// TODO Auto-generated method stub
		return noofvowels;
	}

	

	
}	 
     

