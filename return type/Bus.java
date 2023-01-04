package Returntype;

public class Bus {

	public String ticket() 
	{
		System.out.println("got a ticket");
		return "3 rupees";
	}

	public void save(String balance) 
	{
		System.out.println("save in wallet :" + balance);
	}

	public static void main(String[] args) {

		Bus b = new Bus();
		String money = b.ticket();
		System.out.println(money);
		b.save(money);

	}

}
