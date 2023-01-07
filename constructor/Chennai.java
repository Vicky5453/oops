package constructor;

public class Chennai {
	
	String name;

	public Chennai()   // default constructor
	{
		System.out.println("good infrastructure");
	}
	public Chennai(String s)      // constructor overload 
	{
		name=s;
		System.out.println(name);
	}

	public static void main (String [] args)
	{
		Chennai c = new Chennai();
		Chennai c1 = new Chennai("polution");
	}
}
