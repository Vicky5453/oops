package Returntype;

public class Calculator {
	static String name = "casio";

	public static void main(String[] args) {
		
		System.out.println("calculator name :"+ name);
		 
	//	Calculator calci = new Calculator();
		System.out.println(new Calculator().add());  // anonymous object

	}
	public int add()
	{
		return (15+10);
	}

}
