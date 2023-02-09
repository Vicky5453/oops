package scenario;

public class Basic1 {
	
	int num = 100;
	
	public void prog(int num)
	{
		this.num=num*10;
	}
	
	public void printnum()
	{
		System.out.println(num);
	}

	public static void main(String[] args) {
		
		Basic1 b = new Basic1();
		b.prog(2);
		b.printnum();
		

	}

}
