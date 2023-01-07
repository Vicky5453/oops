package constructor;

public class Kitchen {
	String name;
	int experiance;
	String thinks;

	public Kitchen(String a, int b) // constructor overload
	{
		name = a;
		experiance = b;
		System.out.println("welcome " + name + "!");
		System.out.println(experiance + " month of cooking experiance");
	}
	public Kitchen(String s)
	{
		thinks=s;
		System.out.println("important thinks for "+s);
	}

	public static void main(String[] args) {
           
            Kitchen k = new Kitchen("thalapathy",10);
            Kitchen k1 = new Kitchen("salt");
	}

}
