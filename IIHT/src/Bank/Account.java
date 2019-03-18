package Bank;

public class Account {

	private static long accNumber;
	private double balance;
	private Person accHolder;
	public static int counter = 1001;
	
	
	public String toString()
	{
		return "accNumber"+accNumber+"balance"+balance;
	}
	public static long getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(long accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	public static long setCounter(int counter) {
		return Account.counter = counter;
	}
	
	Account()
	{
	counter++;
	}
	public static long getCounter() {
		// TODO Auto-generated method stub
		return getAccNumber();
	}

	
}
