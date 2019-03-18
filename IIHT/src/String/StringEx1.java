package String;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String str = "1a2b3c";
				count(str);
	}
				public static void count(String x){
					char[] ch = x.toCharArray();
					int letter = 0;
					int num = 0;
				 
				for(int i=0; i<x.length(); i++) {
			            
					if(Character.isLetter(ch[i])){
						letter ++ ;
					}
					else if(Character.isDigit(ch[i])){
						num ++ ;
			        }
			}
				System.out.println("letter: " + letter);
				System.out.println("number: " + num);

		}
	}

