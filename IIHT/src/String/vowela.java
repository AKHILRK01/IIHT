package String;

public class vowela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String line = "Nanu Nandu annore udhaaraa agodu";
	        int vowels = 0;

	        for(int i = 0; i < line.length(); ++i)
	        {
	            char ch = line.charAt(i);
	            if(ch == 'a' || ch == 'e' || ch == 'i'
	                || ch == 'o' || ch == 'u')
	            {
	                ++vowels;
	            }
	
	         }
	        

	        System.out.println("Vowels: " + vowels);
	}

}
