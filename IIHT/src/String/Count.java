package String;

public class Count {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

						String str = "1a2b3c";
						count(str);
			}
						public static void count(String str){
							int digit = 0;
							int alpha = 0;
							char[] ch= str.toCharArray();
						 
						for(int i=0; i<str.length(); i++) {
					            
							if(Character.isDigit(ch[i]))
									{
								digit= digit+1;
									}
								else 
								{
									alpha=alpha+1;
								}
							
									continue;
									
							}
						
					
						System.out.println("Digits: " + digit);
						System.out.println("Alphabets: " + alpha);
						
				}
			}


	