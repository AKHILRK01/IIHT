package Animal;

import java.util.Scanner;

public class AnimalTest {
	private static Animal[] arr;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
Scanner	s = new Scanner(System.in);;
int count = s.nextInt();
System.out.println("Enter the no of objects");
Animal[] a = new Animal[count];
for(int i=0; i<count; i++)
{
System.out.println("Please enter the animal name");
String name = s.next();
System.out.println("Please enter the animal breed");
String breed = s.next();
System.out.println("Please enter the animal age");
int age = s.nextInt();

Animal a1 = new Animal();
a1.setName(name);
a1.setBreed(breed);
a1.setAge(age);
a[i]=a1;
a1.getAnimalLifestyle();

	}
	for(int i=0;i<a.length;i++){
		System.out.println(a[i].getName());}
	}
}


