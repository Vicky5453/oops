package oops.basic;

public class Showroom {
      static String companyname="honda"; 
      static int model=125;
	
	public void service ()
	{
		System.out.println("service the bike");
	}
	public void clean ()
	{
		System.out.println("clean the bike");
	}
	public void delivery ()
	{
		System.out.println("delivery the bike");
	}
	static void painting()   // static method 
	{
		System.out.println("painting all bikes");
	}
	public static void main(String[] args) {
	   
		 Showroom vk = new  Showroom();
		
		 System.out.println( Showroom.companyname);
		 System.out.println( Showroom.model);
		 vk.service();
		 vk.clean();
		 vk.delivery();
		 Showroom.painting();   // class name keep calling
		 
		 
		
	}

}
