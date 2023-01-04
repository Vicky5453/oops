package Returntype;

public class Bike {

	static String bikebrand = "honda unicorn";
	static int model = 2017;

	public int mileage() 
	{
		System.out.println("bad mileage");
		return 40;
	}

	public static void main(String[] args) {

		System.out.println(bikebrand);
		System.out.println(model);

		Bike bike = new Bike();
		int km = bike.mileage();
		System.out.println(km);

	}

}
