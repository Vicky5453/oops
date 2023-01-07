package methodOverloading;

public class Kitchen1 {

	String name;
	int experiance;

	public String preparefood(String b) {
		return (b + " is like a food");
	}

	public String preparefood(String b, int c) // overload
	{
		return (b + " like a food and " + c + " members");
	}

	public String preparefood(String t, String b, int c, boolean nonveg) // overload
	{
		if (nonveg == true) {
			return (t + " morning food " + b + " like a food " + c + " members " + "nonveg");
		} else {
			return (t + " morning food " + b + " like a food " + c + " members " + "veg");
		}
	}

	public String preparefood(int a, String b) // overload
	{
		return (a + " members" + " likely food " + b);
	}

	public static void main(String[] args) {

		Kitchen1 chef = new Kitchen1();
		String cook1 = chef.preparefood("biryani");
		System.out.println(cook1);
		cook1 = chef.preparefood("biryani", 5);
		System.out.println(cook1);
		cook1 = chef.preparefood("tiffin", "biryani", 5, true);
		System.out.println(cook1);
		cook1 = chef.preparefood(5, "biryani");
		System.out.println(cook1);

	}

}
