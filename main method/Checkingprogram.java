package mainMethod;

public class Checkingprogram {

	public static void main(String[] args) {   // first preference 
		
		System.out.println(" i am a main method ");
		Checkingprogram.on();

	}
	
	public static void main()
	{
		System.out.println(" i am a overloaded main method ");
	}
	
	public static void on()
	{
		System.out.println(" normal method");
	}

}
