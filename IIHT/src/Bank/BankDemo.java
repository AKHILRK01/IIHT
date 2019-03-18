package Bank;

//import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		p1.setName("smith");
		p1.setAge(44);
		
	
		{
		Account a1 = new Account();
		a1.setAccHolder(p1);
		a1.setBalance(2000);
		a1.setAccNumber(Account.getCounter());
		System.out.println(a1);
		System.out.println(Account.getAccNumber());
		}
		
		Person p2 = new Person();
		p2.setName("Eathy");
		p2.setAge(40);

		Account a2 = new Account();
		a2.setAccHolder(p2);
		a2.setBalance(3000);
		a2.setAccNumber(Account.getCounter());
		System.out.println(a2);
		System.out.println(Account.getAccNumber());
		}
	}



