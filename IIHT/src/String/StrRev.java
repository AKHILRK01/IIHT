package String;

import java.util.Scanner;

public class StrRev {

public static void main(String[] args)
	
	{
		
		String str="IIHT"; String reverse="";
	
		System.out.println("string befor ereverse:"+str);
	
	for(int i = str.length()-1;i>=0;i--) {
		reverse+=  str.charAt(i);
	}
	str=reverse;
	System.out.println("Reversed String is:");
		System.out.println(str);
	
	
	}
}
