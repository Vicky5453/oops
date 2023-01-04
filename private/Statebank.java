package Encapsulation;

public class Statebank {

	 int minbalance = 1000;
	 String custname;
	
	
	public void deposit() 
	{
		System.out.println("deposit the bank");
	}

	private void withdraw()   // only whithin the class 
	{
		System.out.println("withdraw the atm");
	}
	
	public Statebank()
	{
		System.out.println("hi");
	}

}
