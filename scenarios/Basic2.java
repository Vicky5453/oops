package scenario;

public class Basic2 {

	static int i=1;
	
	static
	{
		i=i-- +--i;
	}
	
	{
		i=i++ - ++i;
	}
	
	int methodOfTest()
	{
		return i+i-i*i/i;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(new Basic2().methodOfTest());

	}

}
