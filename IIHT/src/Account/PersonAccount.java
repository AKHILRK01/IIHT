package Account;

public class PersonAccount {

	private String name;
	private int age;
	private String address;
	private long accNum;
	private double balance;

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getAge() {
	return age;
}


public void setAge(int age) {
	this.age = age;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public long getAccNum() {
	return accNum;
}


public void setAccNum(long accNum) {
	this.accNum = accNum;
}


public double getBalance() {
	return balance;
}


public void setBalance(double balance) {
	this.balance = balance;
}

void getPersonAccountDetails()
{
	System.out.println("name"+this.name+"address"+this.address+"accNum"+this.accNum+"age"+this.age+"balance"+this.balance);
}
}