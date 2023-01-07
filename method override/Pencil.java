package methodOverride;

public class Pencil extends Pen {       // method override 

	public static void main(String[] args) {
		
		Pencil p = new Pencil();
		p.write("natraj");       // pass parameter
		p.erase("ground");       // pass parameter
		Pen pe = new Pencil();   // dynamic binding
		pe.write("apsara");
		pe.erase("paper");

	}
	
	@Override
	public void write(String s)     // same arguments 
	{
		System.out.println("ground writting brand name "+s);
	}
	
	@Override
	public void erase(String s)     // same arguments 
	{
		System.out.println("erase the "+s);
	}
	
	public void again()        // child class method and not access the parent class 
	{
		System.out.println("again sharp the nip");
	}

}
