package Sort;

import java.util.ArrayList;
import java.util.Collections;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("shiva");
		a1.add("akhil");
		a1.add("arpita");
		a1.add("legato");
		
	
		System.out.println("Before Sorting");
		for(int i=0; i<a1.size();i++) 
		{
			System.out.println(a1.get(i));	
		}
	
		//Collections.reverse(a1);
		Collections.sort(a1);
		
		System.out.println("After Sorting");
		for(int i=0; i<a1.size();i++) 
		{
			
		System.out.println(a1.get(i));		
		
		}
	}
}

/*Sorting array List
for(int i=0; i<a.size();i++) {
	for(int j =0; j<a.size()-1-i;j++) {
		if(a.get(j)>a.get(j+1)) {
			temp=a.get(j);
			a.set(j,a.get(j+1));
			a.set(j+1,temp);*/
		
