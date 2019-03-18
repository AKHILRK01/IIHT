package Account;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Account Details");
		System.out.println("Please enter the name");
		String name = s.next();
		System.out.println("Please enter the address");
		String address = s.next();
		System.out.println("Please enter the age");
		int age = s.nextInt();
		System.out.println("Please enter the accountno");
		long accNum = s.nextLong();
		System.out.println("Please enter the balance");
		double balance = s.nextDouble();

		AccountDemo a = new AccountDemo();
		a.setName(name);
		a.setAddress(address);
		a.setAge(age);
		a.setAccountno(accNum);
		a.setBalance(balance);
		a.getPersonAccountDetails();
		
	}

	private void getPersonAccountDetails() {
		// TODO Auto-generated method stub
		
	}

	private void setBalance(double balance) {
		// TODO Auto-generated method stub
		
	}

	private void setAccountno(long accNum) {
		// TODO Auto-generated method stub
		
	}

	private void setAge(int age) {
		// TODO Auto-generated method stub
		
	}

	private void setAddress(String address) {
		// TODO Auto-generated method stub
		
	}

	private void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	

	
}
