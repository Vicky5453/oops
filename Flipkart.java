package oops.basic;

public class Flipkart {
	String name = "remote car";
	int rate = 500, discount = 10;

	public void selectthinks() 
	{
		System.out.println(name);
	}

	public void purchase() 
	{
		System.out.println(rate);
	}

	public void delivery() 
	{
		System.out.println(discount);
	}

	public static void main(String[] args) {

		Flipkart prod1 = new Flipkart();

		prod1.selectthinks();
		prod1.purchase();
		prod1.delivery();

	
	}

}
