package Returntype;

public class Bank {       // method overloading

	public static void main(String[] args) {

		Bank manager = new Bank();
		double balance = manager.calculateinterest(100000);
		System.out.println(balance);
		balance = manager.calculateinterest(100000, 5);
		System.out.println(balance);
		balance = manager.calculateinterest(1000, 12, 6.0f);
		System.out.println(balance);
	}

	public double calculateinterest(int amount) 
	{
		float interest = 4.5f;
		double value = amount * interest / 100;
		return value;
	}

	public double calculateinterest(int amount, int year) 
	{
		float interest = 4.5f;
		double value = amount * interest / 100 * year;
		return value;
	}

	public double calculateinterest(int a, int b, float c) 
	{

		double value = a * b * c / 100;

		return value;

	}
}
