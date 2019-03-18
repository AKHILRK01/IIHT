package String;

public class ArrayRev {
	

    public static void main(String[] args) {  
                int arr[] ={3,60,35,2,45,320,5};         
                 
                System.out.println("Array Before Reversing");  
                for(int i=0; i < arr.length/2; i++){ 
                	
                	int temp = 0;
					arr[i]=arr[i-1];
					arr[i-1]=temp;
					temp=arr[i];
					
                	
                        System.out.print(arr[i] + " ");  
                }  
                
                System.out.println();  
                  
      
                System.out.println("Array After reverse");  
                for(int i = arr.length-1;i>=0;i--){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  

}
