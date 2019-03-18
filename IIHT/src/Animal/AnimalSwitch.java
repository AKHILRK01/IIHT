package Animal;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AnimalSwitch {

	private static String name;
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Animal arr[]=null;
		
		while(true)
		{
		System.out.println("Enter 1 for new objects \n " + "2 for display \n" + "3 for exit");
		
		int option = s.nextInt();
		
		switch(option) 
		{
		case 1:
			arr=addAnimals(arr);
		break;
		case 2:
			displayAnimals(arr);
		break;
		case 3:
			System.exit(0);
		break;
		default:
		System.out.println("Enter the correct option");
		}
			
	}

}
public static Animal[] addAnimals(Animal[] arr)	
{
Scanner	s = new Scanner(System.in);
System.out.println("Enter the no of objects created");
int count = s.nextInt();
arr = new Animal[count];

for(int i=0; i<count;i++)
{
System.out.println("Please enter the animal name");
String name = s.next();

while(!validateName(name))
{
	System.out.println("Name can have only chars");
	System.out.println("Please enter the name again");
	name=s.next();
	int noofAttempts = 3;
	noofAttempts++;
	if(noofAttempts>=3)
		System.out.println("You exceeded maximum no of attemps");
	noofAttempts=0;
	System.exit(0);
}
	
System.out.println("Please enter the animal breed");
String breed = s.next();
System.out.println("Please enter the animal age");
int age = s.nextInt();

Animal a1 = new Animal();
System.out.println("Total no of animals="+Animal.getcount());
a1.setName(name);
a1.setBreed(breed);
a1.setAge(age);
arr[i]=a1;
}
return arr;
}


public static void displayAnimals(Animal[] arr)
{
	System.out.println("the array is"+arr);
	
	if(arr!=null)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		}
	else
	{
		System.out.println("no of objects to be displayed");
	}
}

public static boolean validateName(String name){
	if(Pattern.matches("^[A-Za-z]+$", name))
	return true;
	else
		return false;
}

public void Reverse()
{
	String reverse = "";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
		}
			System.out.println("reverse string ia");
			System.out.println(reverse);
}
}
