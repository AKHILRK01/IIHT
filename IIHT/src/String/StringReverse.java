package String;

import java.util.Scanner;

public class StringReverse {

	
	public static void main(String[] args)
	
	{
		
		String str, reverse="";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the string");
		
		str= s.next();
		
	System.out.println("string:"+str);
	
	for(int i = str.length()-1;i>=0;i--)
		reverse=reverse+str.charAt(i);
	System.out.println("Reversed String is:");
		System.out.println(reverse);
	
	
	}
}
