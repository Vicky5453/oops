package methodOverride;

public class NormalHeadset extends BoatHeadset{      // method override

	public static void main(String[] args) {

		NormalHeadset nh = new NormalHeadset();
		nh.noise();
		nh.connection();
		nh.damage();
		BoatHeadset bo = new NormalHeadset();     // dynamic binding 
		bo.noise();
		bo.connection();
		
	}
	
	@Override 
	public void noise()
	{
		System.out.println("bad noice");
	}
	
	@Override 
	public void connection()
	{
		System.out.println("wired connection");
	}
	
	public void damage()
	{
		System.out.println("damaged wired connection");
	}

}
