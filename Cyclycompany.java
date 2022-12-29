package oops.basic;

public class Cyclycompany {
	String name;
	int price, discount;
	int count;

	public void selectcycle() {
		System.out.println("product name :"+name);
	}

	public void sell() {
		System.out.println("discount the price :"+(price-discount));
	}

	public void update() {
		count=count-1;
		System.out.println("balance cycles :"+count	);
	}

	public static void main(String[] args) {

		Cyclycompany prod1 = new  Cyclycompany();
		prod1.name = "normal cycle";     // object specific variables
		prod1.price = 50;           // definition
		prod1.discount =5;
		prod1.count=10;
		prod1.selectcycle();
		prod1.sell();
		prod1.update();

		Cyclycompany prod2 = new  Cyclycompany();
		prod2.name = "Gear cycle";
		prod2.price = 100;
		prod2.discount = 15;
		prod2.count=12;
		prod2.selectcycle();
		prod2.sell();
		prod2.update();

}
}

