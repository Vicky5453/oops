package methodOverride;

public class Pen {                  // method override 

	public static void main(String[] args) {
		
		Pen p = new Pen();
		p.write("apsara");     // pass parameter
		p.erase("paper");      // pass parameter

	}
	
	public void write(String s)      // same arguments 
	{
		System.out.println("writting the paper and brand name "+s);
	}
	
	public void erase(String s)      // same arguments 
	{
		System.out.println("not erase "+s);
	}

}
