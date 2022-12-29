package oops.basic;

public class Amazon {

	String name;
	int rate, discount;

	public void selectthinks() 
	{
		System.out.println("product name :"+name);
	}

	public void purchase() 
	{
		System.out.println("price :"+rate);
	}

	public void delivery() 
	{
		System.out.println("discount :"+discount);
	}

	public static void main(String[] args) {

	     Amazon prod1 = new  Amazon();
		prod1.name = "t-shirt";     // object specific variables
		prod1.rate = 500;           // definition
		prod1.discount = 10;
		prod1.selectthinks();
		prod1.purchase();
		prod1.delivery();

		 Amazon prod2 = new  Amazon();
		prod2.name = "mobile";
		prod2.rate = 10000;
		prod2.discount = 5;
		prod2.selectthinks();
		prod2.purchase();
		prod2.delivery();

	}

}
